import java.util.Arrays;

public class App {
    public static String[][] board = new String[10][10];
    
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++){ //this loop is used to fill the board file so I can display it later and not need to worry about anything being undefined
            for(int j = 0; j < 10; j++){
                board[i][j] = " ";
            }
        }
        buildBoard();
        TempPiece Rook = new TempPiece('R', {2,4});
        
        //System.out.println("Text in console to make sure this file is still functional");
        buildBoard();

    }
    public static void buildBoard() {
        System.out.println(board[8][1] + "|" + board[8][2] + "|" + board[8][3] + "|" + board[8][4] + "|" + board[8][5] + "|" + board[8][6] + "|" + board[8][7] + "|" + board[8][8]);
        System.out.println(board[7][1] + "|" + board[7][2] + "|" + board[7][3] + "|" + board[7][4] + "|" + board[7][5] + "|" + board[7][6] + "|" + board[7][7] + "|" + board[7][8]);
        System.out.println(board[6][1] + "|" + board[6][2] + "|" + board[6][3] + "|" + board[6][4] + "|" + board[6][5] + "|" + board[6][6] + "|" + board[6][7] + "|" + board[6][8]);
        System.out.println(board[5][1] + "|" + board[5][2] + "|" + board[5][3] + "|" + board[5][4] + "|" + board[5][5] + "|" + board[5][6] + "|" + board[5][7] + "|" + board[5][8]);
        System.out.println(board[4][1] + "|" + board[4][2] + "|" + board[4][3] + "|" + board[4][4] + "|" + board[4][5] + "|" + board[4][6] + "|" + board[4][7] + "|" + board[4][8]);
        System.out.println(board[3][1] + "|" + board[3][2] + "|" + board[3][3] + "|" + board[3][4] + "|" + board[3][5] + "|" + board[3][6] + "|" + board[3][7] + "|" + board[3][8]);
        System.out.println(board[2][1] + "|" + board[2][2] + "|" + board[2][3] + "|" + board[2][4] + "|" + board[2][5] + "|" + board[2][6] + "|" + board[2][7] + "|" + board[2][8]);
        System.out.println(board[1][1] + "|" + board[1][2] + "|" + board[1][3] + "|" + board[1][4] + "|" + board[1][5] + "|" + board[1][6] + "|" + board[1][7] + "|" + board[1][8]);
    }
}
