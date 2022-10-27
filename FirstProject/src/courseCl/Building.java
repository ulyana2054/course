package courseCl;

public class Building implements Describable {
	String address;
	String buildType;
	int floors;

	@Override
	public String getDescription(int type) {
		switch (type) {
		case (FULL):
			return address + "\n" + buildType + "\n" + floors + "\n";
		case (SHORT):
			return address + "\n";
		default:
			return null;
		}
	}


}
