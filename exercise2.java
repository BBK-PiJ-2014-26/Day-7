import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {

		System.out.println("Enter exam marks. Type -1 to terminate.");
		int examMark = 0;
		do  {
			System.out.println("Input a mark: ");
			Scanner sc = new Scanner(System.in);
			int examMark = sc.nextInt();
			Exam exam = new Exam(examMark);
		} while (examMark != -1);
		System.out.println("There are " + studentCount + " students: " + distinctionCount + " distinctions, " + passCount + " passes, " + failCount + " fails, (plus " + invalidCount + " invalid entries.");
	}
}