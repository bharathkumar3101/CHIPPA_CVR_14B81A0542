import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws NullPointerException 
		{
		try {
			//You may test that your code works find here
			//Please check that your code works and has no 
			//compilation problems before to submit
			
			DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
			Student student1=new Student(1,"hello",df.parse("1997-10-02"),92.00);
			Student student2=new Student(2,"hello",df.parse("1997-10-02"),92.00);
			Student student3=new Student(3,"hello",df.parse("1992-01-31"),55.00);
			StudentGroup sg=new StudentGroup(100);
			Student[] ss=new Student[3];
			ss[0]=student1;
			ss[1]=student2;
			ss[2]=student3;
			
			
			sg.setStudents(ss);
			
		Student[] s=sg.getStudents();
//			for(Student x:s) {
//				System.out.println(x.getId()+" "+x.getAvgMark()+" "+x.getFullName()+" "+x.getBirthDate());;
//			}
//			sg.remove(0);
//			s=sg.getStudents();
//			for(Student x:s) {
//				System.out.println(x.getId()+" "+x.getAvgMark()+" "+x.getFullName()+" "+x.getBirthDate());;
//			}
//			Student x=sg.getStudent(1);
//		System.out.println(x.getId()+" "+x.getAvgMark()+" "+x.getFullName());
		Student me=new Student(42,"bharath",df.parse("1997-01-31"),77.2);
		sg.add(me,2);
		s=sg.getStudents();
		for(Student y:s) {
			System.out.println(y.getId()+" "+y.getAvgMark()+" "+y.getFullName()+" "+y.getBirthDate());;
		}
//		for(Student y:s) {
//			System.out.println(y.getId()+" "+y.getAvgMark()+" "+y.getFullName()+" "+y.getBirthDate());;
//		}
		sg.removeFromIndex(1);
		s=sg.getStudents();
		for(Student y:s) {
			System.out.println(y.getId()+" "+y.getAvgMark()+" "+y.getFullName()+" "+y.getBirthDate());;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
