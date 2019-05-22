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
	public static void main(String[] args){
		Student[] students = {

			new Student("Brian Furness", 28, 193),
					new Student("Rick Morty", 20, 40142),
					new Student("Mary Jane", 18, 13450),
					new Student("James James", 23, 3145),
					new Student()
				};
		
		// give Brian a GPA
		students[0].setGPA(4.0f);
		
		// fill in the last student.
		students[4].setName("Sarah Oslin");
		students[4].setAge(27);
		students[4].setStudentId(13425);
		
		Course c = new Course("Students 101");
		for (Student student : students){
			c.addStudent (student);
		}
		for (Student student : c.getStudents()){
			System.out.println (student);
		}
		c.dropStudent(students[1]);
		c.dropStudent(students[1]);
	}
	
	
	
}
