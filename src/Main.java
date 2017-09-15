public class Main {

	public static void main(String[] args) {
		StudentGroup stu1=new StudentGroup("Sai");
		StudentGroup stu2=new StudentGroup("Ram");
		System.Out.println("creating 2 students");
		stu1.add("\n1: sri");
		stu1.add("\n2: sriram");
		System.out.println();
		System.out.println("number of students:"+stu1.getnumberOfStudents()+"students are:");
		Student[] students=stu1.getstudents();
		stu1.remove("sri");
		System.out.println("removed student sri");
		students.bubbleSort(Student[],3);

		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
