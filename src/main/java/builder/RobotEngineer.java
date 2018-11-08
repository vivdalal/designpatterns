package builder;

public class RobotEngineer {

	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuilder) {
			this.robotBuilder = robotBuilder;
	}
	
	public Robot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	
	public Robot makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		return this.robotBuilder.getRobot();
	}
	
}
