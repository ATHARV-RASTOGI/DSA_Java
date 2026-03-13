package Recursion;

public class Nqueens{
    public static void main(String[] args) {
        boolean[][]board=new boolean[4][4];
        System.out.println(queens(board, 0));
    }


    static int queens(boolean[][]board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and cheking for every row and col
        for(int col=0;col<board[0].length;col++){
            if(isSafe(board,row,col)){
                //true means already placed 
                board[row][col]=true;
                count+=queens(board,row+1);
                // false means it has not been placed of it can be placed 
                board[row][col]=false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // TODO Auto-generated method stub

    //cheking the vertical
        for(int i=0;i<row;i++){
            if(board[i][col]==true){
                return false;
            }
        }
        
    //cheking digonal-left
        int maxleft=Math.min(row,col);
        for (int i = 0; i <= maxleft; i++) {
            if(board[row-i][col-i]==true){
                return false;
            }
            
        }
    //chekiing diagonal-right
        int maxRight=Math.min(row,board.length-col-1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i]==true){
                return false;
            }
            
        }
        return true;
    }
    private static void display(boolean[][] board) {
        // TODO Auto-generated method stub
        for(boolean[] row :board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");

                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}