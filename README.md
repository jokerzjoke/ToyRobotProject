<h1>Toy Robot Coding Challenge</h1>
<h2>Description</h2>
This console application is a simulation of a toy robot moving on a square table top, of dimensions 5 units x 5 units. There are no
other obstructions on the table surface. The robot is free to roam around the surface of the table, but must be prevented
from falling to destruction. Any movement that would result in the robot falling from the table must be prevented,
however further valid movement commands must still be allowed.

The application can read in commands of the following form -<br>
PLACE X,Y,F<br>
MOVE<br>
LEFT<br>
RIGHT<br>
REPORT<br>
PLACE will put the toy robot on the table in position X,Y and facing NORTH, SOUTH, EAST or WEST. The origin (0,0)
can be considered to be the SOUTH WEST most corner. It is required that the first command to the robot is a PLACE
command, after that, any sequence of commands may be issued, in any order, including another PLACE command. The
application should discard all commands in the sequence until a valid PLACE command has been executed.
MOVE will move the toy robot one unit forward in the direction it is currently facing.
LEFT and RIGHT will rotate the robot 90 degrees in the specified direction without changing the position of the robot.
REPORT will announce the X,Y and F of the robot. This can be in any form, but standard output is sufficient.
A robot that is not on the table can choose to ignore the MOVE, LEFT, RIGHT and REPORT commands.
Input can be from a file, or from standard input, as the developer chooses.
Provide test data to exercise the application.
It is not required to provide any graphical output showing the movement of the toy robot.
The application should handle error states appropriately and be robust to user input.

<h2>Constraints</h2>
The toy robot must not fall off the table during movement. This also includes the initial placement of the toy robot. Any
move that would cause the robot to fall must be ignored.


<h2>Requirement</h2>
The application is built with JDK 8 in Centos 7. It has been tested in Centos 7 and Windows 10 with JDK 17. Please install the following 2 packages on Centos to build the project: <br>
yum install java-1.8.0-openjdk<br>
yum install java-1.8.0-openjdk-devel.x86_64

<h2>Build</h2>
To build the project, please extract the files in source directory and run:<br>
javac *java

<h2>Test</h2>
For unit tests and integration tests, please run:<br>
java ToyRobotTest

<h2>Run</h2>
To run the program, please run the following and input the commands: <br>
java ToyRobotApp
