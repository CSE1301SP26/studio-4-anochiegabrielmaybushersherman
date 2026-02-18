package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.clear();
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(0, 0, 145);
		StdDraw.filledRectangle((11.0/3), 8, (11.0/3), 8);
		StdDraw.setPenColor(225,0,15);
		StdDraw.filledRectangle((11.0/3*5), 8, (11.0/3), 8);
	}

	public static void indonesia() {
		StdDraw.clear();
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(11,16,11,8);
	}

	public static void netherlands() {
		StdDraw.clear();
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(30,71,133);
		StdDraw.filledRectangle(11, (8.0/3), 11, (8.0/3));
		StdDraw.setPenColor(173,29,37);
		StdDraw.filledRectangle(11, (8.0/3*5), 11, (8.0/3));
	}

	public static void poland() {
		StdDraw.clear();
		StdDraw.setXscale(0,22);
		StdDraw.setYscale(0,16);
		StdDraw.setPenColor(220, 20, 60);
		StdDraw.filledRectangle(11, 8, 11, 8);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(11,16,11,8);
	}

	public static void thailand() {
		
		// TODO
	}

	public static void finland() {
		
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
