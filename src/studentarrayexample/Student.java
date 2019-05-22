package studentarrayexample;

/**
 * A hilariously simple, student class.
 * 
 * @author Brian
 */
// 2019-05-22
public class Student {
	
	/**
	 * The name of the student.
	 */
	private String name;
	
	/**
	 * The student's age.
	 */
	private int age;
	
	/**
	 * The students student ID number.
	 */
	private int studentId;
	
	/**
	 * the students Grade Point Average.
	 */
	private float gpa;
	
	/**
	 * max courses for student
	 */
	private int maxCourse;
	
	/**
	 * Create a new student.
	 * 
	 * @param name the student's starting name.
	 * @param age the student's age.
	 * @param studentId the student's current student ID number.
	 */
	public Student (String name, int age, int studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		gpa = -1;
	}
	
	/**
	 * Creates an empty student object.
	 */
	public Student (){
		gpa = -1;
	}
	
	/**
	 * Get the student's name.
	 * 
	 * @return the student's name.
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Set the student's name.
	 * 
	 * @param name the students new name.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Get the student's age.
	 * 
	 * @return the student's current age.
	 */
	public int getAge(){
		return age;
	}
	
	public float getGPA(){
		if (gpa < 0){
			return Float.NaN;
		}
		return gpa;
	}
	
	public void setGPA(float gpa){
		if (gpa >= 0 && gpa <= 4.0){
			this.gpa = gpa;
		}else{
			throw new IllegalArgumentException("Invalid GPA");
		}
	}
	
	/**
	 * Update the student's age.
	 * 
	 * @param age the student's new age.
	 */
	public void setAge(int age){
		// to make this not completely useless let's make sure the age is
		// positive.  This is an example of why using setters and getters
		// can be important.
		if (age > 0){
			this.age = age;
		}else{
			throw new IllegalArgumentException("Age must be positive");
		}
	}
	
	/**
	 * Get the student's student ID.
	 * 
	 * @return the student's student ID.
	 */
	public int getStudentId(){
		return studentId;
	}
	
	/**
	 * Update the student's student ID.
	 * 
	 * @param studentId the new student ID.
	 */
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	
	/**
	 * Output the object as a string.
	 * 
	 * @return The student's name followed by age and ID
	 */
	@Override
	public String toString(){
		if (gpa < 0){
			return name + " age: " + age + " ID: " + studentId;
		}else{
			return name + " age: " + age + " ID: " + studentId + " GPA: " + gpa;
		}
	}

	/**
	 * Get the max courses for the student.
	 * 
	 * @return the maximum number of courses the student may take.
	 */
	public int getMaxCourse() {
		return maxCourse;
	}

	/**
	 * Set the max course that the student can take.
	 * 
	 * @param maxCourse the maximum number of courses the student may take.
	 */
	public void setMaxCourse(int maxCourse) {
		this.maxCourse = maxCourse;
	}
}
