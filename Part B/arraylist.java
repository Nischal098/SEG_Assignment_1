import java.io.*;
import java.util.*;

public class arraylist {	
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		double time = System.nanoTime();
		int sum = 0;

		for (int i = 0; i<200000000; i++) {
			list.add(rand.nextInt(10));
		}		
		for(int obj : list) {
			sum = sum + obj;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Time taken = " + (System.nanoTime() - time)/1000000000);
	}	
}