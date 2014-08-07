import java.io.*;
import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out, true);
	public static void main(String args[]){ 
		int count = 0;
		while(true){
			int nrows = sc.nextInt(); int ncols = sc.nextInt();
			if(nrows == 0 && ncols == 0)
				System.exit(0);
			
			int arr[][] = new int[nrows][ncols];
			count++;			
			for(int i = 0; i<nrows; i++){
				String str = sc.next();				
				for(int j = 0; j<ncols; j++){
					if(str.charAt(j) == '*'){
						arr[i][j] = -1;
						if(i>0 && j>0 && arr[i-1][j-1] != -1)
							arr[i-1][j-1] += 1;
						if(i>0 && arr[i-1][j] != -1)
							arr[i-1][j] += 1;
						if(i>0 && (j < ncols-1) && arr[i-1][j+1] != -1)
							arr[i-1][j+1] += 1;
						if(j>0 && arr[i][j-1] != -1)
							arr[i][j-1] += 1;
						if((j<ncols-1) && arr[i][j+1] != -1)
							arr[i][j+1] += 1;
						if((i<nrows-1) && j>0 && arr[i+1][j-1] != -1)
							arr[i+1][j-1] += 1;
						if((i<nrows-1) && arr[i+1][j] != -1)
							arr[i+1][j] += 1;
						if((i<nrows-1) && (j<ncols-1) && arr[i+1][j+1] != -1)
							arr[i+1][j+1] += 1;
					}
				}
			}
			if(count != 1) 
				System.out.println();
			System.out.println("Field #" + count + ":");
			for(int i=0;i<nrows;i++){
				for(int j=0;j<ncols;j++){
					if(arr[i][j]>=0) System.out.print(arr[i][j]);
					else System.out.print("*");
				}
				System.out.println();		
	
			}
		}
	}
}

