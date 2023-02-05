package briglab;

public class EmployeeWaageCalculate {

	   short wagePerHour;
	   short fullDayHour;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instance variable
		
		
	
			EmployeeWaageCalculate dailyWage = new EmployeeWaageCalculate();
			dailyWage.wagePerHour = 20;
			dailyWage.fullDayHour=8;
			
			int calculate = (int)(dailyWage.wagePerHour * dailyWage.fullDayHour);
			System.out.println("The daily employee wage is :"+calculate);
		}
	

	}


