import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {

		System.out.println("Enter exam marks. Type -1 to terminate.");
		Exam exam1 = new Exam(-1);
		int examMark = 0;
		do  {
			System.out.println("Input a mark: ");
			Scanner sc = new Scanner(System.in);
			examMark = sc.nextInt();
			exam1 = new Exam(examMark);
		} while (examMark != -1);
		System.out.println("There are " + exam1.studentCount + " students: " + exam1.distinctionCount + " distinctions, " + exam1.passCount + " passes, " + exam1.failCount + " fails, (plus " + exam1.invalidCount + " invalid entries.");
	}
}