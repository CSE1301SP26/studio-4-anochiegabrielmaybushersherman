package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	StdDraw.setPenColor(153,217,234);
	StdDraw.filledRectangle(0.5,0.5,1,1);
	StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
	StdDraw.setPenColor(0,0,0);
	StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);		
	StdDraw.setPenColor(162,8,255);
	StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
	StdDraw.setPenColor(255,255,255);
	StdDraw.filledRectangle(0.5, 0.5, 0.3, (0.2/3));
	StdDraw.setPenColor(100,237,186);
	StdDraw.filledCircle(0.5, 0.5, (0.2/3));

	}
}