import java.util.*;

public class arraylist {	
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		double time = System.nanoTime();
		long sum = 0;

		for (long i = 0; i<165000000; i++) {
			list.add(rand.nextInt(10));
		}		
		for (int i = 0; i<165000000; i++) {
			sum += (int)(list.get(i));
		}
		
		time = System.nanoTime() - time;
		System.out.println("Running for 165000000 executions:");
		System.out.println("\nTime taken = " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}