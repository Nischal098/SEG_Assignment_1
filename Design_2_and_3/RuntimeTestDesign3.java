import java.util.Arrays;
import java.util.Random;

public class RuntimeTestDesign3{
	
	public static PointCP3 pointDesign3;
	
	public static void main(String[] args) {		
		long[] runs = new long[5];	
		System.out.println("Running 5 loops of 10000000 calls for each method\n");
		
		for(int methodRun = 1; methodRun < 9; methodRun++) {
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
		pointDesign3 = new PointCP3('C',rand.nextInt(1000),rand.nextInt(1000));
		
		start = System.nanoTime();
		for(int i = 0; i < 10000000; i++) {
			switch (methodNumber){
				case 1:
					pointDesign3.getX();
				case 2:
					pointDesign3.getY();
				case 3:
					pointDesign3.getRho();
				case 4:
					pointDesign3.getTheta();
				case 5:
					pointDesign3.convertStorageToPolar();
				case 6:
					pointDesign3.convertStorageToCartesian();
				case 7:
					pointDesign3. getDistance(new PointCP3('P',rand.nextInt(1000),rand.nextInt(1000)));
				case 8:
					pointDesign3. rotatePoint(rand.nextInt(200));				
			}
		}
		end = System.nanoTime();
		
		return end - start;
	}
}