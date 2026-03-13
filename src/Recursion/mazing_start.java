package Recursion;

import java.util.ArrayList;



public class mazing_start {
    public static void main(String[] args) {
        // System.out.println(count(3,4));
        // path_ans("",3,3);
        // System.out.println(ret_path_ans("", 3, 3));
        // System.out.println(Diagonal("", 3, 3));
        boolean [][]board={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        path_abstraction("", board, 0, 0);

    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }
    static void path_ans(String p,int r, int c){
        if(r==1 && c==1){ 
            System.out.println(p);
        }
        if(r>1){
            path_ans(p+'D', r-1, c);
        }
        if(c>1){
            path_ans(p+'R', r, c-1);
        }
    }

    static ArrayList<String> ret_path_ans(String p,int r, int c){
        if(r==1 && c==1){ 
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if(r>1){
            list.addAll(ret_path_ans(p+'D', r-1, c));
        }
        if(c>1){
            list.addAll(ret_path_ans(p+'R', r, c-1));
        }
        return list;
    }

    static ArrayList<String> Diagonal(String p,int r, int c){
        if(r==1 && c==1){ 
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list=new ArrayList<>();

        if(r>1){
            list.addAll(Diagonal(p+'D', r-1, c));
        }
        if(c>1){
            list.addAll(Diagonal(p+'R', r, c-1));
        }
        if(r>1 && c>1){
            list.addAll(Diagonal(p+'V', r-1, c-1));
        }
        return list;
    }

    static void path_abstraction (String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){ 
            System.out.println(p);
        }

        if(maze[r][c]==false){
            return;
        }

        if(r<maze.length-1){
            path_abstraction(p+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            path_abstraction(p+'R',maze, r, c+1);
        }
    }
}
