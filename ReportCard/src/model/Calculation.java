package model;

import dto.MarksDTO;

public class Calculation {
	
	int totalMarks;
	float percentage;
	String grade;
	
	public void setCalculation(int index){
		
		MarksModel marksModel = new MarksModel();
		
		MarksDTO marksDTO = marksModel.getMarks(index);
		
		totalMarks = marksDTO.getFcs()+marksDTO.getCgMmt()+marksDTO.getcNs()+marksDTO.getDs()+marksDTO.getStld();
		marksDTO.setTotalMarks(totalMarks);
		
		percentage = (totalMarks/5);
		marksDTO.setPercentage(percentage);
		
		if(percentage>90)
			grade = "A1";
		else if(percentage>80 && percentage<=90)
			grade = "A2";
		else if(percentage>70 && percentage<=80)
			grade = "B1";
		else if(percentage>60 && percentage<=70)
			grade = "B2";
		else if(percentage>50 && percentage<=60)
			grade = "C1";
		else 
			grade = "FAIL";
		
		marksDTO.setGrade(grade);
		
	}
	

}
