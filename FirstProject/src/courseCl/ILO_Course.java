package courseCl;

public class ILO_Course extends Course{
	public String platformName;
	public ILO_Course() {}
	public ILO_Course(int id, String title, int duration, String branch, String platformName) {
		super(id, title, duration, branch);
		this.platformName = platformName;
	}
	    
	public String getDescription(int type) {
		switch (type) {
		case (FULL):
			return id + "\n" + title + "\n" + duration + "\n" + branch + "\n" + platformName + "\n";
		case (SHORT):
			return title + "\n" + platformName + "\n";
		default:
			return null;
		}
	}
	
}
