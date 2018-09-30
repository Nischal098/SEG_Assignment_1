import java.io.*;
import java.util.*;

public class arraylist {	
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		double time = System.nanoTime();
		long sum = 0;

		for (long i = 0; i<200000000; i++) {
			list.add(rand.nextInt(10));
		}		
		for(long obj : list) {
			sum = sum + obj;
		}
		System.out.println("Running for 200000000 executions:");
		System.out.println("\nTime taken = " + (System.nanoTime() - time)/1000000000);
		System.out.println("Sum = " + sum);
	}	
}