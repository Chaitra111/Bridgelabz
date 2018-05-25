package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : TicTacToe game
 */
public class TicTacToe 
{
	static final  int X=0;
	static final int Y=-1;
	private int player;
	
	 public static void main(String[ ] args)
     {
         TicTacGame t = new TicTacGame();
         Utility u=new Utility();
         int x=0,y=0;
         do
         {
             System.out.println(t.player==t.X?"Player X turn":"Player O turn");
             System.out.println("Enter x and y places");
             x=u.getInteger();
             y=u.getInteger();
             t.putsign(x, y);
             System.out.println(t.toString());
             System.out.println(" ");
             t.displayWinner();         
         }while(t.isempty);
     }
}

class TicTacGame
 {
     static final int X = 1, O = -1;
     static final int empty = 0;
     int player = X;
     int[][] board = new int[3][3];
     boolean isempty = false;
       
     /** Puts an X or O mark at position i,j. */
     public void putsign(int x, int y)
     {
         if(x<0 || x>2 || y<0 || y>2)
         {
             System.out.println("Invalid board position");
             return;
         }
         if(board[x][y] != empty)
         {
             System.out.println("Board position occupied");
             return;
         }
         board[x][y] = player;   // place the mark for the current player
         player = -player;       // switch players (uses fact that O = - X)
     }
       
     /** Checks whether the board configuration is a win for the given player. */
     public boolean win(int player)
     {
         return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                 (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                 (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                 (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                 (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                 (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                 (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                 (board[2][0] + board[1][1] + board[0][2] == player*3));
     }
       
     /**display the winning player or indicate a tie (or unfinished game).*/
     public void displayWinner()
     {
         if(win(X))
         {
             System.out.println("\n X wins...!!");
             isempty=false;
         }
         else if(win(O))
         {
             System.out.println("\n O wins...!!");
             isempty=false;
         }
         else
         {
             if(!isempty)
             {
                 System.out.println("its a tie");
             }  
         }
     }      
     public String toString()
     {
         StringBuilder s = new StringBuilder();
         isempty = false;
         for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;j++)
             {
                 switch(board[i][j])
                 {
                 case X:
                     s.append(" X ");
                     break;
                 case O:
                     s.append(" O ");
                     break;
                 case empty:
                     s.append("   ");
                     isempty=true;
                     break;
                 }
                 if(j<2)
                 {
                     s.append("|");
                 }
            }
             if(i<2)
             {
                 s.append("\n-----------\n");
             }
         }
         return s.toString();
     } 
}


