package firstproblem;

public class Rectangle{


	private int xpos;                                                  //instance variables created for x-position,y-position,width,height      
	private int ypos;
	private int height;
	private int width;
	
	
	public Rectangle() {                                               //default constructor called 
		super();
	}

    public Rectangle(int xpos, int ypos, int height, int width) {      //parameterized constructor called
		super();
		this.xpos=xpos;
		this.ypos=ypos;
		this.height=height;
		this.width=width;
		
	}
                                                                       //getter setter created for instance variables
    public int getXpos() {
		return xpos;
	}
    
    public void setXpos(int x) {
		this.xpos = x;
	}

    public int getYpos() {
		return ypos;
	}
    
    public void setYpos(int y) {
		this.ypos = y;
	}

    public int getHeight() {
		return height;
	}

    public void setHeight(int heigt) {
		this.height = heigt;
	}

    public int getWidth() {
		return width;
	}

    public void setWidth(int wdth) {
		this.width = wdth;
	}
                                                                    //method to check new rectangle contains given rectangle
	public boolean contains(int px, int py)
	{
		
		return ((px>=xpos && px<=xpos+width) && (py>=ypos && py<=ypos+height));
	}

	public boolean contains(Rectangle r)
	{
	
		return this.contains(r.getXpos(), r.getYpos()) && this.contains(r.getXpos()+r.getWidth(), r.getYpos()+r.getHeight());
	}
	
	public boolean touches(int px, int py, int heig, int widt)                           //method to check new rectangle touches given rectangle
	{
		
		return (
				(
						((px==xpos+width)||(px==xpos)) 
						&& ((py>=ypos) && (py<=py+height))
						) || (
								((py==ypos) || (py==py+height)) && ((px>=xpos) && (px<=px+width)) || (px>xpos) && (py>ypos) && (px+widt==xpos+width) && (py+heig==ypos+height)));
	}

	public boolean touches(Rectangle r)
	{
	
		return this.touches(r.getXpos(), r.getYpos(), r.getHeight(), r.getWidth());
	}

	
	@Override                                                         //tostring method 
	public String toString() {
		return "Rectangle [xpos=" + xpos + ", ypos=" + ypos + ", height=" + height + ", width=" + width + "]";
	}
	
	
	
	
	
	
	
}
