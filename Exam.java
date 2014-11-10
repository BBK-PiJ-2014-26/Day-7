public class Exam {

	private int examMark;
	public static int studentCount = 0;
	public static int distinctionCount = 0;
	public static int passCount = 0;
	public static int failCount = 0;
	public static int invalidCount = 0;

	public Exam(int examMark) {
		if (examMark > 100 || examMark < -1) {
			invalidCount++;
		} else if (70 <= examMark && examMark <= 100) {
			studentCount++;
			distinctionCount++;
		} else if (50 <= examMark && examMark <= 69) {
			studentCount++;
			passCount++;
		} else if (0 <= examMark && examMark <= 49) {
			studentCount++;
			failCount++;
		}
	}
}