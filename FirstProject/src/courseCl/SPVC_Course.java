package courseCl;

public class SPVC_Course extends Course{
	public String imsName;
	public SPVC_Course() {}
	public SPVC_Course(int id, String title, int duration, String branch, String imsName) {
		super(id, title, duration, branch);
		this.imsName = imsName;
	}
	
	public String getDescription(int type) {
		switch (type) {
		case (FULL):
			return id + "\n" + title + "\n" + duration + "\n" + branch + "\n" + imsName + "\n";
		case (SHORT):
			return title + "\n" + imsName + "\n";
		default:
			return null;
		}
	}
	
}
