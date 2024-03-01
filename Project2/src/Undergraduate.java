//Myriam Diabagate | Project 2 | 10/17/23
// This class extends the super class Student. It has a constructor which makes an object with name, creditHours, qualityPoints, studentsYear. It also has two overriden methods. The first returns whether the student is eligible for honor society based on the requirements in this specific subclass. The second returns a string representation of the object.
public class Undergraduate extends Student{
	private String studentsYear;
	
	
	
	public Undergraduate() {};
	
	
	public Undergraduate(String name, int creditHours, int qualityPoints, String studentsYear) {
		super(name, creditHours, qualityPoints);
		this.studentsYear = studentsYear;
		
	};
	
	@Override
	public boolean eligibleforHonorSociety(double min) {
		if (gpa() > setGPAThreshhold(min) && gpa() < 4.0 && studentsYear.equals("junior") || studentsYear.equals("senior")) {
			return true;
		}
		else
			return false;
		
	};
	
	@Override
	public String toString() {
		String studentToString = super.toString();
		
		
		return studentToString + ", Year: " + studentsYear;		
	}
	
	
	

	public static void main(String[] args) {
		Undergraduate one = new Undergraduate("Myriam", 12, 48, "Junior");
		//Undergraduate one = new Undergraduate("Myriam", 12, 48, "freshman");
		System.out.println("undergrad");
		System.out.println(one.toString());
		


	}


	
}
