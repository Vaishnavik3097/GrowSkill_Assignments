package weeklyassignment;

public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int number = 12345;
	        int reverse = 0;

	        for (; number != 0; number = number / 10) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	        }

	        System.out.println(reverse);

	}

}
