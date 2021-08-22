class TicTacToe2 {
    public void Game() {
        int[] board = new int[10];
        int b=board.length;
        System.out.println(b);
        board[0] = 0;
        System.out.println("0"+" "+board[0]);
        for (int i = 1; i <board.length; i++) {
            board[i] = 3;
            System.out.println(i+" "+board[i]);
        }
    }
}


public class UseCase1 {
    public static void main(String[] args) {
        System.out.println("Hello from the Other Side");
        TicTacToe2 obj = new TicTacToe2();
        obj.Game();
    }
}



