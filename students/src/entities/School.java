package entities;

public class School {
	
	private String 	name;
	private double firstGrade;
	private double secondGrade;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public double getFirstGrade() {
		return firstGrade;
	}



	public void setFirstGrade(double firstGrade) {
		this.firstGrade = firstGrade;
	}



	public double getSecondGrade() {
		return secondGrade;
	}




	public void setSecondGrade(double secondGrade) {
		this.secondGrade = secondGrade;
	}




	public School(String name, double firstGrade, double secondGrade) {
		super();
		this.name = name;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
	}



	public void approvedStudents() {
	
		double avgGrade = (firstGrade + secondGrade)/2;
		if(avgGrade > 5.0) {
			System.out.println(name);
		}
		
	}


}
	
	


