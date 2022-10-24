package courseCl;

public class CR_Course extends Course{
	private String address = "Moscow";
	public CR_Course() {}
	public CR_Course(int id, String title, int duration, String branch) {
		super(id, title, duration, branch);
	}
	
	public String getDescription() {
		return address;
	}
	
}
