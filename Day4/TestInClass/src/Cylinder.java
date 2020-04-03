
public class Cylinder extends Circle{
      private double height = 1.0;
      
      public Cylinder()
      {
    	  super();
      }
      public Cylinder(double height)
      {
    	  super();
    	  this.height = height;
      }
      public Cylinder(double height, double radius)
      {
    	  super(radius);
    	  this.height = height;
      }
      public Cylinder(double height, double radius, String color)
      {
    	  super(radius,color);
    	  this.height = height;
      }
      public void setHeight(double height)
      {
    	  this.height = height;
      }
      public double getHeight()
      {
    	  return this.height;
      }
      public double getVolume()
      {
    	  return getArea() * this.height;
      }
      public String toString()
      {
    	return ("Radius " + getRadius() + "Color" + getColor() + "Area " + getArea() + "Volume " + getVolume());  
      }
      
      public double getArea(double radius)
      {
    	  return ((2.0 * Math.PI * radius * height) + (2.0 * getArea()));
		
	}
}
