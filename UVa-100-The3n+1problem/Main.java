import java.io.*;
import java.util.*;
import java.math.*;


class Main{
	static int cache[] = new int[1000000];
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        	PrintWriter out = new PrintWriter(System.out, true);
		while(sc.hasNextInt()){
			int i = sc.nextInt();
			int j = sc.nextInt();
			int from = Math.min(i, j);
			int to = Math.max(i, j);
			int max = 0;
			for(int k  = from; k<=to; k++)
				max = Math.max(max, cycleLength(k)); 
			out.printf("%d %d %d\n", i, j, max);
		}
	}
	
	public static int next(int n){
		if(n%2 == 0)
			return n/2;
		else
			return 3*n + 1;
	}
	
	public static int cycleLength(int n){
		if(n == 1)
			return 1;
		if(n<1000000 && cache[n] != 0)
			return cache[n];

		int l = 1 + cycleLength(next(n));		
	
		if(n<1000000)
			cache[n] = l;
		return l;
	}
}

