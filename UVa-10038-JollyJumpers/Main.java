import java.io.*;
import java.math.*;
import java.util.*;

/*public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		while(sc.hasNextInt()){
			boolean jolly = true;
			int n = sc.nextInt();
			int seq[] = new int[n];
			int abs[] = new int[n-1];
			for(int i = 0; i<n; i++)
				seq[i] = sc.nextInt();
			for(int i = 0; i<n-1; i++)
				abs[i] = Math.abs(seq[i+1] - seq[i]);
			Arrays.sort(abs);
			for(int i = 0; i<n-1; i++){
				if(abs[i] != i+1){
					jolly = false;
					break;
				}
			}
			if(jolly)
				out.println("Jolly");
			else
				out.println("Not jolly");
		}
	}
}*/

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			boolean jolly = true;
			int seq[] = new int[n];
			Set<Integer> abs = new TreeSet<Integer>();
			for(int i = 0; i<n; i++)
				seq[i] = sc.nextInt();
			for(int i = 0; i<n-1; i++)
				abs.add(Math.abs(seq[i+1] - seq[i]));
			if(abs.size() == (n-1)){
				for(int i = 0; i<n-1; i++)
					if(!(abs.contains(i+1))){
						jolly = false;;
						break;
					}
			}		
				
			else if(abs.size() != (n-1))
				jolly = false;
				
			else
				jolly = true;
			
			if(jolly)	
				out.println("Jolly");	
			else
				out.println("Not jolly");
		}
	}						
}



