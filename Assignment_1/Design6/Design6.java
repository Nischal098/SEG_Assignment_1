public interface Design6{
	public abstract double getX();
	public abstract double getY();
	public abstract double getRho();
	public abstract double getTheta();
	public abstract void convertStorageToPolar();
	public abstract void convertStorageToCartesian();
	public abstract double getDistance();
	public abstract PointCP rotatePoint(double x);
	public abstract String toString();
}