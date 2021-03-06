// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class Design6PointCP3 implements Design6
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  //private char typeCoord = 'C';
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double xOrRho;
  
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double yOrTheta;
	
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public Design6PointCP3(char type, double xOrRho, double yOrTheta)
  {
	
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    if(type == 'P') {
    	this.xOrRho = (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    	this.yOrTheta = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }
    else if (type == 'C') {
    	this.xOrRho = xOrRho;
    	this.yOrTheta = yOrTheta;
    }
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
      return xOrRho;
  }
  
  public double getY()
  {
      return yOrTheta;
  }
  
  public double getRho()
  {
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }
  
  public double getTheta()
  {
      return (Math.toDegrees(Math.atan2(yOrTheta, xOrRho)));
  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public Object convert()   
  {
    Design6PointCP2 temp = new Design6PointCP2('P',getRho(),getTheta());
    return temp;
  }


  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(Object pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - ((Design6PointCP3) pointB).getX();
    double deltaY = getY() - ((Design6PointCP3) pointB).getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public Design6PointCP3 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new Design6PointCP3('C',
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "(" + getX() + "," + getY() + ")" + "\n";
  }
}