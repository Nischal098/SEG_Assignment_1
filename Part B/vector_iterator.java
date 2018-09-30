import java.util.*;

public class vector_iterator {	
	public static void main(String[] args){
		Vector vec = new Vector();
		Random rand = new Random();
		double time = System.nanoTime();
		int sum = 0;

		for (int i = 0; i<165000000; i++){
			vec.add((int)(rand.nextInt(10)));
		}

		Iterator<Integer> iterator = vec.iterator();
		while (iterator.hasNext()) {
			sum = sum + iterator.next();
		}
		
		time = System.nanoTime() - time;
		System.out.println("Running for 165000000 executions:");
		System.out.println("\nTime taken = " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}