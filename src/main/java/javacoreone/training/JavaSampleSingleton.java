package javacoreone.training;

import java.io.Serializable;

public final class JavaSampleSingleton implements Serializable, Cloneable {

	private static JavaSampleSingleton singletoninst;

	private JavaSampleSingleton() {
	}

	public static JavaSampleSingleton getInstance() {

		if (singletoninst == null) {
			synchronized (JavaSampleSingleton.class) {
				if (singletoninst == null) {
					singletoninst = new JavaSampleSingleton();
				}
			}
		}
		return singletoninst;
	}

	public JavaSampleSingleton readResolve() {
		return getInstance();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
