package Day41Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnnotation3(id = 123)
public class TestMyAnnotation3 {
	int noId;
	
	public static void main(String[] args) throws Exception{
		Class<?> c = Class.forName("Day41Annotation.TestMyAnnotation3");
		Field[] fs = c.getDeclaredFields();
		for(Field f:fs) {
			if("id".equals(f.getName())  && "int".equals(f.getType().getSimpleName())) {
				MyAnnotation3 myAnnotation3 = f.getAnnotation(MyAnnotation3.class);
				System.out.println(f.getName());
				break;
			}else {
				throw new Exception("没有int类型的id属性");
			}
		}		
	}
}
