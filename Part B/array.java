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
		System.out.println("Sum = " + sum);
		System.out.println("Time taken = " + (System.nanoTime() - time)/1000000000);
	}	
}