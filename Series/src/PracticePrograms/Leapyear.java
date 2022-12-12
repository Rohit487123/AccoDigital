package PracticePrograms;

public class Leapyear {
	

	public static void main(String[] args) {

		boolean leap=false;
		
		int year =1615;
		
		if(year%4==0) {
			if(year%100==0){
				if(year%400==0){
					leap=true;
				}else {
					leap=false;
				}
			}    else {
			leap=true;
		}
			
		} else {
			leap=false;
		}
		
		
		if(leap) {
			System.out.println("leap year");
		}
		else {System.out.println("not");
		
		
		
	}

}

}
