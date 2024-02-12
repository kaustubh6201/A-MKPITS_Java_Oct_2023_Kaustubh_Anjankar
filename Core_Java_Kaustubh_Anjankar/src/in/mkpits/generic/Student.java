package in.mkpits.generic;

import java.util.Objects;

public class Student {

	private String Name;
	private Integer Rollno;
	public Student(String name, Integer rollno) {
		super();
		Name = name;
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getRollno() {
		return Rollno;
	}
	public void setRollno(Integer rollno) {
		Rollno = rollno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, Rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(Rollno, other.Rollno);
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Rollno=" + Rollno + "]";
	}
	
	
}
