package thirdproblem;

import java.util.Arrays;

public class Rectangle {

	public static void getRectangle(double[][] points)
	{
		double xmin,ymin,xmax,ymax;      
		xmax=xmin=points[0][0];
		ymin=ymax=points[0][1];
		for(double[] point:points)
		{
			if(xmin>point[0])
				xmin = point[0];
			if(xmax<point[0])
				xmax = point[0];
			if(ymin>point[1])
				ymin = point[1];
			if(ymax<point[1])
				ymax = point[1];
		}
		System.out.printf("%f %f %f %f",(+xmin+xmax)/2,(ymax+ymin)/2,xmax-xmin,ymax-ymin);
		
	}
}
