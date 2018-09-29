import java.util.*;

public class RuntimeTest{
	
	public static void main(String[] args) {
		PointCP2 pointDesign2;		
		Random rand = new Random();		
		long start,end;
		long[] timeDifference = new long[100000000];
		
		pointDesign2 = new PointCP2('P',rand.nextInt(1000),rand.nextInt(1000));
		
		System.out.println("Number of Tests: 100000000");
		
		System.out.println("Number of Tests: 100000000");
		for(int i = 0; i < 100000000; i++) {	
			start = System.nanoTime();
			pointDesign2.getX();
			end = System.nanoTime();
			timeDifference[i] = end - start;
		}
	}
}