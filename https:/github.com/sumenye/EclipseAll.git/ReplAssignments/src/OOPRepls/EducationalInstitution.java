package OOPRepls;

public class EducationalInstitution {
	int duration; //years spent at the institution
	
	public EducationalInstitution(int x) {
		this.duration = x;
	}
	
	 String graduationRequirements() {
		return String.valueOf(duration); 
	 }

}
