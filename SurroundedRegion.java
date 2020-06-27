package com.leetcode.June;

public class SurroundedRegion {

	public static void main(String[] args) {
		char[][] board= {{'X','X', 'X','X'},{'X','O', 'O','X'},{'X','X', 'O','X'},{'X','O', 'X','X'}};
		solve(board);
	}
	public static void solve(char[][] board) {
		
		if(board.length==0||board[0].length==0)
			return;
	        int row=board.length;
	        int col=board[0].length;
	        
	        for(int i=0;i<row;i++) {
	        	if(board[i][0]=='O')
	        		boundryDFS(board, i, 0);
	        	if(board[i][col-1]=='O')
	        		boundryDFS(board, i, col-1);
	        }
	        
	        for(int j=0;j<col;j++) {
	        	if(board[0][j]=='O')
	        		boundryDFS(board, 0, j);
	        	if(board[row-1][j]=='O')
	        		boundryDFS(board, row-1, j);
	        }
	        for(int i=0;i<row;i++) {
	        	for(int j=0;j<col;j++) {
	        		if(board[i][j]=='O')
	        			board[i][j]='X';
	        		else if(board[i][j]=='*')
	        			board[i][j]='O';
	        	}
	        }
	        
	        
	    }
	
	public static void boundryDFS(char[][]board,int i,int j) {
		if(i>board.length-1||i<0||j>board[0].length-1||j<0)
			return;
		if(board[i][j]=='O')
			board[i][j]='*';
		if(i>0 && board[i-1][j]=='O')
			boundryDFS(board, i-1, j);
		if(i<board.length-1 && board[i+1][j]=='O')
			boundryDFS(board, i+1, j);
		if(j>0 && board[i][j-1]=='O')
			boundryDFS(board, i, j-1);
		if(j<board[0].length-1 && board[i][j+1]=='O')
			boundryDFS(board, i, j+1);
		return;
	}
}
