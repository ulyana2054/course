package courseCl;

public class ILO_Course extends Course{
	public String platformName = "Stepik";
	public ILO_Course(int id, String title, int duration, String branch) {
		super(id, title, duration, branch);
	}
	public String getDescription() {
		return platformName;
	}
	
}
