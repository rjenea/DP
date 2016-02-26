/*
 * Sample client to test Template Pattern.
 */
public class TemplateMethodClient {

	public static void main(String[] args) {
		DataHandler handler = new StockHandler();
		handler.execute("./src/files/stockdata.csv");
		
		//DataHandler handler2 = new DerivativeHandler();
		//handler2.execute("./src/files/derivativeData.txt");
	}
}