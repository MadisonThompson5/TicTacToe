package assignment6;
import java.util.ArrayList;
import java.util.List;

/**
 * Creates Tic Tac Toes gameboard and moves
 * @author madisonthompson
 *
 */
public class gameboard {
	
    static int gb[][]=new int[3][3];
    int player= 2;
    int computer = 3;
    int pORc = 1;
    
	List<Integer> row = new ArrayList<Integer>();
	List<Integer> col = new ArrayList<Integer>();

  /**
   * initializes gameboard for game
   * @param turn
   */
    public gameboard( int turn)
    {
    		if ( turn  == 1)
    			pORc = 2;
    		if ( turn  == 2)
    			pORc = 3;
    		for( int i = 0; i<3; i++)
    		{
    			for( int j = 0 ; j<3; j++)
    			{
    				gb[i][j]= 1;
    			}
    		}
    }
    
    /**
     * gets possible moves on gameboard
     */
    public void possibleMoves()
	{
    		
    		for( int i = 0; i<3; i++)
		{
    			
			for( int j = 0 ; j<3; j++)
			{	
				
		
				if( gb[i][j] == 1 ) {
					row.add(i);
					col.add(j);
				}
				

			}
		}
    		System.out.println(row);
    		System.out.println(col);

	}
    /**
     * adds move to current gameboard
     * @param row
     * @param col
     */
    public void addMove(int row, int col)
    {	
    		if ( pORc ==2 && gb[row][col] != 3)
    		{
    			gb[row][col] = player;
    			pORc= 3;
    		}
    		if ( pORc ==3 && gb[row][col] != 2)

    		{
    			gb[row][col]= computer;
    			pORc= 2;
    		}
    		
    }
    /**
     * checks for blocks of first priority spaces
     * @return the space to block with 
     */
    public static List<Integer> findBlock()
    {
    		List<Integer> block = new ArrayList<Integer>();
    		if( gb[0][0] == 2 && gb[0][2] == 2 && gb[0][1]==1 )
    		{
    			block.add( 0);
    			block.add(1);
    			return block;
    			
    		}
    		if( gb[0][0] == 2 && gb[2][0] == 2 && gb[1][0]==1 )
    		{
    			block.add(1);
    			block.add(0);
    			return block;
    			
    		}
    		if( gb[2][0] == 2 && gb[2][2] == 2 && gb[2][1]==1 )
    		{
    			block.add(2);
    			block.add(1);
    			return block;
    			
    		}
    		if( gb[2][2] == 2 && gb[0][2] == 2 && gb[0][1]==1 )
    		{
    			block.add(2);
    			block.add(1);
    			return block;
    			
    		}
    		
    		
    		return block;
    }
    
    /**
     * checks for blocks of second priority spaces
     * @return the space to block with 
     */
    public static List<Integer> findBlock2()
    {
		List<Integer> block = new ArrayList<Integer>();
    		if( gb[1][1] == 2 && gb[2][2] == 2 && gb[0][0]==1 )
    		{
    			block.add(0);
    			block.add(0);
    			return block;
    			
    		}
    		if( gb[1][1] == 2 && gb[2][0] == 2 && gb[0][2]==1 )
    		{
    			block.add(0);
    			block.add(2);
    			return block;
    			
    		}
    		if( gb[1][1] == 2 && gb[0][0] == 2 && gb[2][2]==1 )
    		{
    			block.add(2);
    			block.add(2);
    			return block;
    			
    		}
    		if( gb[1][1] == 2 && gb[0][2] == 2 && gb[2][0]==1 )
    		{
    			block.add(2);
    			block.add(0);
    			return block;
    			
    		}
    		
    		
    		return block;
    }
    /**
     * checks for blocks of third priority spaces
     * @return the space to block with 
     */
    public static List<Integer> findBlock3()
    {
		List<Integer> block = new ArrayList<Integer>();
    		if( gb[0][0] == 2 && gb[1][0] == 2 && gb[2][0]==1 )
    		{
    			block.add(2);
    			block.add(0);
    			return block;
    			
    		}
    		if( gb[1][0] == 2 && gb[2][0] == 2 && gb[0][0]==1 )
    		{
    			block.add(0);
    			block.add(0);
    			return block;
    			
    		}
    		if( gb[0][0] == 2 && gb[0][1] == 2 && gb[0][2]==1 )
    		{
    			block.add(0);
    			block.add(2);
    			return block;
    			
    		}
    		if( gb[0][1] == 2 && gb[0][2] == 2 && gb[0][0]==1 )
    		{
    			block.add(0);
    			block.add(0);
    			return block;
    			
    		}
    		if( gb[0][1] == 2 && gb[1][1] == 2 && gb[2][1]==1 )
    		{
    			block.add(2);
    			block.add(1);
    			return block;
    			
    		}
    		if( gb[2][1] == 2 && gb[1][1] == 2 && gb[0][1]==1 )
    		{
    			block.add(0);
    			block.add(1);
    			return block;
    			
    		}
    		if( gb[1][0] == 2 && gb[1][1] == 2 && gb[1][2]==1 )
    		{
    			block.add(1);
    			block.add(2);
    			return block;
    			
    		}
    		if( gb[1][2] == 2 && gb[1][1] == 2 && gb[1][0]==1 )
    		{
    			block.add(1);
    			block.add(0);
    			return block;
    			
    		}
    		if( gb[2][0] == 2 && gb[2][1] == 2 && gb[2][2]==1 )
    		{
    			block.add(2);
    			block.add(2);
    			return block;
    			
    		}
    		if( gb[2][2] == 2 && gb[2][1] == 2 && gb[2][0]==1 )
    		{
    			block.add(2);
    			block.add(0);
    			return block;
    			
    		}
    		
    		
    		return block;
    }
    
    /**
     * checks for a winning move
     * @return the winning move
     */
    public static List<Integer> winningMove()
    {
		List<Integer> move = new ArrayList<Integer>();
    		if( gb[0][0] == 3 && gb[0][2] == 3 && gb[0][1]==1 )
    		{
    			move.add(0);
    			move.add(1);
    			return move;
    			
    		}
    		if( gb[0][0] == 3 && gb[2][0] == 3 && gb[1][0]==1 )
    		{
    			move.add(1);
    			move.add(0);
    			return move;
    			
    		}
    		if( gb[2][0] == 3 && gb[2][2] == 3 && gb[2][1]==1 )
    		{
    			move.add(2);
    			move.add(1);
    			return move;
    			
    		}
    		if( gb[2][2] == 3 && gb[0][2] == 3 && gb[0][1]==1 )
    		{
    			move.add(2);
    			move.add(1);
    			return move;
    			
    		}
    		
    		if( gb[1][1] == 3 && gb[2][2] == 3 && gb[0][0]==1 )
    		{
    			move.add(0);
    			move.add(0);
    			return move;
    			
    		}
    		if( gb[1][1] == 3 && gb[2][0] == 3 && gb[0][2]==1 )
    		{
    			move.add(0);
    			move.add(2);
    			return move;
    			
    		}
    		if( gb[1][1] == 3 && gb[0][0] == 3 && gb[2][2]==1 )
    		{
    			move.add(2);
    			move.add(2);
    			return move;
    			
    		}
    		if( gb[1][1] == 3 && gb[0][2] == 3 && gb[2][0]==1 )
    		{
    			move.add( 2);
    			move.add( 0);
    			return move;
    			
    		}
    		
    		
    		return move;
    }
    
    /**
     * chooses move to make
     * @return the chosen move 
     */
    public List<Integer>  chosenMove( )
	{
		List<Integer> move = new ArrayList<Integer>();
		List<Integer> block = new ArrayList<Integer>();
		List<Integer> block2 = new ArrayList<Integer>();
		List<Integer> block3 = new ArrayList<Integer>();

		List<Integer> win = new ArrayList<Integer>();

		if(gb[1][1]==1)
		{
			move.add(1);
			move.add(1);
			return move;
		}
		block =findBlock();
		block2 =findBlock2();
		block3 = findBlock3();
		win =winningMove();
		if(win.size() == 2)
		{
			System.out.println("test3");

			move = win;
			return move;
		}
		if(block.size() ==2)
		{
			
			System.out.println("test1");
			move = block;
				return move;
		}
		if(block2.size() == 2)
		{
			System.out.println("test2");

			move = block2;
			return move;
		}
		if(block3.size() == 2)
		{
			System.out.println("test2");

			move = block3;
			return move;
		}
		
		
		
		if(gb[0][1]==1)
		{
			move.add(0);
			move.add(1);
		}
		if(gb[1][0]==1)
		{
			move.add(1);
			move.add(0);
		}
		if(gb[2][1]==1)
		{
			move.add(2);
			move.add(1);
		}
		if(gb[1][2]==1)
		{
			move.add(1);
			move.add(2);
		}
		if(gb[0][0]==1)
		{
			move.add(0);
			move.add(0);
		}
		if(gb[2][0]==1)
		{
			move.add(2);
			move.add(0);
		}
		if(gb[0][2]==1)
		{
			move.add(0);
			move.add(2);
		}
		if(gb[2][2]==1)
		{
			move.add(2);
			move.add(2);
		}
		
		
		
		return move;
	}
    /**
     * checks board for a winner
     * @return
     */
    public int checkforWinner( )
	{
		
		if( gb[0][0] ==2 && gb[0][1] == 2 && gb[0][2]== 2)
		{
			return 2;
		}
		if( gb[0][0] ==3 && gb[0][1] == 3 && gb[0][2]== 3)
		{
			return 3;
		}
		if( gb[1][0] ==2 && gb[1][1] == 2 && gb[1][2]== 2)
		{
			return 2;
		}
		if( gb[1][0] ==3 && gb[1][1] == 3 && gb[1][2]== 3)
		{
			return 3;
		}
		if( gb[2][0] ==2 && gb[2][1] == 2 && gb[2][2]== 2)
		{
			return 2;
		}
		if( gb[2][0] ==3 && gb[2][1] == 3 && gb[2][2]== 3)
		{
			return 3;
		}
		if( gb[0][0] ==2 && gb[1][0] == 2 && gb[2][0]== 2)
		{
			return 2;
		}
		if(gb[0][0] ==3 && gb[1][0] == 3 && gb[2][0]== 3)
		{
			return 3;
		}
		if( gb[0][1] ==2 && gb[1][1] == 2 && gb[2][1]== 2)
		{
			return 2;
		}
		if(gb[0][1] ==3 && gb[1][1] == 3 && gb[2][1]== 3)
		{
			return 3;
		}
		if(gb[0][2] ==2 && gb[1][2] == 2 && gb[2][2]== 2)
		{
			return 2;
		}
		if(gb[0][2] ==3 && gb[1][2] == 3 && gb[2][2]== 3)
		{
			return 3;
		}
		if(gb[0][0] ==2 && gb[1][1] == 2 && gb[2][2]== 2)
		{
			return 2;
		}
		if(gb[0][0] ==3 && gb[1][1] == 3 && gb[2][2]== 3)
		{
			return 3;
		}
		if(gb[2][0] ==2 && gb[1][1] == 2 && gb[0][2]== 2)
		{
			return 2;
		}
		if(gb[2][0] ==3 && gb[1][1] == 3 && gb[0][2]== 3)
		{
			return 3;
		}
		else
		{
			return 1;
		}
	}
   /**
    * checks board for a draw
    * @return if there is a draw
    */
    public int checkDraw( )
    {
    		int draw= 1;
	    	for( int i = 0; i<3; i++)
			{
				for( int j = 0 ; j<3; j++)
				{
					if ( gb[i][j] == 1)
					{
						draw = 2;
					}
				}
			}  
	    	return draw;
	    	}
	    
    
    /**
     * print gameboard for user
     */
    public void printGameboard() {
    	
    	System.out.println("+---+---+---+");
	
    	
    	for(int i=0;i<3;i++)
    {
        	System.out.print("| ");

         for(int j=0; j<3; j++)
            {
        	 		if( gb[i][j] == 1)
        	 		{
        	 			System.out.print("  | ");
        	 		}
        	 		if( gb[i][j] == 2)
        	 		{
        	 			System.out.print("x | ");
        	 		}
        	 		if( gb[i][j] == 3)
        	 		{
        	 			System.out.print("o | ");
        	 		}
        	 			
            }
	 		System.out.println();

     	System.out.println("+---+---+---+");

        }
    	
    }


}
