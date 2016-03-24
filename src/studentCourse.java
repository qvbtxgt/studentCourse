
import java.util.Scanner;
import java.util.Set;

/**
 * �ṩ��ѡ�γ�
 * ����ѧ�����󣬲�����ѧ��������ſγ̣������ѧ����course-Set���͵������У�
 * 		����̨��Ҫ��ʾ����ѡ�γ̣�
 * 		ѭ�����Σ�ÿ������γ�ID��
 * 		��ѧ����course����������������IDƥ��Ŀγ̣�
 * 		���ѧ��ѡ��Ŀγ̣�
 * @author Admin
 *
 */
public class studentCourse {
	public static void main(String[] args) {
		ListTest<Course> lt=new ListTest<Course>();
		lt.listAdd();
		lt.testForEach();
		Maptest mt=new Maptest();
		testput(mt, lt);
		print(mt);
		
	}	
	//courseSet()��������������Ŀγ�ID��ʹ��Set����Ϊѧ�����3�ſγ�
	public static void courseSet(ListTest<Course> lt,Student student) {
		System.out.println("��ӭѧ����"+student.getName()+"ѡ�Ρ�");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		//Ϊѧ�����3�ſγ�
		int i=0;
		while(i<3){
			System.out.println("������γ�ID��");
			String courseId=scanner.next();
			//�ж��Ƿ�����������ID��ƥ��Ŀγ�
			for (Course cr:lt.getCourseToSelect()) {
				if ((cr.getId()).equals(courseId)) {
					//��ѧ����course����������������IDƥ��Ŀγ�
					student.getCourse().add(cr);
					i++;
				}
			}
		}
		for (Course cr:student.getCourse()) {
			System.out.println(student.getName()+"ѡ�˿γ̣�"+cr.getId()+":"+cr.getName());
		}
	}
	/*
	 * ����ѧ��ID���ж��Ƿ�ռ�ã���δ��ռ�ã�������������������ѧ������
	 * ����ӵ�studClass�У�������courseSet����������Ϊÿһ��ѧ�����3�ſγ̡�
	 */
	public static void testput(Maptest mt,ListTest<Course> lt) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("������ѧ��ID��");
			String studId=scanner.next();
			//�ж�����ѧ��ID�Ƿ����
			if (mt.getStudClass().containsKey(studId)) {
				System.out.println("����ѧ��ID��ռ�ã�");
				continue;
			}else {
				System.out.println("������ѧ��������");
				String studname=scanner.next();
				//����һ���µ�ѧ������
				Student stud=new Student(studId, studname);
				//����һ���µ�ID��ѧ�������ӳ���ϵ
				mt.getStudClass().put(studId, stud);
				courseSet(lt,stud);
				i++;
			}
		}
		System.out.println(mt.getStudClass().size()+"λͬѧ�����ɹ������Ҹ�ѡ����3�ſγ̡�");
	}
	
	/*
	 * print����������������ѧ������ѡ��Ŀγ�ȫ����ӡ����
	 */
	public static void print(Maptest mt) {
		System.out.println("\n------------------���Ƿָ���-------------------\n");
		Set<String> keyset=mt.getStudClass().keySet();
		for (String ks : keyset) {
			System.out.println("��"+ks+"λѧ������Ϣ��");
			Student stud=mt.getStudClass().get(ks);
			if (stud!=null) {
				System.out.println(stud.getId()+"��:"+stud.getName());
				System.out.println("ѡ��Ŀγ��У�");
				for (Course cr:stud.getCourse()) {
					System.out.println(cr.getId()+":"+cr.getName());
				}
			}else {
				continue;
			}
		}
	}
}
