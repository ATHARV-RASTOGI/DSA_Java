public class all_paths_backtraking {
    public static void main(String[] args) {
        boolean [][]board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        path_abstraction("", board, 0, 0);
        
    }
    static void path_abstraction (String p,boolean[][] maze,int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){ 
            System.out.println(p);
        }

        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;

        if(r<maze.length-1){
            path_abstraction(p+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            path_abstraction(p+'R',maze, r, c+1);
        }
        if(r>0){
            path_abstraction(p+'U', maze, r-1, c);
        }
        if(c>0){
            path_abstraction(p+'L', maze, r, c-1);
        }
        maze[r][c]=true;
    }
}
