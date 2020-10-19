import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

public class Problem4 extends GraphicsProgram {

	public static final int SQSIZE = 75;
	public static final int NCOLS = 7;
	public static final int NROWS = 3;

	double frogX;
	double frogY;

	private GImage image;

	public void run() {
		jumpTheFrog();
	}

	public void jumpTheFrog() {
		addMouseListeners();

		image = getFrog("frog.png");
		
		frogX = (NCOLS / 2 + 0.5) * SQSIZE;
		frogY = (NROWS - 0.5) * SQSIZE;

		centerColBottomRow(image, frogX, frogY);

	}

	public void centerColBottomRow(GImage image, double frogX, double frogY) {
		double xPos = frogX - image.getWidth() / 2;
		double yPos = frogY - image.getHeight() / 2;

		add(image, xPos, yPos);
	}

	public void mouseClicked(MouseEvent e) {
		double mx = e.getX();
		double my = e.getY();
		if (Math.abs(mx - frogX) > Math.abs(my - frogY)) {
			if (mx > frogX) {
				moveFrog(image, SQSIZE, 0);
			} else {
				moveFrog(image, -SQSIZE, 0);
			}
		} else {
			if (my > frogY) {
				moveFrog(image, 0, SQSIZE);
			} else {
				moveFrog(image, 0, -SQSIZE);
			}
		}
	}

	public void moveFrog(GImage image, int dx, int dy) {
		if (inBounds(frogX + dx, frogY + dy)) {
			frogX += dx;
			frogY += dy;
			image.move(dx, dy);
		}
	}

	public boolean inBounds(double x, double y) {

		return (x >= 0 && x <= NCOLS * SQSIZE && y >= 0 && y <= NROWS * SQSIZE);
	}

	public GImage getFrog(String imageName) {
		return new GImage(imageName);
	}
}
