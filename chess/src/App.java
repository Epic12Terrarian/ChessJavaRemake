import java.util.Arrays;

public class App {
    public static String[][] board = new String[10][10];
    
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++){ //this loop is used to fill the board file so I can display it later and not need to worry about anything being undefined
            for(int j = 0; j < 10; j++){
                board[i][j] = " ";
            }
        }

        System.out.println("Text in console to make sure this file is still functional");
        

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
