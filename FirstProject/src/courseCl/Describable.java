package courseCl;

public interface Describable {
	public final int SHORT = 1;
	public final int FULL = 2;
	
	public String getDescription(int type);
}
