package template;

public abstract class DataParser {

	public final void parseAndGenerateOutput(){
		
		init();
		loadData();
		writeData();
		uploadToFTP();
	}
	
	protected abstract void init();
	
	protected abstract void loadData();
	
	protected void writeData(){
		
		// default implementation.. write an HTML file.
	}

	protected void uploadToFTP(){
		// default implementation.. upload output file to FTP
	}
}
