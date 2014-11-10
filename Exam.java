public class Exam {

	private int mark;
	public static int studentCount = 0;
	public static int distinctionCount = 0;
	public static int passCount = 0;
	public static int failCount = 0;
	public static int invalidCount = 0;

	public Exam(int mark) {
		if (mark > 100 || mark < -1) {
			invalidCount++;
		} else if (70 <= mark <= 100) {
			studentCount++;
			distinctionCount++;
		} else if (50 <= mark <= 69) {
			studentCount++;
			passCount++;
		} else if (0 <= mark <= 49) {
			studentCount++;
			failCount++;
		}
	}
}