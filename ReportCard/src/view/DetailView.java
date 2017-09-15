package view;

import java.util.Scanner;

import model.DetailModel;

public class DetailView {
	int index = 0;
	Scanner scan;
	
	public void printDetail(){	
		DetailModel detailModel = new DetailModel();
		System.out.println(detailModel.getDetail(index));
		MarksView marksView = new MarksView();
		marksView.printMarks(index);
		nextResult();
		
		}
	
	public void nextResult(){
		if(index<5){
		System.out.println("For next result, press N");
		scan = new Scanner(System.in);
		String next = scan.next();
		
		     if(next.equals("Y")){
		    	 this.index++;
			      printDetail();
			 }
             else
	         {
		          System.out.println("Invalid Input");
			      nextResult();
		     }
		}
		else
		{
			System.out.println("All results printed");
			this.scan.close();
		}
		
		
		
	}

}
