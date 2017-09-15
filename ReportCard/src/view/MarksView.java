package view;

import dto.MarksDTO;
import model.MarksModel;

public class MarksView {
	
	public void printMarks(int index){
		
		MarksModel marksModel = new MarksModel();
		
		MarksDTO marksDTO = marksModel.getMarks(index);
		System.out.println(" | "+"FCS: "+marksDTO.getFcs()+" | "+"CG-MMT: "+marksDTO.getCgMmt()+" | "+"CNS: "+marksDTO.getcNs()+" | "
		                  +"STLD: "+marksDTO.getStld()+" | "+"DS: "+marksDTO.getDs()+" | ");
		System.out.println(" | "+"Total Marks: "+marksDTO.getTotalMarks()+" | "+"Percentage: "+marksDTO.getPercentage()
				          +" | "+"Grade "+marksDTO.getGrade());
	}

}
