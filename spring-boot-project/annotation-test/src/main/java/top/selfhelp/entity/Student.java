package top.selfhelp.entity;

import top.selfhelp.annotation.AnnotationOne;
import top.selfhelp.annotation.AnnotationTwo;

/**
 * @author zhuyuqiang
 */
@AnnotationTwo(name = "hello-student")
public class Student {
	String name;

	@AnnotationOne
	String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
