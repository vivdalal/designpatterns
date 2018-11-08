package builder;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	public void setRobotHead(String head) {
		this.robotHead = head;

	}

	public String getRobotHead() {
		return robotHead;
	}

	public void setRobotTorso(String torso) {
		this.robotTorso = torso;

	}

	public String getRobotTorso() {
		return robotTorso;
	}

	public void setRobotArms(String arms) {
		this.robotArms = arms;

	}

	public String getRobotArms() {
		return robotArms;
	}

	public void setRobotLegs(String legs) {
		this.robotLegs = legs;

	}

	public String getRobotLegs() {
		return robotLegs;
	}

}
