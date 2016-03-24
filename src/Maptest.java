import java.util.HashMap;
import java.util.Map;
//用Map接口来实现学生类型对象的承装
public class Maptest{                                      //学生集合
	private Map<String,Student> studClass;
	public Maptest() {
		this.studClass=new HashMap<String,Student>();
	}
	public Map<String, Student> getStudClass() {
		return studClass;
	}
	public void setStudClass(Map<String, Student> studClass) {
		this.studClass = studClass;
	}
}
