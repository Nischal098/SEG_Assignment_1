import java.util.*;

public class vector {	
	public static void main(String[] args){
		Vector vec = new Vector();
		Random rand = new Random();
		double time = System.nanoTime();
		int sum = 0;

		for (int i = 0; i<165000000; i++){
			vec.add((int)(rand.nextInt(10)));
		}
		for (int i = 0; i<165000000; i++) {
			sum += (int)(vec.get(i));
		}	
		
		time = System.nanoTime() - time;
		System.out.println("Running for 165000000 executions:");
		System.out.println("\nTime taken = " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}