import java.util.*;

public class arraylist_iterator{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		double time = System.nanoTime();
		long sum = 0;

		for (long i = 0; i<165000000; i++) {
			list.add(rand.nextInt(10));
		}

		Iterator<Integer> iterator = list.iterator();	
		while (iterator.hasNext()) {
			sum = sum + iterator.next();
		}
		
		time = System.nanoTime() - time;
		System.out.println("Running for 165000000 executions:");
		System.out.println("\nTime taken = " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}