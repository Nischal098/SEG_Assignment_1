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

		double time1 = System.nanoTime() - time;
		time = System.nanoTime();	
		for (int i = 0; i<165000000; i++) {
			sum += (int)(list.get(i));
		}
		
		double time2 = System.nanoTime() - time;
		time = time1 + time2;
		System.out.println("Time for addition of 165000000 items: " + time1/1000000000);
		System.out.println("Time for summation of 165000000 items: " + time2/1000000000);
		System.out.println("Overall time taken: " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}