public class Spy {

	public static int spyCount = 0;
	private int spyID;

	public Spy(int spyID) {
		this.spyID = spyID;
		spyCount++;
		System.out.println("Spy ID is " + spyID);
		System.out.println("Total number of Spys so far is ... " + spyCount);
	}

	public void die() {
		spyCount--;
		System.out.println("Spy " + spyID + " has been detected and eliminated");
		System.out.println("Total number of Spys so far is ... " + spyCount);
	}
}