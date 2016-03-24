import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest<T>{									//��ѡ�γ̿�
	//���ڴ�ű�ѡ�γ̵�List����,List�����е�Ԫ�ؿ��ظ�
	private List<Course> courseToSelect;
	public List<Course> getCourseToSelect() {
		return courseToSelect;
	}
	public void setCourseToSelect(List<Course> courseToSelect) {
		this.courseToSelect = courseToSelect;
	}
	public ListTest() {
		//��ΪList��һ���ӿڣ�����ͨ������ArrayListʵ��
		this.courseToSelect=new ArrayList<Course>();
	}
	//Ϊ��ѡ�γ̿���ӿγ�
	public void listAdd() {
		Course cr1=new Course("1","���ݽṹ");
		//ʹ��add()����ʵ�ּ���Ԫ�ص����
		courseToSelect.add(cr1);
		
		Course cr2=new Course("2","C����");
		courseToSelect.add(0,cr2);//��0������λ�����Ԫ��
		
		//ʹ��addAll()����ʵ�ּ���Ԫ�ص����
		Course[] cr3={new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		List<Course> c=Arrays.asList(cr3);
		courseToSelect.addAll(c);
		
		Course[] cr4={new Course("5","�ߵ���ѧ"),new Course("6","C++����")};
		List<Course> c1=Arrays.asList(cr4);
		courseToSelect.addAll(3,c1);//��4������λ�����Ԫ��
		//List�����е�Ԫ�ؿ��ظ�
//		courseToSelect.add(cr1);
//		Course temp7=courseToSelect.get(6);
//		System.out.println("����˿γ�"+temp7.getId()+":"+temp7.getName());
	}
	
	//����forѭ����get()����ȡ��List�е�ÿ��Ԫ�أ�get()���������򼯺ϲ�����
	public void testGet() {
		int size=courseToSelect.size();
		System.out.println("�����¿γ̴�ѡ(����get()����)��");
		for (int i = 0; i < size; i++) {
			Course temp=courseToSelect.get(i);
			System.out.println(temp.getId()+":"+temp.getName());
		}
	}
	
	//����Iterator������������ȡ��List�е�ÿ��Ԫ��
	public void testIterator() {
		//�������ϵĵ�����
		Iterator<Course> it=courseToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ(����Iterator������)��");
		while (it.hasNext()) {
			Course temp=it.next();
			System.out.println(temp.getId()+":"+temp.getName());
		}
	}
	//����for each����������ȡ��List�е�ÿ��Ԫ��
	public void testForEach() {
		System.out.println("�����¿γ̴�ѡ(����for each����)��");
		//��List��ȡ��ÿһ��Course���͵�Ԫ��
		for (Course cr:courseToSelect) {
			System.out.println(cr.getId()+":"+cr.getName());
		}
	}
}

