
public class Course{										//�γ���
	private String id;//ע��������Զ�Ҫ����Ϊ˽������
	private String name;
	//����������void
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
