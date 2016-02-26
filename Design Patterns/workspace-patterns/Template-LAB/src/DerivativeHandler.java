

public class DerivativeHandler extends DataHandler {
	@Override
	protected boolean isValidFileType(String fileName) {
		// Support processing of file if in txt format
		return fileName.endsWith(".txt");
	}

	@Override
	protected void process(DataObject data) {
		System.out.println("Process data for derivative!!!");
	}
	
	@Override
	protected DataObject transformData(String strLine) {
		System.out.println("Transforming data for derivative!!!");
		return null;
	}
}