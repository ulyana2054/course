package courseCl;

public class CR_Course extends Course{
	private String address;
	public CR_Course() {}
	public CR_Course(int id, String title, int duration, String branch, String address) {
		super(id, title, duration, branch);
		this.address = address;
	}
	
	public String getDescription(int type) {
		switch (type) {
		case (FULL):
			return id + "\n" + title + "\n" + duration + "\n" + branch + "\n" + address + "\n";
		case (SHORT):
			return title + "\n" + address + "\n";
		default:
			return null;
		}
	}
}