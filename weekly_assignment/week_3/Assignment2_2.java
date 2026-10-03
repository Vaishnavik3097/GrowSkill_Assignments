package weeklyassignment;

public class Assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 987654;
        int count = 0;

        for (; number != 0; number = number / 10) {
            count++;
        }

        System.out.println("Number of digits = " + count);
    

	}

}
