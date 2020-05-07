package Main;


import static TTT.Code.*;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    printBoard();
        Play();
    }
}
