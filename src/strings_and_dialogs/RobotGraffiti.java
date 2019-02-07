package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {public static void main(String[] args) {
Robot melanie=new Robot(); 
melanie.penDown();
melanie.setSpeed(100);
melanie.move(250);
melanie.turn(90);
melanie.move(100);
melanie.turn(90);
melanie.move(200);
melanie.turn(-90);
melanie.move(90);
melanie.turn(-90);
melanie.move(200); 
melanie.turn(90);
melanie.move(50);
melanie.turn(90);
melanie.move(250);

}

}
