
public class Course{										//课程类
	private String id;//注意类的属性都要设置为私有属性
	private String name;
	//构造器不用void
	public Course(String id,String name){
		this.setId(id);
		this.setName(name);
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
}
