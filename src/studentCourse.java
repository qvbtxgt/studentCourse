
import java.util.Scanner;
import java.util.Set;

/**
 * 提供备选课程
 * 创建学生对象，并给该学生添加三门课程（添加在学生的course-Set类型的属性中）
 * 		控制台中要显示出备选课程；
 * 		循环三次，每次输入课程ID；
 * 		往学生的course属性中添加与输入的ID匹配的课程；
 * 		输出学生选择的课程；
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
	//courseSet()方法：根据输入的课程ID，使用Set集合为学生添加3门课程
	public static void courseSet(ListTest<Course> lt,Student student) {
		System.out.println("欢迎学生："+student.getName()+"选课。");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		//为学生添加3门课程
		int i=0;
		while(i<3){
			System.out.println("请输入课程ID：");
			String courseId=scanner.next();
			//判断是否存在于输入的ID相匹配的课程
			for (Course cr:lt.getCourseToSelect()) {
				if ((cr.getId()).equals(courseId)) {
					//往学生的course属性中添加与输入的ID匹配的课程
					student.getCourse().add(cr);
					i++;
				}
			}
		}
		for (Course cr:student.getCourse()) {
			System.out.println(student.getName()+"选了课程："+cr.getId()+":"+cr.getName());
		}
	}
	/*
	 * 输入学生ID，判断是否被占用，若未被占用，则输入姓名，创建新学生对象，
	 * 并添加到studClass中，并调用courseSet（）方法，为每一个学生添加3门课程。
	 */
	public static void testput(Maptest mt,ListTest<Course> lt) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生ID：");
			String studId=scanner.next();
			//判断输入学生ID是否存在
			if (mt.getStudClass().containsKey(studId)) {
				System.out.println("输入学生ID已占用！");
				continue;
			}else {
				System.out.println("请输入学生姓名：");
				String studname=scanner.next();
				//创建一个新的学生对象
				Student stud=new Student(studId, studname);
				//创建一个新的ID与学生对象的映射关系
				mt.getStudClass().put(studId, stud);
				courseSet(lt,stud);
				i++;
			}
		}
		System.out.println(mt.getStudClass().size()+"位同学创建成功，并且各选择了3门课程。");
	}
	
	/*
	 * print（）方法：将所有学生及其选择的课程全部打印出来
	 */
	public static void print(Maptest mt) {
		System.out.println("\n------------------我是分隔符-------------------\n");
		Set<String> keyset=mt.getStudClass().keySet();
		for (String ks : keyset) {
			System.out.println("第"+ks+"位学生的信息：");
			Student stud=mt.getStudClass().get(ks);
			if (stud!=null) {
				System.out.println(stud.getId()+"号:"+stud.getName());
				System.out.println("选择的课程有：");
				for (Course cr:stud.getCourse()) {
					System.out.println(cr.getId()+":"+cr.getName());
				}
			}else {
				continue;
			}
		}
	}
}
