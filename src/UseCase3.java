import java.util.Objects;
import java.util.Scanner;
//
//    public static void choose(){
//        //Choose either 'X' or 'O'
//        System.out.println("Choose either 'X' or 'O' ");
//        Scanner sc = new Scanner(System.in);
//        String player = sc.next();
//        System.out.println("User entered input is: "+player);
//
//    }

//}
//class pat{
//    public static void paint(){
//        for(int i=1; i<=3; i++) {
//            for(int j =1; j<=3; j++){
//                System.out.print("__"+" ");
//            }
//            System.out.println("");
//        }
//    }
//}


//public class UseCase2 {
//    public static void main(String[] args) {
//        System.out.println("Hello from the Other Side");
//        TicTacToe3 obj = new TicTacToe3();
//        pat paint = new pat();
//        obj.Game();
//        pat.paint();

//        int x=3;
//        obj.pattern();
//           TicTacToe3.choose();
//
//
//    }
//}


//UseCase 1

class TicTacToe4 {
    public void Toss(){
        //Toss to See who will play First
        System.out.println("Cointoss between User and CPU");
        double coinToss = (Math.floor(Math.random()*10)%2);
        if (coinToss==0) {
            System.out.println("User Win!!! User will Start the Game");
            System.out.println("Select the value(X or O) ");
            Scanner py = new Scanner(System.in);
            String user = py.next();
            System.out.println("User Selected: " + user);
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
    public void Game() {
        String[] board = new String[10];
        int s = 9;
        while (s > 0) {
            s--;
            System.out.println("Choose the Position from 1 to 9 ");
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            //Input
            System.out.println("Enter the value(X or O) ");
            Scanner scc = new Scanner(System.in);
            String user = scc.next();
            board[k] = user;
            System.out.println("Position "+k+"Value "+user);
        }
    }
//        for (int i = 1; i < board.length; i++) {
//            for (int m = 1; m <= 3; m++) {
//                for (int n = 1; n <= 3; n++) {
////                    System.out.print("__"+" ");
//                    // Variable k is used for Position Purpose
//                    System.out.println("Choose the Position frm 1 to 9 ");
//                    Scanner sc = new Scanner(System.in);
//                    int k = sc.nextInt();
//                    i = k;
//                    System.out.println("Enter the value(X or O) ");
//                    Scanner scc = new Scanner(System.in);
//                    String user = scc.next();
//                    System.out.println(i + " " + user);
//                    board[i] = user;
//                }
//                System.out.println("");
//            }
//        }
//    }
    public void showBoard(){
        System.out.println("Tic Tac Toe Game Board: ");
        for(int m=1; m<=3; m++) {
            for(int n =1; n<=3; n++){
                System.out.print("__"+" ");
            }
            System.out.println("");
        }
    }

}

public class UseCase3 {
    public static void main(String[] args) {
        System.out.println("Welcome to play Tic Tac Toe Game: ");
        TicTacToe3 obj = new TicTacToe3();
        obj.Toss();
//        obj.showBoard();
        obj.Game();



    }
}