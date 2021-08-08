package lambdatraining.singletondesign;

public class CustomLogging {

	private static CustomLogging logger = new CustomLogging() ;

	

	private static CustomLogging getInstance() {
		if(logger == null)
		{
			return new CustomLogging();
		}else
		{
			return logger;
		}
	}
	
}
