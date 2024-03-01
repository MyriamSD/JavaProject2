//Myriam Diabagate | Project 2 | 10/17/23
// This class extends the superclass parent. It has a constructor which creates a Graduate with name, creditHours, qualityPoints, degreeSought. It returns two overridden methods one that determines of the Graduate is eligible for honors society and a toString method that prints out a string representation of the object.
public class Graduate extends Student{
	private String degreeSought;
	
	public Graduate() {};
	
	
	public Graduate(String name, int creditHours, int qualityPoints, String degreeSought) {
		super(name, creditHours, qualityPoints);
		this.degreeSought = degreeSought;
		
	};
	
	
	@Override
	public boolean eligibleforHonorSociety(double min) {
		if (gpa() > setGPAThreshhold(min) && gpa() < 4.0 && degreeSought.equals("masters")) {
			return true;
		}
		else
			return false;
		
	};
	
	
	@Override
	public String toString() {
		String studentToString = super.toString();
		
		
		return studentToString + ", Degree: " + degreeSought;
		
	}
	
	

	public static void main(String[] args) {

		//Graduate one = new Graduate("Myriam", 12, 48, "masters");
		Undergraduate one = new Undergraduate("Myriam", 12, 48, "grad");
		System.out.println("undergrad");
		System.out.println(one.toString());
		System.out.println(one.eligibleforHonorSociety(4.0));

	}




}
