import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest<T>{									//备选课程库
	//用于存放备选课程的List集合,List集合中的元素可重复
	private List<Course> courseToSelect;
	public List<Course> getCourseToSelect() {
		return courseToSelect;
	}
	public void setCourseToSelect(List<Course> courseToSelect) {
		this.courseToSelect = courseToSelect;
	}
	public ListTest() {
		//因为List是一个接口，必须通过子类ArrayList实现
		this.courseToSelect=new ArrayList<Course>();
	}
	//为备选课程库添加课程
	public void listAdd() {
		Course cr1=new Course("1","数据结构");
		//使用add()方法实现集合元素的添加
		courseToSelect.add(cr1);
		
		Course cr2=new Course("2","C语言");
		courseToSelect.add(0,cr2);//从0号索引位置添加元素
		
		//使用addAll()方法实现集合元素的添加
		Course[] cr3={new Course("3","离散数学"),new Course("4","汇编语言")};
		List<Course> c=Arrays.asList(cr3);
		courseToSelect.addAll(c);
		
		Course[] cr4={new Course("5","高等数学"),new Course("6","C++语言")};
		List<Course> c1=Arrays.asList(cr4);
		courseToSelect.addAll(3,c1);//从4号索引位置添加元素
		//List集合中的元素可重复
//		courseToSelect.add(cr1);
//		Course temp7=courseToSelect.get(6);
//		System.out.println("添加了课程"+temp7.getId()+":"+temp7.getName());
	}
	
	//利用for循环的get()方法取出List中的每个元素，get()方法对有序集合才有用
	public void testGet() {
		int size=courseToSelect.size();
		System.out.println("有如下课程待选(利用get()方法)：");
		for (int i = 0; i < size; i++) {
			Course temp=courseToSelect.get(i);
			System.out.println(temp.getId()+":"+temp.getName());
		}
	}
	
	//利用Iterator迭代器遍历并取出List中的每个元素
	public void testIterator() {
		//创建集合的迭代器
		Iterator<Course> it=courseToSelect.iterator();
		System.out.println("有如下课程待选(利用Iterator迭代器)：");
		while (it.hasNext()) {
			Course temp=it.next();
			System.out.println(temp.getId()+":"+temp.getName());
		}
	}
	//利用for each方法遍历并取出List中的每个元素
	public void testForEach() {
		System.out.println("有如下课程待选(利用for each方法)：");
		//从List中取出每一个Course类型的元素
		for (Course cr:courseToSelect) {
			System.out.println(cr.getId()+":"+cr.getName());
		}
	}
}

