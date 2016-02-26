import java.math.BigDecimal;
import java.util.StringTokenizer;

public class StockHandler extends DataHandler {
	@Override
	protected boolean isValidFileType(String fileName) {
		// Support processing of file if in CSV format
		return fileName.endsWith(".csv");
	}

	@Override
	protected void process(DataObject data) {
		if (isDebugMode()) {
			log("Persisting Data!!!");
		}

		// Persist information
		StockDataObject dataVal = (StockDataObject) data;
		log("Stock Name:" + dataVal.getName());
		log("High Value:" + dataVal.getHighValue().toString());
		log("Low Value:" + dataVal.getLowValue().toString());
		log("Open Value:" + dataVal.getOpenValue().toString());
		//log("Close Value:" + dataVal.getCloseValue().toString());
	}

	@Override
	protected DataObject transformData(String strLine) {
		if (isDebugMode()) {
			log("\nStarted Transformation!!!");
		}
		StringTokenizer tokenizer = new StringTokenizer(strLine, ",");
		StockDataObject dataObject = null;
		if (tokenizer.hasMoreTokens() && tokenizer.countTokens() == 4) {
			
			dataObject = new StockDataObject();
			dataObject.setName(tokenizer.nextToken());
			dataObject.setOpenValue(new BigDecimal(tokenizer.nextToken()));
			dataObject.setHighValue(new BigDecimal(tokenizer.nextToken()));
			dataObject.setLowValue(new BigDecimal(tokenizer.nextToken()));
			//dataObject.setCloseValue(new BigDecimal(tokenizer.nextToken()));
		}
		if (isDebugMode()) {
			log("Transform Successful!!!");
		}
		return dataObject;
	}

	private void log(String str) {
		System.out.println(str);
	}

	@Override
	protected boolean isDebugMode() {
		return true;
	}
}