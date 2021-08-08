package javacore.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface DemoRepeatable {

	DemoAnnotation[] value();
	
}
