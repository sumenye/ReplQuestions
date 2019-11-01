package OOPRepls;

public class LawSchool extends EducationalInstitution{

	
	public LawSchool(int x) {
		super(3);
	}
	
	@Override 
	String graduationRequirements() {
	
		return "3 years of study and passing the bar"; 
	 }

}
