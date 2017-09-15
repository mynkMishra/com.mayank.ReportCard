package model;

import dto.DetailDTO;

public class DetailModel {
	
	DetailDTO detailDTO[] = new DetailDTO[5];
	
	public DetailDTO setDetail(int rollNo, String name, String stream, int year){
		DetailDTO detailDTO = new DetailDTO();
		detailDTO.setRollNo(rollNo);
		detailDTO.setName(name);
		detailDTO.setStream(stream);
		detailDTO.setYear(year);
		return detailDTO;
		
	}
	
	public void makeDetail(){
		
		detailDTO[0] = this.setDetail(042, "Mayank Jha", "CSE-(A)", 2);
		detailDTO[1] = this.setDetail(043, "Mayank Mishra", "CSE-(A)", 2);
		detailDTO[3] = this.setDetail(021, "Rajiv Gautum", "IT-(A)", 1);
		detailDTO[4] = this.setDetail(053, "Piyush Goel", "CSE-(B)", 3);
	}
	
	public DetailDTO getDetail(int index){
		
		return detailDTO[index];
	}
	
	
	

}
