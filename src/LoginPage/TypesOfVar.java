package LoginPage;

import java.util.Random;

public class TypesOfVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random name = new Random();
						
		String [] myStudents = {"Manar","Malak","Mahmoud","Mureed","Maryam"};
		int rannum = name.nextInt(myStudents.length);
		System.out.println(myStudents[rannum]);
		
		
	}

}
