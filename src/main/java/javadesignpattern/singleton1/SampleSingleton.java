package javadesignpattern.singleton1;

import java.io.Serializable;

final class SampleSingleton implements Serializable {

	private static SampleSingleton sampleSingleton;

	protected Object readResolve() {
		return getInstance();
	}

	private SampleSingleton() {
	}

	public static SampleSingleton getInstance() {
		if (sampleSingleton == null) {
			// synchronized (sampleSingleton) { //this will throw a nullpointerexcep
			synchronized (SampleSingleton.class) {
				if (sampleSingleton == null) { // Double checking
					sampleSingleton = new SampleSingleton();
				}
			}
		}
		return sampleSingleton;
	}

}
