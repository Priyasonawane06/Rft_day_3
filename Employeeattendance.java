package briglab;

import java.util.Random;

public class Employeeattendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rand = new Random();
		
		int checkPresent=2;
		int intRandom=rand.nextInt(checkPresent);
		
		if(intRandom==1)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}


	}


