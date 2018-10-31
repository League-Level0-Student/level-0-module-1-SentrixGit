package ifs_ints_and_loops;

public class MyAge {

	public static void main(String[] args) {
		int ageDate = 2007;
		int todayDate = 2018;
		
		for (int i = ageDate; i <= todayDate; i++) {
			System.out.println("In " + i + ", I was " + (i - ageDate) + " years old");
		}
	}

}
