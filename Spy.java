public class Spy {

	public static int spyCount = 0;
	private int spyID;

	public Spy(int spyID) {
		this.spyID = spyID;
		spyCount++;
		System.out.println("Spy ID is " + spyID);
		System.out.println("Total number of Spys so far is ... " + spyCount);
	}
}