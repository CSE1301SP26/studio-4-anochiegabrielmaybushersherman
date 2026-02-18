package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		double parameterOne = in.nextDouble(); // x1
		double parameterTwo = in.nextDouble(); // y1
		double parameterThree = in.nextDouble(); // x2
		double parameterFour = in.nextDouble(); // y2

		if (shapeType.equals("triangle")) {
			double parameterFive = in.nextDouble(); // x3
			double parameterSix = in.nextDouble(); // y3
			double[] x = {parameterOne, parameterThree, parameterFive};
			double[] y = {parameterTwo, parameterFour, parameterSix};

			if (isFilled) {
				StdDraw.filledPolygon(x, y);
			}
			else {
				StdDraw.polygon(x, y);
			}
		}

		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);

		if (isFilled) {
			if (shapeType.equals("rectangle")) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else if (shapeType.equals("ellipse")) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		else {
			if (shapeType.equals("rectangle")) {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else if (shapeType.equals("ellipse")) {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
	}
}
