package top.selfhelp;

import top.selfhelp.entity.Student;

import java.lang.annotation.Annotation;

/**
 * @author zhuyuqiang
 */
public class AnnotationApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass(Student.class.getName());
		// get class all annotations
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		for(int i = 0;i<annotations.length;i++){
			//print annotation name
			System.out.println(annotations[i].annotationType().toString());
		}
	}
}
