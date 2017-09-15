import java.util.Date;
import java.util.Scanner;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	private int numberOfStudents;
        
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
             Student[numberOfStudents]=students;
             numberOfStudents++;
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return numberOfStudents;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
	int index=-1;
	for(i=0;i<numberOfStudents;i++)
	{
	 if(students[i].equalsIgnoreCase(student))
	 {
		index=i;
		if(index!=-1)
		{
		   for(i=index;i<numberOfStudents;i++)
		   students[i]=students[i+1];
		}
		numberOfStudents--;
	  }
	}
       }

         
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
	for(int i=0;i<numberOfStudents;i++)
        {
          students[i]=null;
         }
         numberOfStudents=0;
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	int index=-1;
	for(i=0;i<numberOfStudents;i++)
	{
	 if(students[i].equalsIgnoreCase(student))
	 {
		index=i;
		if(index!=-1)
		{
		   for(i=index;i<numberOfStudents;i++)
		   students[i]=students[i+1];
		}
		numberOfStudents--;
	  }
	}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort(int arr[],int n) {
           	int i,j;
		for(i=0;i<n-1;i++)
		{
		  for(j=0;j<n-i-1;j++)
		   {
			if(arr[j]>arr[j+1])
			    swap(&arr[j],&arr[j+1]);
		   }
		}
         }	

		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
