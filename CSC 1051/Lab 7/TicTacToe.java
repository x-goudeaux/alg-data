//-------------------------------------
// TicTacToe.java   Author: Xavier Goudeaux
//
//-------------------------------------
import java.util.Scanner;

public class TicTacToe{
    // The tic tac toe playing board
    private static char[][] board = new char[3][3];

    public static void main(String[] args){
        System.out.println("Let's play tic tac toe!");

        initBoard();

        displayBoard();
        
        boolean winner = false; 
        
        while (!winner){
         
            Xmove();
            displayBoard();
            winner = win();
            if(winner)
               break;
            if (tie()){
            
               System.out.println("It's a tie!");
               break;
            }
         
            Omove();
            displayBoard();
            winner = win();
            if(winner)
               break;
            if(tie()){
               System.out.println("It's a tie!");
               break;
            }
         }
         System.out.println("Thanks for playing!");
        

        // fill in your game play code here

    }

    public static void initBoard()
    {
        System.out.println("Initializing the game board...");

        // initialize the board with blank spaces
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard()
    {
        System.out.println();
        System.out.println("  0  " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("    ---+---+---");
        System.out.println("  1  " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("    ---+---+---");
        System.out.println("  2  " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println("     0   1   2 ");
        System.out.println();
    }

    private static void Xmove()
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("Player X plays at location [row column]: ");
      int playrow = scan.nextInt();
      int playcolumn = scan.nextInt();
      board[playrow][playcolumn] = 'X';
      
        
    }

    private static void Omove()
    {
        // implement the Omove method     
      Scanner scan = new Scanner(System.in);
      System.out.print("Player O plays at location [row column]: ");
      int playrow = scan.nextInt();
      int playcolumn = scan.nextInt();
      board[playrow][playcolumn] = 'O'; 
    }

    private static boolean  tie()
    {
        // implement the tie method
        int count = 0; 
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                 if (board[r][c] != ' ' )
                     count++;
        return count == 9;
        
    }

    public static boolean win()
    {
        // check each row
        // write your code here...

        // check each column
        for (int c = 0; c < 3; c++)
        {
            if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] == 'O')
            {
                System.out.println("player O wins!");
                return true;
            }
            if (board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] == 'X')
            {
                System.out.println("player X wins!");
                return true;
            }
        }

        // check from top left to bottom right
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O')
        {
            System.out.println("player O wins!");
            return true;
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'X')
        {
            System.out.println("player X wins!");
            return true;
        }

        // check from top right to bottom left
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'O')
        {
            System.out.println("player O wins!");
            return true;
        }
      
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] == 'X')
        {
            System.out.println("player X wins!");
            return true;
        }

        return false;
    }
}