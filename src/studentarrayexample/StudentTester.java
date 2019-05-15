package studentarrayexample;

/**
 * A hilariously simple student example program.
 * 
 * @author Brian
 */
public class StudentTester {

	/**
	 * The main class of the program.  Simply iterates over a pre-populated list
	 * of Students.
	 * 
	 * @param args the command line arguments.  Not used by this program.
	 */
	public static void main(String[] args) {
		// pre-populate the student array with our 5 static students.
		Student[] students = {
					new Student("Brian Furness", 28, 193),
					new Student("Rick Morty", 20, 40142),
					new Student("Mary Jane", 18, 13450),
					new Student("James James", 23, 3145),
					new Student()
				};
		
		// fill in the last student.
		students[4].setName("Sarah Oslin");
		students[4].setAge(27);
		students[4].setStudentId(13425);
		
		// iterate over them using a for each loop.
		for (Student student : students){
			System.out.println(student);
		}
	}
	
	
	
}
