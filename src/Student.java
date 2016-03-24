import java.util.HashSet;
import java.util.Set;

public class Student{										//学生类
	private String id;
	private String name;
	private Set<Course> course;
	//构造方法
	public Student(String id,String name){
		this.setId(id);
		this.setName(name);
		//Set接口要通过它的子类HashSet来实现
		this.course=new HashSet<Course>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
}
