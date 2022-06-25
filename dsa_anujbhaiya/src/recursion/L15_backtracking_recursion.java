package recursion;

public class L15_backtracking_recursion {
	
	public static boolean sudokusolver(char[][] board)
	{
		for(int row=0;row<9;row++)
		{
			for(int col=0;col<9;col++)
			{
				if(board[row][col]=='.')
				{
					for(char k = '1';k<='9';k++)
					{
						if(isValid(board,row,col,k))
						{
							board[row][col]=k;
							
							if(sudokusolver(board))
								return true;
							else
								board[row][col]='.';
						}
					}
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isValid(char[][] board, int row, int col, char k) {
		for(int i=0;i<9;i++)
		{
			//column wise check
			if(board[row][i]==k)
				return false;
			//row wise check
			if(board[i][col]==k)
				return false;
			//for 3x3 grid all elements check
			if(board[3 * (row/3)+ i/3][3* (col/3)+ i/3 ]==k)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	}
}
