package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(220,230,200);
		StdDraw.filledCircle(0.5,0.5,0.3);
		StdDraw.setPenColor(100, 120, 170);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.05);
		StdDraw.filledRectangle(0.5,0.5, 0.05, 0.3);
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(150,130,10);
		double[] x = { 0.25, 0.75, 0.5};
		double[] y = { 0.6, 0.6, 0.22};
		StdDraw.polygon(x, y);
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(255,255,255);
		StdDraw.circle(0.5, 0.5, 0.3);
		
		
		
	}
}