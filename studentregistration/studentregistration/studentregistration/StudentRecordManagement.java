package studentregistration;

// required classes
import java.util.LinkedList;
import java.util.Scanner;

//StudentRecordManagement
public class StudentRecordManagement {

	// Creating an empty LinkedList
	//record
	LinkedList<Record> list;

	// Default Constructor
	public StudentRecordManagement()
	{
		list = new LinkedList<>();
	}

	//1.  Adding Record
	public void add(Record record)
	{

		// Checking if a record already exists or not,
		// if not add it to Record list, Otherwise
		// error display message
		if (!find(record.getIdNumber())) {
			list.add(record);
		}
		else {

			// Print statement
			System.out.println(
				"Record already exists in the Record list");
		}
	}

	//2.  Searching Record
	// idNumber
	public boolean find(int idNumber)
	{

		// Iterating record list
		// using for each loop
		for (Record l : list) {

			// Checking record by id Number
			if (l.getIdNumber() == idNumber) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	//3.  Method
	// Delete Record
	//recIdNumber
	public void delete(int recIdNumber)
	{
		Record recordDel = null;

		// Iterating record list
		for (Record ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getIdNumber() == recIdNumber) {
				recordDel = ll;
			}
		}

		// If recordDel is null, then show error message,
		// otherwise remove the record from Record list
		if (recordDel == null) {

			//No record found
			System.out.println("Invalid record Id");
		}
		else {

			list.remove(recordDel);
			System.out.println(
				"Successfully removed record from the list");
		}
	}

	//4. Method for Finding the Record
	//idNumber
	public Record findRecord(int idNumber)
	{

		// Iterate Record list
		// using for each loop
		for (Record l : list) {

			// Checking record by id Number.
			if (l.getIdNumber() == idNumber) {
				return l;
			}
		}

		return null;
	}

	// Method 5
	// Update Record
	// @param id
	// @param input
	public void update(int id, Scanner input)
	{

		if (find(id)) {
			Record rec = findRecord(id);

			System.out.print(
				"What is the new Student id Number ? ");
			int idNumber = input.nextInt();

			System.out.print(
				"What is the new Student contact Number ");
			int contactNumber = input.nextInt();
			input.nextLine();

			// Display message only
			System.out.print(
				"What is the new Student Name ? ");
			String name = input.nextLine();
			System.out.print(
					"What is student's Course Name ? ");
				String courseName = input.nextLine();

			rec.setIdNumber(idNumber);
			rec.setName(name);
			rec.setContactNumber(contactNumber);
			rec.setcourseName(courseName);
			System.out.println(
				"Record Updated Successfully");
		}
		else {
		

			// Print statement
			System.out.println(
				"Record Not Found in the Student list");
		}
	}

	// Method 6: Display Records
	public void display()
	{

		// If record list is empty then
		// print the message below
		if (list.isEmpty()) {

			// Print statement
			System.out.println("The list has no records\n");
		}
		// Iterating Record list
		// using for each loop
		for (Record record : list) {

			// Printing the list
			System.out.println(record.toString());
		}
	}
}
