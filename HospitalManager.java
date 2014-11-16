public class HospitalManager {
	private static Patient patientListStart = null;

	public static void main(String[] args) {

		HospitalManager hm = new HospitalManager();
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		Patient patient2 = new Patient("Mary", 12, "Pneumonia");
		patientListStart.addPatient(patient2);
		Patient patient3 = new Patient("Marie", 29, "Tonsilitis");
		patient2.addPatient(patient3);
		Patient patient4 = new Patient("Becky", 29, "Sarcasm");
		patient3.addPatient(patient4);
		Patient patient5 = new Patient("Gareth", 29, "Genius");
		patient4.addPatient(patient5);
		Patient patient6 = new Patient("King Kong", 102, "Gigantism");
		patient5.addPatient(patient6);
		Patient patient7 = new Patient("Hillary", 45, "Mumps");
		patient6.addPatient(patient7);
		Patient patient8 = new Patient("Johnnie", 35, "Enthusiasm");
		patient7.addPatient(patient8);
		Patient patient9 = new Patient("Sylvain", 52, "Broodiness");
		patient8.addPatient(patient9);
		Patient patient10 = new Patient("Marguerite", 32, "Sniggering");
		patient9.addPatient(patient10);
		System.out.println(patient9.getNextPatientName());
		System.out.println(patient8.getNextPatientName());
		System.out.println(patient7.getNextPatientName());
		System.out.println(patient6.getNextPatientName());
		System.out.println(patient5.getNextPatientName());
		System.out.println(patient4.getNextPatientName());
		System.out.println(patient3.getNextPatientName());
		System.out.println(patient2.getNextPatientName());
		System.out.println(patientListStart.getNextPatientName());
		
		System.out.println(patient4.getNextPatientName());
		patient2.deletePatient(patient5);
		System.out.println(patient4.getNextPatientName());

		System.out.println(patient7.getNextPatientName());
		patientListStart.deletePatient(patient8);
		System.out.println(patient7.getNextPatientName());
		
		System.out.println(patientListStart.getNextPatientName());
		patientListStart.deletePatient(patientListStart);
		System.out.println(patientListStart.getNextPatientName());
	}
}