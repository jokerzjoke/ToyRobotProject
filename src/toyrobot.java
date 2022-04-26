class ToyRobot {
	final int [][] movement = {{0,1},{1,0},{0,-1},{-1,0}};
	final String[] directionStr = {"NORTH", "EAST", "SOUTH", "WEST"};
	final int rows;
	final int cols;

    int xValue = -1;
	int yValue = -1;
	int direction = -1; // direction index: 0 = north, 1=east, 2=south, 3=west
	
	// Constructor using default board size 5x5
    ToyRobot() { 
		rows = 5;
		cols = 5;
	}
	
	// Constructor using customm board size (newrols x newcols) 
    ToyRobot(int newRows, int newCols) { 
		rows = newRows;
		cols = newCols;
	}
	
	// Check if Robot is placed on board
	Boolean initialized() {
		if (xValue == -1 || yValue == -1 || direction == -1) {
			System.out.println("ROBOT POSITION NOT INITIALIZED");
			return false;
		}
		return true;
	}
	
	// process inputs from user
	void runCommand(String command) {
		command = command.toUpperCase().trim();	
		switch (command) {
			case "MOVE":
				move();
				break;
			case "LEFT":
				left();
				break;
			case "RIGHT":
				right();
				break;
			case "REPORT":
				report();
				break;
			default:
				if (command.length() >= 5) {
					String tmp = command.substring(0,5);
					if (tmp.equals("PLACE")) {
						place(command.substring(5));
					}
					else {
						System.out.println("INVALID COMMAND " + command);
					}
				}
				else {
					System.out.println("INVALID COMMAND " + command);
				}
		}
	}
	
	// MOVE command
	void move() {	
		if (initialized()) {	
			xValue += movement[direction][0];
			yValue += movement[direction][1];
			
			if (xValue >= rows || xValue < 0) {
				xValue -= movement[direction][0];
				System.out.println("MOVE COMMAND IGNORED - X OUT OF RANGE");
			}
			if (yValue >= cols|| yValue < 0) {
				yValue -= movement[direction][1];
				System.out.println("MOVE COMMAND IGNORED - Y OUT OF RANGE");
			}
		}
	}	
	
	// LEFT command
	void left() {
		if (initialized()) {
			direction = (direction + 4 - 1) % 4;
		}
	}
	
	// RIGHT command
	void right() {
		if (initialized()) {
			direction = (direction + 1) % 4;
		}
	}
	
	// REPORT command
	void report() {
		if (initialized()) {
			System.out.println("Output: " + Integer.toString(xValue) + "," + Integer.toString(yValue) + "," + directionStr[direction]);
		}
	}
	
	// PLACE command
	void place(String command) {
		int newX = -1;
		int newY = -1;
		int newDirection = -1;
		String[] splited = command.split(",");
		if (splited.length != 3) {
			System.out.println("INVAID PARAMETER FOR PLACE COMMAND" + command);
			return;
		}
		
		try {
		   newX = Integer.parseInt(splited[0].trim());	   
		}
		catch (NumberFormatException e) {
			newX = -1;
			System.out.println("INVAID X VALUE");
			return;
		}
		
		try {
		   newY = Integer.parseInt(splited[1].trim());		   
		}
		catch (NumberFormatException e) {
			newY = -1;
			System.out.println("INVAID Y VALUE");
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if (splited[2].trim().equals(directionStr[i])) {
				newDirection = i;
				break;
			}
		}
		
		if (newDirection < 0) {
			System.out.println("INVAID DIRECTION");
			return;
		}
		
		if (newX < 0 || newX >= rows) {
			System.out.println("X VALUE OUT OF RANGE");
			return;
		}
		
		if (newY < 0 || newY >= cols) {
			System.out.println("Y VALUE OUT OF RANGE");
			return;
		}
		
		xValue = newX;
		yValue = newY;
		direction = newDirection;
	}
}
