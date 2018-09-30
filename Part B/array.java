import java.util.*;

public class array {	
	public static void main(String[] args){
		int[] num = new int[165000000];
		Random rand = new Random();
		double time = System.nanoTime();
		int sum = 0;
		
		for (int i = 0; i<165000000; i++) {
			num[i] = rand.nextInt(10);
		}			
		for(int i = 0; i<165000000; i++) {
			sum = sum + num[i];
		}
		
		time = System.nanoTime() - time;
		System.out.println("Running for 165000000 executions:");
		System.out.println("\nTime taken = " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}