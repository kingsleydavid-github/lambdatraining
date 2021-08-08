package lambdatraining.datetime;

import java.util.ArrayList;

public class DCollectionMain {

	public static void main(String[] args) {

		DCollection<Integer> dcoll1 = new DCollection<>(new ArrayList<>(), 5, 3);
		try {
			for (int i = 0; i < 10; i++) {
				dcoll1.addElement(i);
				System.out.println(i);
			}
			System.out.println(dcoll1.toString());
			
			for (int i = 10; i > 3; i--) {
				dcoll1.removeElement(i);
			}
			System.out.println(dcoll1.toString());

		} catch (UpperLimitExceededException ue) {
			System.out.println(ue.getMessage());;

		} catch (LowerLimitExceededException le) {
			System.out.println(le.getMessage());
		}

	}

}
