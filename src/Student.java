import java.util.HashSet;
import java.util.Set;

public class Student{										//ѧ����
	private String id;
	private String name;
	private Set<Course> course;
	//���췽��
	public Student(String id,String name){
		this.setId(id);
		this.setName(name);
		//Set�ӿ�Ҫͨ����������HashSet��ʵ��
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
