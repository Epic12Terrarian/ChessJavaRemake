import java.util.Arrays;

public class App {
    public static String[][] board = new String[10][10];
    
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                board[i][j] = " ";
            }
        }

        System.out.println("|" + board[3][2] + "|");

    }
    public static void buildBoard() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
