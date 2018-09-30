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
		
		double time1 = System.nanoTime() - time;
		time = System.nanoTime();
		for (int i = 0; i<165000000; i++) {
			sum += (int)(vec.get(i));
		}	

		double time2 = System.nanoTime() - time;
		time = time1 + time2;
		System.out.println("Time for addition of 165000000 items: " + time1/1000000000);
		System.out.println("Time for summation of 165000000 items: " + time2/1000000000);
		System.out.println("Overall time taken: " + time/1000000000);
		System.out.println("Sum = " + sum);
	}	
}