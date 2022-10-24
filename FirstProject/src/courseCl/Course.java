package courseCl;
import java.util.ArrayList;
import java.util.List;

public abstract class Course {
	protected int id;
	protected String title;
	protected int duration;
	protected String branch;
	protected ArrayList<String> tags = new ArrayList<String>();
	
	public Course() {}
	
	public Course(int id, String title, int duration, String branch){
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.branch = branch;
	}
	public int getId() {
		return this.id;
	}
	public String getTitle() {
		return this.title;
	}
	public int getDuration() {
		return this.duration;
	}
	public String getBranch() {
		return this.branch;
	}
	public void addTag(String tag) {
		tags.add(tag);
	}
	public void removeTag(int pos) {
		tags.remove(pos);
	}
	public ArrayList<String> getTags(){
		return tags;
	}
	
	abstract public String getDescription();
}
