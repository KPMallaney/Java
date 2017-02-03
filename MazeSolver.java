

import java.util.Scanner;
import java.io.File;

public class Homework2 {

	public static void main(String[] args)
	{	
			try
			{
				File f = new File("in.txt");
				Scanner input = new Scanner(f);
				int rows = input.nextInt();	
				int col = rows;
				int [][] maze = new int[rows][col];
				
				
				String s = "";
				
				//System.out.println(rows);
				//System.out.println(col);
				input.nextLine();
				int r = 0;
				
				while(input.hasNextLine())
				{
					s = input.nextLine();
				
					//System.out.println(s);
					
					
						for(int c = 0; c < col; c++)
						{
							maze[r][c] = Integer.parseInt(""+s.charAt(c));
							//System.out.print(maze[r][c]);
						}
						//System.out.println();
						r++;	
				}
					
				
					int startR = 0;
					int startC = 0;
					for ( int i = 0; i < rows; ++i ) {
					    for ( int j = 0; j < rows; ++j ) {
					        if ( maze[i][j] == 0 ) {
					            startR = i;
					            startC = j;    
					        }
					    }
					}
			boolean [] arr = {false};
			Recursive(startR, startC, maze, col, arr );
			
			for(int i = 0; i < rows; i++)
			{
			    for(int j = 0; j < col; j++)
			    {
			        System.out.print(maze[i][j]);
			    }
			    System.out.println();
			}
			
			
			
				
			
					
			}
			
			
	
			
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	
	public static void Recursive(int startR, int startC, int[][] maze, int col, boolean[] solved)
	{
		if(!solved[0])
		{
		if(maze[startR][startC] == 2)
		{
			solved[0] = true;
			maze[startR][startC] = 0;
			return;
		}
		//Left
		else if((startC > 0) && (maze[startR][startC - 1] == 1 || maze[startR][startC - 1] == 2))
		{
			maze[startR][startC] = 0;
			Recursive(startR, startC - 1, maze, col, solved);
		}
		//Right
		if((startC + 1 < col) && (maze[startR][startC + 1] == 1 || maze[startR][startC + 1] == 2))
		{
			maze[startR][startC] = 0;
			Recursive(startR, startC + 1, maze, col, solved);
		}
		//Up
		if((startR > 0)  && (maze[startR - 1][startC] == 1 || maze[startR - 1][startC] == 2))
		{
			maze[startR][startC] = 0;
			Recursive(startR - 1, startC, maze, col, solved);
		}
		//Down
		if((startR + 1 < col)  && (maze[startR + 1][startC] == 1 || maze[startR + 1][startC] == 2))
		{
			maze[startR][startC] = 0;
			Recursive(startR + 1, startC, maze, col, solved);
		}
		if(!solved[0])
		maze[startR][startC] = 1;
	
		}
		}
	
	
	//row,col-1 left
	//row, col + 1 right
	//row-1, col up
	//row + 1, down
	
	
	
	
	
	



}
	





