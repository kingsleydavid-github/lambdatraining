package javatraining.coretraining;

public interface IMyStack<T> {

	public boolean push(T element) throws Exception;
	public T pop(T element) throws Exception;
	public void printall() throws Exception;
}
