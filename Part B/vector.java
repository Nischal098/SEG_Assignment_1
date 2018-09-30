import java.io.*;
import java.util.*;

public class vector {	
	public static void main(String[] args){
		Vector vec = new Vector(200000000);
		Random rand = new Random();
		double time = System.nanoTime();
		int sum = 0;

		for (int i = 0; i<200000000; i++){
			vec.add((int)(rand.nextInt(10)));
		}
		//System.out.println(vec);
		for (int i = 0; i<200000000; i++) {
			sum += (int)(vec.get(i));
		}		
		System.out.println("Running for 200000000 executions:");
		System.out.println("\nTime taken = " + (System.nanoTime() - time)/1000000000);
		System.out.println("Sum = " + sum);
	}	
}