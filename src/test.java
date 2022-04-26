class ToyRobotTest {	
	public static void main(String args[]){
		ToyRobot toyRobot = new ToyRobot();
		String moveTest = "MOVE";
		String leftTest = "LEFT";
		String rightTest = "RIGHT";
		String reportTest = "REPORT";
		String[] placeErrorTest = new String[9];
		placeErrorTest[0] = "place";
		placeErrorTest[1] = "place z,1,north";
		placeErrorTest[2] = "place 1,z,north";
		placeErrorTest[3] = "place 1,1,z";
		placeErrorTest[4] = "place -1,1,north";
		placeErrorTest[5] = "place 1,-1,north";
		placeErrorTest[6] = "place 99,1,north";
		placeErrorTest[7] = "place 1,99,north";
		placeErrorTest[8] = "xxxxxxx";
		placeErrorTest[8] = "plac";
		String place1test = "place 0, 0, North";
		String place2test = "place 1, 2, EAST";		
		String[] complexExampleTest = {place1test, moveTest, moveTest, rightTest, moveTest, moveTest, leftTest, moveTest, moveTest, rightTest, moveTest, moveTest, leftTest, reportTest};
		
		System.out.println("Robot position not initialized Test:");
		System.out.println(moveTest + " Test");
		toyRobot.runCommand(moveTest);
		System.out.println(leftTest + " Test");
		toyRobot.runCommand(leftTest);
		System.out.println(rightTest + " Test");
		toyRobot.runCommand(rightTest);
		System.out.println(reportTest + " Test");
		toyRobot.runCommand(reportTest);
		
		System.out.println("");
		System.out.println("PLACE command error Test:");
		for (int i = 0; i < placeErrorTest.length; i++) {
			System.out.println(placeErrorTest[i] + " Test");
			toyRobot.runCommand(placeErrorTest[i]);
		}
		
		System.out.println("");
		System.out.println("PLACE Test. Expect output: 0,0,NORTH");
		toyRobot.runCommand(place1test);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("MOVE Test. Expect output: 0,1,NORTH");
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("LEFTx1 Test. Expect output: 0,1,WEST");
		toyRobot.runCommand(leftTest);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("RIGHTx2 Test. Expect output: 0,1,EAST");
		toyRobot.runCommand(rightTest);
		toyRobot.runCommand(rightTest);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("MOVEx3 Test. Expect output: 3,1,EAST");
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("Out of bound Test (MOVEx2). X upper bound:");
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("Out of bound Test (LEFT MOVEx4). Y upper bound:");
		toyRobot.runCommand(leftTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("Out of bound Test (LEFT MOVEx5). X lower bound:");
		toyRobot.runCommand(leftTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("Out of bound Test (LEFT MOVEx5). Y lower bound:");
		toyRobot.runCommand(leftTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("PLACE Test after PLACE command. Expect output: 1,2,EAST");
		toyRobot.runCommand(place2test);
		toyRobot.runCommand(reportTest);
		System.out.println("");
		System.out.println("Example Test 1. Expect output: 0,1,NORTH");
		toyRobot.runCommand(place1test);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		System.out.println("Example Test 2. Expect output: 0,0,WEST");
		toyRobot.runCommand(place1test);
		toyRobot.runCommand(leftTest);
		toyRobot.runCommand(reportTest);
		System.out.println("Example Test 3. Expect output: 3,3,NORTH");
		toyRobot.runCommand(place2test);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(leftTest);
		toyRobot.runCommand(moveTest);
		toyRobot.runCommand(reportTest);
		
		System.out.println("Complex Example Test. Expect output: 4,4,NORTH");
		for (int i = 0; i < complexExampleTest.length; i++) {
			toyRobot.runCommand(complexExampleTest[i]);
		}
		
	}
}