package problem1;

public class Point<T> {
	
	T xpos;                                                 //generic class 
	T ypos;
	
	public Point(T xpos, T ypos) {                          //constructor created
		super();
		this.xpos = xpos;
		this.ypos = ypos;
	}

	public T getXpos() {                                      //getter and setter created 
		return xpos;
	}

	public void setXpos(T xpos) {
		this.xpos = xpos;
	}

	public T getYpos() {
		return ypos;
	}

	public void setYpos(T ypos) {
		this.ypos = ypos;
	}

	@Override                                                     //ToString method created
	public String toString() {
		return "xpos= " + xpos + ", ypos= " + ypos;
	}
	
	

}
