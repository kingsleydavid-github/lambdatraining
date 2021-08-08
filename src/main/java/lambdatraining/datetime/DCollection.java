package lambdatraining.datetime;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 732997
 *
 * @param <T>
 */
public class DCollection<T> extends ArrayList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1391908132430742222L;
	
	
	private final Integer upperLimit;
	private final Integer lowerLimit;

	private List<T> dList;

	public DCollection(List<T> list) {
		this.upperLimit = 15;
		this.lowerLimit = 5;
		this.dList = list;
	}

	public DCollection(List<T> list, Integer upperLimit, Integer lowerLimit) {
		this.upperLimit = upperLimit;
		this.lowerLimit = lowerLimit;
		this.dList = list;
	}

	public List<T> addElement(T t) throws UpperLimitExceededException {
		if (this.dList.size() != upperLimit) {
			this.dList.add(t);
		} else {
			throw new UpperLimitExceededException("Upper Limit Exceeded");
		}
		return dList;
	}

	public List<T> removeElement(T t) throws LowerLimitExceededException {
		if (this.dList.size() != lowerLimit) {
			this.dList.remove(t);
		} else {
			throw new LowerLimitExceededException("Lower Limit Exceeded");
		}
		return dList;
	}

	@Override
	public String toString() {
		return dList.toString();
	}
}
