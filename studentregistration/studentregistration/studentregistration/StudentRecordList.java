package studentregistration;

//Importing classes
import java.util.Scanner;

//Class: StudentRecordList
public class StudentRecordList {
	public static void main(String[] args)
	{

		// Creating HumanResourceOffice Object.
		StudentRecordManagement hr
			= new StudentRecordManagement();

		Record record = new Record();
       //record
			record.setIdNumber(121101);
		record.setContactNumber(9838);
		record.setName("Meenu");
		record.setcourseName("AI/ML");

		// Calling add() record method to
		// add static data/(Hard CodedData) to linked List
		hr.add(record);

		// Creating Scanner Object to read input
		Scanner input = new Scanner(System.in);

		// Creating option integer variable
		int option = 0;

		// Do - While loop
		do {
			menu();
			option = input.nextInt();

			// Switch case
			switch (option) {

			// Case 1
			case 1:
                //Id Number
				System.out.print(
					"Student id Number? ");

				int idNumber = input.nextInt();
				//contact number
				System.out.print(
					"Student contact Number? ");

				int contactNumber = input.nextInt();
				input.nextLine();

				System.out.print(
					"Student Name? ");
				//student name as string
				String name = input.nextLine();
				
				System.out.println("Student Course Name? \n1. AI/ML (Available: 20 Seats)\n2. CSE (Available: 30 Seats)\n3. CIVIL (Available: 25 Seats)\n4. Mechanical Engg. (Available: 30 Seats)");

					//student name as string
				String courseName = input.nextLine();

				// Create record object and pass constructor
				// parameters.
					
					//course name
				record = new Record(name, idNumber,
									contactNumber, courseName);
				// Call add() record
				hr.add(record);
				System.out.println(record.toString());

				// from here only once it entered this case
				break; //termination

			case 2:
				System.out.print(
					"Id number ? ");
				int rId = input.nextInt();

				hr.delete(rId); //To delete

				break;

			case 3:

				System.out.print(
					"What is the Student id number? ");

				int rIdNo = input.nextInt();
				hr.update(rIdNo, input);

				break;

			case 4:
				System.out.print(
					"What is the Student id ? ");
				int bookId = input.nextInt();

				if (!hr.find(bookId)) {
					System.out.println(
						"Id does not exist\n");
				}

				break;

			// Case 5
			case 5:
				hr.display();
				break;

			case 9:

				System.out.println(
					"\nThank you. Goodbye!\n");
				System.exit(0);

				break;

			
			// If none above case executes 
			default:

				System.out.println("\nInvalid input\n");
				break;
			}
		}

		// Checking condition
		while (option != 9);
	}


	//Student Registration-Static menu for displaying options
	public static void menu()
	{
		System.out.println("Student Registration");
		System.out.println("1: Add Student");
		System.out.println("2: Delete Student");
		System.out.println("3: Update Student");
		System.out.println("4: Search Student");
		System.out.println("5: Display Students");
		System.out.println("9: Exit program");
		System.out.print("Enter selection : ");
	}
}
