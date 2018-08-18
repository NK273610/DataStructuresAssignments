package secondproblem;

import firstproblem.Rectangle;

public class Circle {

	double xcordinate;
	double ycordinate;
	double radius;
	
	
	
	public Circle() {                                                      //default constructor
		super();
	}
	public Circle(double xcordinate, double ycordinate, double radius) {   //parameterize constructor
		super();
		this.xcordinate = xcordinate;
		this.ycordinate = ycordinate;
		this.radius = radius;
	}
	public double getXcordinate() {                                     //getter setter called
		return xcordinate;
	}
	public void setXcordinate(double xcordinate) {
		this.xcordinate = xcordinate;
	}
	public double getYcordinate() {
		return ycordinate;
	}
	public void setYcordinate(double ycordinate) {
		this.ycordinate = ycordinate;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public boolean touches(double x,double y,double r)                             //contains and touches method created 
	{
		double distance=Math.sqrt(Math.pow(y-ycordinate, 2)+Math.pow(x-xcordinate, 2));
	    return (distance==radius+r) || distance==radius-r;
	}

	public boolean touches(Circle c)
	{
	
		return this.touches(c.getXcordinate(),c.getYcordinate(),c.getRadius());
		
	}
	
	public boolean contains(double x,double y,double r)
	{
		double distance=Math.sqrt(Math.pow(y-ycordinate, 2)+Math.pow(x-xcordinate, 2));
	    return (distance==radius-r) || (distance<radius-r);
	}

	public boolean contains(Circle c)
	{
	
		return this.contains(c.getXcordinate(),c.getYcordinate(),c.getRadius());
		
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [xcordinate=" + xcordinate + ", ycordinate=" + ycordinate + ", radius=" + radius + "]";
	}
	
	
}
