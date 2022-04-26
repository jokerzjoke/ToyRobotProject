class ToyRobotApp {
	public static void main(String args[]){
		String input = "";
		Boolean running = true;
		ToyRobot toyRobot = new ToyRobot();
		System.out.println("Please enter command:");
		while (running == true) {
			input = System.console().readLine().toUpperCase().trim();
			if (input.equals("EXIT")) {
				running = false;
			}
			else {
				toyRobot.runCommand(input);
			}
		}		
		System.out.println("EXIT");
	}
}
