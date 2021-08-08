package javatraining.coretraining;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements IMyStack<T> {

	private List<T> stack = new ArrayList<T>();

	@Override
	public boolean push(T element) throws Exception {

		if (stack.isEmpty()) {
			stack.add(element);
		} else {
			//stack.add(index, element);
		}

		return true;
	}

	@Override
	public T pop(T element) throws Exception {
		int idx = stack.size();
		T topEle = stack.get(idx);
		stack.remove(idx);
		return topEle;
	}

	@Override
	public void printall() throws Exception {
		System.out.println(stack.toString());
	}
}
