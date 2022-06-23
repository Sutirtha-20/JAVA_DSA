package recursion;

import java.util.ArrayList;
import java.util.List;

public class L14_backtracking_striver {

	public static List<List<String>> nqueen(int n)
	{
		char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        //res is the combination of all chessboard combinations which needs to be returned
        List<List<String>> res = new ArrayList<>();
        nqueenhelper(0,board,res);
        return res;
	}
	
	
	public static void nqueenhelper(int col, char[][] board, List<List<String>> res) 
	{
		int n = board.length;
		//base case
		if(col==n)
		{
			/*
			 * can't add a matrix to list of list of strings hence construct method will
			 * help us to create list of string from 2d matrix
			 */
			res.add(construct(board));
			return;
		}
		
		
		for(int row=0;row<n;row++)
		{
			//check for if the queen is safe in this loc and filling up each col
			if(isSafe(row,col,board))
			{
				board[row][col]='Q';
				/*
				 * after placing Q at a safe place we will check for next col where we can put
				 * the next queen safely hence again recursive function called
				 */
				nqueenhelper(col+1,board,res);
				board[row][col]='.';
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


	public static boolean isSafe(int row,int col,char[][] board) 
	{
		/*
		 * in isSafe method we will be checking only 3 direction diagonal top
		 * left,left,diagonal bottom left
		 */
		
		//as while traversing the rows and columns the values will be changed hence 
		//to keep track of their main value we create temp variables
		
		int temprow = row;
		int tempcol = col;
		
		//diagonal up left check for Q
		while(row>=0 && col>=0)
		{
			if(board[row][col]=='Q') return false;
			row--;
			col--;
		}
		
		row=temprow;
		col = tempcol;
		
		//checking horizontal left for Q
		while(col>=0)
		{
			if(board[row][col]=='Q') return false;
			col--;
		}
		
		row=temprow;
		col = tempcol;
		
		//checking diagonal bottom left for Q
		while(row<board.length && col>=0)
		{
			if(board[row][col]=='Q') return false;
			row++;
			col--;
		}
		
		return true;
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
