package courseCl;

public class SPVC_Course extends Course{
	public String imsName = "ASMR";
	public SPVC_Course(int id, String title, int duration, String branch) {
		super(id, title, duration, branch);
	}
	public String getDescription() {
		return imsName;
	}
}
