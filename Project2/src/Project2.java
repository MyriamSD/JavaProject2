//Myriam Diabagate | Project 2 | 10/17/23
// This class contains a main class which uses Java textio to read a text file. If the text file doesn't exist the program terminates. As the data is read in from the text file, it is used to create Student Objects that are then pushed to an ArrayList. From there the class loops through the object to find all those who have met the requirements for honors Society and lists them.

import java.util.ArrayList;
import java.util.Scanner;

import intermediateprogramming.Project1.Player;

import java.text.DecimalFormat;



public class Project2 {

	public static void main(String[] args) throws java.io.IOException{
		ArrayList <Student> studentObjects = new ArrayList<Student>();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		float total = 0;
		float count = 0;
		
	    try {
	    	java.io.File studentFile = new java.io.File("students.txt");
	    	Scanner input = new Scanner(studentFile);
	    	
	    	while (input.hasNext()) {
		          String name = input.next();
		          int creditHours = input.nextInt();
				  int qualityPoints = input.nextInt();
				  String status = input.next().toLowerCase();
				  
				  
		  
				  if (status.equals("freshman") || status.equals("sophomore") || status.equals("junior") || status.equals("senior")) {
					  Student student = new Undergraduate(name, creditHours, qualityPoints, status);
					  
					  total += student.gpa();
					  studentObjects.add(student);
					  count++;
					
					  
					
					  
					  
				  }
				  if (status.equals("masters") || status.equals("grad")) {
					  Student student = new Graduate(name, creditHours, qualityPoints, status);
					  total += student.gpa();
					  studentObjects.add(student);
					  count++;
				
				  }
		         
		        }
	    	
//	    	for (Student student : studentObjects) {
//		    		System.out.println(student.gpa());
//		    		
//		    	}
	    	

	    	String average = String.format("%.2f", total / count);	    
		    double threshhold = Student.setGPAThreshhold(Double.parseDouble(average));
		    
		    System.out.println("The Honor Society GPA Threshhold for this cohort is: " + threshhold);
		    System.out.println("The students who've met the requirements for honors are: ");
		    
		    for (Student student: studentObjects) {
		    	if (student.eligibleforHonorSociety(threshhold)) {
		    		System.out.println(student.toString());
		    	}
		    };
		    
		    
		    
		    
		    if(!studentFile.exists()) {
		    	throw new java.io.IOException("File not found");
		    };
	

		  }
	      catch (java.io.IOException ex) {
	        System.out.println("File not found");
	      }
		System.exit(0);

	}

}
