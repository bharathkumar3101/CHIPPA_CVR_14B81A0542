import java.util.Date;
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
	int length=0;
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
		// Add your implementation here
		for(int i=0;i<students.length;++i) {
			this.students[i]=students[i];
		}
		length+=students.length;
	}
  
	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		 students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		for(int i=1;i<=length;++i) {
			students[i]=students[i-1];
		}
		students[0]=student;
		++length;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[length]=student;
		length++;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		for(int i=index+1;i<=length;++i) {
			students[i]=students[i-1];
		}
		students[index]=student;
		++length;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		for(int i=index;i<length-1;++i) {
			 students[i]=students[i+1];
		}
		--length;
	}

	@Override
	public void remove(Student student) {
		int remindex=0;
		for(int i=0;i<length;++i) {
			if(students[i].equals(student)) {
				remindex=i;
				break;
			}
		}
		this.remove(remindex);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		for(int i=index+1;i<length;++i) {
			this.remove(i);
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int remindex=0;
		for(int i=0;i<length;++i) {
			if(students[i].equals(student)) {
				remindex=i;
				break;
			}
		}
		this.removeFromIndex(remindex);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		for(int i=0;i<index;++i) {
			this.remove(i);
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int remindex=0;
		for(int i=0;i<length;++i) {
			if(students[i].equals(student)) {
				remindex=i;
				break;
			}
		}
		this.removeToIndex(remindex);
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		int count=0;
		for(int i=0;i<students.length;++i) {
			if(students[i].getBirthDate()==date) {
				++count;
			}
		}
		int j=0;
		Student[] s=new Student[count];
		for(int i=0;i<students.length;++i) {
			if(students[i].getBirthDate()==date) {
				s[j++]=students[i];
			}
		}
		return s;
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
	
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double maxAvg=0.0;
		int count=0;
		for(int i=0;i<length;++i) {
			if(students[i].getAvgMark()>maxAvg) {
				maxAvg=students[i].getAvgMark();
			}
		}
		
		for(int i=0;i<length;++i) {
			if(students[i].getAvgMark()==maxAvg) {
				++count;
			}
		}
		Student[] s=new Student[count];
		int j=0;
		for(int i=0;i<length;++i) {
			if(students[i].getAvgMark()==maxAvg) {
				s[j++]=students[i];
			}
		}
		return s;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i;
		for( i=0;i<length;++i) {
			if(students[i].equals(student)) {
				break;
			}
		}
		return students[i+1];
	}
}
