package javacore.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoAnnotationMain {

	@DemoAnnotation(val = 1, word = "kingsley")
	String abc;

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {

		newMethod();
	}

	@DemoAnnotation(word = "test1", val = 1)
	@DemoAnnotation(word = "test2", val = 2)
	@DemoAnnotation(word = "test3", val = 10)
	@DemoAnnotation(word = "test4", val = 3)
	public static void newMethod() throws NoSuchMethodException, SecurityException, NoSuchFieldException {

		DemoAnnotationMain main = new DemoAnnotationMain();

		Class cls = main.getClass();
		Method m1 = cls.getMethod("newMethod");
		Field f1 = cls.getDeclaredField("abc");
		System.out.println(f1.getName());
	
		Annotation a1 = m1.getAnnotation(DemoRepeatable.class);
		Annotation a2 = f1.getAnnotation(DemoAnnotation.class);

		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}
