import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    static String[] board;
    static String turn;

    public void Toss() {
        //Toss to See who will play First
        System.out.println("Cointoss between User and CPU");
        double coinToss = (Math.floor(Math.random()*10)%2);
        if (coinToss==0) {
            System.out.println("User Win!!! User will Start the Game");
            System.out.println("Select the value(X or O) ");
            Scanner py = new Scanner(System.in);
            String user = py.next();
            System.out.println("User Selected: " + user);
            turn=user;
            if (Objects.equals(user, "X")) {
                String cp = "O";
                System.out.println("CPU gets: " + cp);
            }
            else {
                String cp = "X";
                System.out.println("CPU gets: " + cp);
            }
        }
        else if(coinToss==1){
            System.out.println("CPU Win!!! CPU will Start the Game");
            System.out.println("Select the value(X or O) ");
            Scanner cp = new Scanner(System.in);
            String CPU= cp.next();
            System.out.println("CPU Selected: "+ CPU);
            turn=CPU;
            if (Objects.equals(CPU, "X")) {
                String user = "O";
                System.out.println("User gets: " + user);
            }
            else {
                String user = "X";
                System.out.println("User gets: " + user);
            }
        }
    }
    static String checkWinner()
    {
        for (int a = 1; a < 9; a++) {
            String line = null;

            switch (a) {
                case 1:
                    line = board[1] + board[2] + board[3];
                    break;
                case 2:
                    line = board[4] + board[5] + board[6];
                    break;
                case 3:
                    line = board[7] + board[8] + board[9];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[3] + board[6] + board[9];
                    break;
                case 7:
                    line = board[1] + board[5] + board[9];
                    break;
                case 8:
                    line = board[3] + board[5] + board[7];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
//                return "X";
                return "CPU Wins";
            }

            // For O winner
            else if (line.equals("OOO")) {
//                return "O";
                return "User Wins";
            }
        }

        for (int a = 1; a < 10; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a))) {
                break;
            }
            else if (a == 9) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        System.out.println(
                turn + "'s turn; enter a slot number to place "
                        + turn + " in:");
        return null;
    }


    static void showBoard() {
        System.out.println(" " + board[1] + " " + board[2] + " " + board[3]);
        System.out.println(" " + board[4] + " " + board[5] + " " + board[6]);
        System.out.println(" " + board[7] + " " + board[8] + " " + board[9]);
    }

    public static void main(String[] args) {
        {
            String winner = null;
            Scanner sc = new Scanner(System.in);
//            Scanner obj = new Scanner(System.in);
            board = new String[10];
            for (int a = 1; a < 10; a++) {
                board[a] = String.valueOf(a);
            }

            System.out.println("Welcome to 3x3 Tic Tac Toe.");
            TicTacToe obj = new TicTacToe();
            obj.Toss();
            showBoard();
            System.out.println(turn+" will play first. Enter a slot number to place " +turn+ " in: ");
            while (winner == null) {
                int numInput;
                try {
                    numInput = sc.nextInt();
                    if (!(numInput > 0 && numInput <= 9)) {
                        System.out.println(
                                "Invalid input; re-enter slot number:");
                        continue;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
                if (board[numInput].equals(
                        String.valueOf(numInput))) {
                    board[numInput] = turn;

                    if (turn.equals("X")) {
                        turn = "O";
                    }
                    else {
                        turn = "X";
                    }

                    showBoard();
                    winner = checkWinner();
                }
                else {
                    System.out.println(
                            "Slot already taken; re-enter slot number:");
                }
            }

            if (winner.equalsIgnoreCase("draw")) {
                System.out.println(
                        "It's a draw! Thanks for playing.");
            }

            else {
                System.out.println(
                        "Congratulations! " + winner + " Thanks for playing.");
            }
        }
    }
}
