//Myriam Diabagate | Project 2 | 10/17/23
// This class is the superclass. It has a constructor that creates a student object with name, creditHours and qualityPoints. These variables are used in the girst methos, gpa() which calculates the quotient of quality points and credit hours. It has an overriden toString method whichreturns the name and gpa as a string. it has a method which sets the gpa threshhold and another method which returns a boolean that indicates whether a student is eligible for honors society or not.

public class Student {
	private String name;
	private double creditHours;
	private double qualityPoints;
	
	public Student() {};
	
	public Student(String name, int creditHours, int qualityPoints) {
		this.name = name;
		this.creditHours = creditHours;
		this.qualityPoints = qualityPoints;
	}
	
	public double gpa() {
		double gradePointAverage = qualityPoints / creditHours ;
		String formatted = String.format("%.2f", gradePointAverage);
	
		return Double.parseDouble(formatted);
		
				
		
	}
	
	@Override
	public String toString() {
		return name + ", GPA:" + gpa();
		
	}
	
	public static double setGPAThreshhold(double min) {
		double threshhold = min;
		
		return threshhold;
	};
	
	public boolean eligibleforHonorSociety(double min) {
		if (gpa() >= setGPAThreshhold(min)) {
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student one = new Student("Myriam", 18, 14);
		System.out.println("Hello World!");
		System.out.println("gpa " + one.gpa());
		System.out.println(one.setGPAThreshhold(4.5));
		System.out.println(one.eligibleforHonorSociety(4.5));

	}

}
