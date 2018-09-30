import java.io.*;
import java.util.*;

public class array {	
	public static void main(String[] args){
		int[] num = new int[200000000];
		Random rand = new Random();
		double time = System.nanoTime();
		for (int i = 0; i<200000000; i++) {
			num[i] = rand.nextInt(10);
		}
		//System.out.println(list);

		int sum = 0;	
		for(int i = 0; i<200000000; i++) {
			sum = sum + num[i];
		}
		System.out.println("Running for 200000000 executions:");
		System.out.println("\nTime taken = " + (System.nanoTime() - time)/1000000000);
		System.out.println("Sum = " + sum);
	}	
}