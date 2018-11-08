package builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		
		RobotBuilder oldRobotBuilder = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(oldRobotBuilder);
		
		Robot firstRobot = robotEngineer.makeRobot();
		
		System.out.println("Robot built successfully");
		System.out.println("Robot head " + firstRobot.getRobotHead());
		System.out.println("Robot torso " + firstRobot.getRobotTorso());
		System.out.println("Robot arms " + firstRobot.getRobotArms());
		System.out.println("Robot legs " + firstRobot.getRobotLegs());
	}
}
