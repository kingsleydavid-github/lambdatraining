package javacore.annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(DemoRepeatable.class)
@interface DemoAnnotation {
	String word() default "demo";
	int val() default 0;	
}
