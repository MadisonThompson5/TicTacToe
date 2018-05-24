package assignment6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Tic Tac toe game between computer and user
 * @author madisonthompson
 *
 */
public class driver {
	private static Scanner reader;

	/**
	 * runs Tic Tac Toe game
	 * @param args
	 */
	public static void main(String[] args){

		int i = 0;
		reader = new Scanner(System.in); 
		System.out.println("Would you like to make the first or second move (1 or 2): ");
	    int turn = reader.nextInt(); 
		gameboard gb = new gameboard(turn);
	    gb.printGameboard();

		while ( i != 1) {
			
				if( turn ==1)
				{
				    int winner = gb.checkforWinner();
				    int draw = gb.checkDraw();
				    if ( draw == 1)
				    {
						System.out.println("Draw! ");
						i = 1;
						return;
				    		
				    }

				    if( winner == 2) {
						System.out.println("You Won! ");
						i=1;
						return;
					}
					if( winner == 3) {
						System.out.println("Computer Won! ");
						i=1;
						return;
						}
				    if (winner == 1) {
				    	System.out.println("Enter row value (1,2,or 3): ");
					    int row = reader.nextInt(); 
						System.out.println("Enter column value (1,2,or 3): ");
					    int col = reader.nextInt();
					    
				    	try {
					    gb.addMove(row-1, col-1);
					    gb.printGameboard();
					    turn = 2;
				    }
				    	catch( IndexOutOfBoundsException e) {
				    		System.out.println("Enter valid input");
				    		
				    	}
					

				    }
				}
				 if( turn ==2)
				{
					 int draw2 = gb.checkDraw();
					 if ( draw2 == 1)
					    {
							System.out.println("Draw! ");
							i = 1;
							return;
					    }
					int winner2 = gb.checkforWinner();
					if( winner2 == 3)
					{
						System.out.println("Computer Won! ");
						i=1;
						return;
					}
					if( winner2 == 2)
					{
						System.out.println("You Won! ");
						i=1;
						return;
					}
				    if (winner2 == 1) {
				    	List<Integer> move = new ArrayList<Integer>();
				    	move = gb.chosenMove();
					    gb.addMove(move.get(0), move.get(1));
					    gb.printGameboard();
					    turn = 1;
				    }
				    
							 
					
				}

			    
			    
			
			
		}
	
	}
	
}
