import java.util.HashMap;
import java.util.Map;
//��Map�ӿ���ʵ��ѧ�����Ͷ���ĳ�װ
public class Maptest{                                      //ѧ������
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
