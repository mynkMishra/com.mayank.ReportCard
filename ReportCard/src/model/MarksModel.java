package model;

import dto.MarksDTO;

public class MarksModel {
	
	MarksDTO marksModel[] = new MarksDTO[5];
	
	public MarksDTO setResult(int fcs, int cgMmt, int cNs, int stld, int ds){
		MarksDTO marksDTO = new MarksDTO();
		marksDTO.setFcs(fcs);
		marksDTO.setCgMmt(cgMmt);
		marksDTO.setcNs(cNs);
		marksDTO.setStld(stld);
		marksDTO.setDs(ds);
		return marksDTO;
	}
	
	public void makeMarks(){
		marksModel[0] = this.setResult(67, 87, 98, 88, 76);
		marksModel[1] = this.setResult(87, 98, 88, 76, 67);
		marksModel[2] = this.setResult(98, 88, 76, 67, 87);
		marksModel[3] = this.setResult(88, 76, 67, 87, 98);
		marksModel[4] = this.setResult(76, 67, 87, 98, 88);
		
	}
	
	public MarksDTO getMarks(int index){
		
		return marksModel[index];
	}

}
