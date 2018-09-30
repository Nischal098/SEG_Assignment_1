import java.util.Arrays;
import java.util.Random;

public class Design6RuntimeTest2{
	
	public static Design6PointCP2 pointDesign2;
	
	public static void main(String[] args) {
		long[] runs = new long[5];	
		System.out.println("Running 5 loops of 10000000 calls for each method\n");
		
		for(int methodRun = 1; methodRun < 8; methodRun++) {
			for(int i = 0; i < 5; i++) {
				runs[i] = Runtime(methodRun);
			}	
			Arrays.sort(runs);
			System.out.println("\nTime for Method number" + methodRun + "   Min:" + runs[0]/1000000 + " Max:" + runs[4]/1000000 +
					" Median:" + runs[2]/1000000);
		}		
	}
	
	public static long Runtime(int methodNumber) {
		long start,end;
		Random rand = new Random();
		pointDesign2 = new Design6PointCP2('P',rand.nextInt(1000),rand.nextInt(1000));
		
		start = System.nanoTime();
		for(int i = 0; i < 10000000; i++) {
			switch (methodNumber){
				case 1:
					pointDesign2.getX();
				case 2:
					pointDesign2.getY();
				case 3:
					pointDesign2.getRho();
				case 4:
					pointDesign2.getTheta();
				case 5:
					pointDesign2.convert();
				case 6:
					pointDesign2. getDistance(new Design6PointCP2('P',rand.nextInt(1000),rand.nextInt(1000)));
				case 7:
					pointDesign2. rotatePoint(rand.nextInt(200));				
			}
		}
		end = System.nanoTime();
		
		return end - start;
	}
}