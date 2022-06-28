package recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueen_2_backtracking_striver {
	
	public static List<List<String>> nqueen(int n)
	{
		char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        //res is the combination of all chessboard combinations which needs to be returned
        List<List<String>> res = new ArrayList<>();
        int[] leftcheck = new int[n];
        int[] diagonalleftbottom = new int[2*n - 1];
        int[] diagonallefttop = new int[2*n - 1];
        nqueenhelper(0,board,res,leftcheck,diagonalleftbottom,diagonallefttop);
        return res;
	}
	
	
	public static void nqueenhelper(int col, char[][] board, List<List<String>> res, int[] leftcheck,
			int[] diagonalleftbottom, int[] diagonallefttop) 
	{
		int n = board.length;
		
		//base case
		if(col==n)
		{
			res.add(construct(board));
			return;
		}
		
		//for each col iterating through rows
		for(int row=0;row<n;row++)
		{
			//if below three cond are satisfied that means queen will be safe for that location
			if(leftcheck[row]==0 && diagonalleftbottom[row+col]==0 &&
					diagonallefttop[(n-1)+(col-row)]==0)
			{
				board[row][col]='Q';
				leftcheck[row]=1;
				diagonalleftbottom[row+col]=1;
				diagonallefttop[(n-1)+(col-row)]=1;
				
				nqueenhelper(col+1,board,res,leftcheck,diagonalleftbottom,diagonallefttop);
				
				//if recursive call fails means queen can't be placed at that location then
				board[row][col]='.';
				leftcheck[row]=0;
				diagonalleftbottom[row+col]=0;
				diagonallefttop[(n-1)+(col-row)]=0;
			}
		}
		
	}
	
	public static List<String> construct(char[][] board) 
	{
		List<String> list = new ArrayList<>();
		for(int i=0;i<board.length;i++)
		{
			//array to string conversion
			String s = new String(board[i]);
			list.add(s);
		}
		return list;
	}


	public static void main(String[] args) {
		List<List<String>> ans = nqueen(4);
		int count = 0;
		for(List<String> i : ans)
		{
			for(String k : i) 
			{
				System.out.print(k+" ");
				count++; 
				if(count==1)
					System.out.println();
				if(count==2)
					System.out.println();
				if(count==3)
					System.out.println();
				if(count==4)
					System.out.println();
			}
			System.out.println();
			count = 0;
		}
	}
}
