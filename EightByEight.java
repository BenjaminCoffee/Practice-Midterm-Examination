import stanford.karel.SuperKarel;

public class EightByEight extends SuperKarel {

	public void run() {
		placeBeepersOnInnerBorder();
	}

	public void placeBeepersOnInnerBorder() {
		moveToStartingPosition();
		for (int i = 0; i < 4; i++) {
			move();
			fillUntilBorder();
			turnRight();
			move();
			turnRight();
			move();
			turnRight();
		}
	}

	public void moveToStartingPosition() {
		turnLeft();
		move();
		turnRight();
	}

	public void fillUntilBorder() {
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
}
