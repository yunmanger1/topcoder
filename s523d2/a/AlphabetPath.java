import java.io.*;
import java.util.*;

public class AlphabetPath{
	int [][] A;	
	int N, M, sx = -1, sy;
	public static final int [] dx = {-1,0,1,0};
	public static final int [] dy = {0,1,0,-1};
	public boolean dive(int x, int y){
		if (A[x][y] == (int)('Z'-'A')){
			return true;
		}else{
			for (int i =0; i < 4; i++)if (A[x][y] + 1 == A[x+dx[i]][y+dy[i]]){
				return dive(x+dx[i], y + dy[i]);
			}
		}
		return false;
	}
	public String doesItExist(String[] lM){
		N = lM.length;
		M = lM[0].length();
		A = new int[N+3][M+3];
		for (int i = 0; i <= N+1; i++)
			for (int j = 0; j <= M+1; j++)
				A[i][j] = -1;
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= M; j++)
				if (lM[i-1].charAt(j-1) == '.'){
					A[i][j] = -1;
				}else {
					A[i][j] = (int)(lM[i-1].charAt(j-1)-'A');
					if (A[i][j] == 0){
						sx = i;
						sy = j;
					}
				}
				
		if (sx != -1 && dive(sx,sy))
			return "YES";
		return "NO";
		
	}
}
