import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static String[][] board = new String[10][10];
    public static Piece[][] pieceBoard = new Piece[10][10];
    public static boolean gameOngoing = true;
    public static Scanner h = new Scanner(System.in);
    public static Integer[] input = {0,0,0,0};
    public static boolean[] loop = {true};
    
    public static void main(String[] args){
        for(int g = 0; g < 10; g++){ //this loop is also used to fill the board file so I can do background logic with it later and not need to worry about anything being undefined
            for(int f = 0; f < 10; f++){
                pieceBoard[g][f] = new Piece();
            }
        }
        clearBoard();
        pieceBoard[6][8].reConstruct("R", new Integer[]{6,8});
        pieceBoard[5][3].reConstruct("N", new Integer[]{5,3});
        while(gameOngoing){
            buildBoard();
            loop[0] = true;
            
            try {
                System.out.println("Pick a Piece to move.(X)");
                input[0] = h.nextInt();
                System.out.println("Pick a Piece to move.(Y)");
                input[1] = h.nextInt();
                if (input[0] == 0 || input[0] == 9 || input[1] == 0 || input[1] == 9) {
                    throw new Exception();
                }
                if (pieceBoard[input[0]][input[1]].getIsEmptySpace() == true) {
                    throw new Exception();
                }
                else {
                    while (loop[0] == true) {
                        try {
                            System.out.println("Where to move?{X}");
                            input[2] = h.nextInt();
                            System.out.println("Where to move?[Y]");
                            input[3] = h.nextInt();
                            if (pieceBoard[input[0]][input[1]].canMove(new Integer[]{input[2],input[3]}) == true) {
                                movePiece(input[0], input[1], input[2], input[3]);
                                loop[0] = false;
                            } else {
                                throw new Exception();
                            }
                        } catch (Exception e) {
                            System.out.println("Sowwuwu but you can't do dat. Pwease use a coordinate that is vawid.");
                            //System.out.println("We gonna kms with this one too");
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Sowwuwu but you can't do dat. Pwease use a coordinate that is vawid.");
                //System.out.println("We gonna kms with this one too");
                h.nextLine();
            }
            
            
            
        }
        
        
        buildBoard();
        
        
        System.out.println("Text in console to make sure this file is still functional");
        buildBoard();

    }
    public static void clearBoard() {
        for(int i = 0; i < 10; i++){ //this loop is used to fill the board file so I can display it later and not need to worry about anything being undefined
            for(int j = 0; j < 10; j++){
                board[i][j] = " ";
            }
        }
    }
    public static void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        if(pieceBoard[fromRow][fromCol].canMove(new Integer[]{toRow,toCol}) == true){
            pieceBoard[fromRow][fromCol].makeMove(new Integer[]{toRow,toCol});
            
            //board[fromRow][fromCol] = " ";

            Piece temp = pieceBoard[toRow][toCol];
            pieceBoard[toRow][toCol] = pieceBoard[fromRow][fromCol];
            pieceBoard[fromRow][fromCol] = temp;      
        }
    }
    public static void buildBoard() {
        System.out.println("8" + board[1][8] + "|" + board[2][8] + "|" + board[3][8] + "|" + board[4][8] + "|" + board[5][8] + "|" + board[6][8] + "|" + board[7][8] + "|" + board[8][8]);
        System.out.println("7" + board[1][7] + "|" + board[2][7] + "|" + board[3][7] + "|" + board[4][7] + "|" + board[5][7] + "|" + board[6][7] + "|" + board[7][7] + "|" + board[8][7]);
        System.out.println("6" + board[1][6] + "|" + board[2][6] + "|" + board[3][6] + "|" + board[4][6] + "|" + board[5][6] + "|" + board[6][6] + "|" + board[7][6] + "|" + board[8][6]);
        System.out.println("5" + board[1][5] + "|" + board[2][5] + "|" + board[3][5] + "|" + board[4][5] + "|" + board[5][5] + "|" + board[6][5] + "|" + board[7][5] + "|" + board[8][5]);
        System.out.println("4" + board[1][4] + "|" + board[2][4] + "|" + board[3][4] + "|" + board[4][4] + "|" + board[5][4] + "|" + board[6][4] + "|" + board[7][4] + "|" + board[8][4]);
        System.out.println("3" + board[1][3] + "|" + board[2][3] + "|" + board[3][3] + "|" + board[4][3] + "|" + board[5][3] + "|" + board[6][3] + "|" + board[7][3] + "|" + board[8][3]);
        System.out.println("2" + board[1][2] + "|" + board[2][2] + "|" + board[3][2] + "|" + board[4][2] + "|" + board[5][2] + "|" + board[6][2] + "|" + board[7][2] + "|" + board[8][2]);
        System.out.println("1" + board[1][1] + "|" + board[2][1] + "|" + board[3][1] + "|" + board[4][1] + "|" + board[5][1] + "|" + board[6][1] + "|" + board[7][1] + "|" + board[8][1]);
        System.out.println(" 1|2|3|4|5|6|7|8");
    }
}
