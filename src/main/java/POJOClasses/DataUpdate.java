package POJOClasses;

public class DataUpdate {

	private String name;
	private	String job;
	private String [] skills;
	private Detail details;
	public DataUpdate(String name, String job, String[] skills,String compnyName, String emailid) {
		this.name=name;
		this.job=job;
		this.skills=skills;
		this.details=new Detail(compnyName,emailid);	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public Detail getDetails() {
		return details;
	}
	public void setDetails(Detail details) {
		this.details = details;
	}
	
	
	
	
	
}
