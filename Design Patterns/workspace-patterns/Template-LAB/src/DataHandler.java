import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * DataHandler provide template method execute which define algorithm for
 * processing financial system data files.
 * 
 * Algorithm: 1. Validate file type 2. Transform Data 3. Process Data
 * 
 * Subclass should implement specific behaviour based on investment file type
 * (Stock/Derivative).
 * 
 */

public abstract class DataHandler {
	/**
	 * This is template method define algorithm for accessing financial system
	 * data files.
	 * 
	 * @param fileName
	 *            String
	 */

	public final void execute(String fileName) {
		if (isValidFileType(fileName)) {
			try { // process file
				// Open the file that is the first
				
				
				FileInputStream fstream = new FileInputStream(fileName);

				// Get the object of DataInputStream
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(
						new InputStreamReader(in));
				String strLine;

				// Read File Line By Line
				while ((strLine = br.readLine()) != null) {
					if (isDebugMode()) {
						System.out.println("Processing data:" + strLine);
					}
					DataObject data = transformData(strLine);
					process(data);
				}
				// Close the input stream
				in.close();
			} catch (Exception e) { // Catch exception if any
				e.printStackTrace();
			}
		}
	}

	/**
	 * Validate File type. Subclass should implement specific behaviour.
	 * 
	 * @param fileName
	 *            String
	 * @return boolean
	 */
	protected abstract boolean isValidFileType(String fileName);

	/**
	 * Transform data to data Object. Subclass should implement specific
	 * behaviour.
	 * 
	 * @param fileName
	 *            String
	 * @return DataObject
	 */
	protected abstract DataObject transformData(String fileName);

	/**
	 * Subclass should override this method to persist/process data within
	 * database.
	 * 
	 * @param data
	 *            DataObject
	 */
	protected abstract void process(DataObject data);

	/**
	 * This is a hook method and DataHandler define default configuration for
	 * setting log in debug mode. Subclass can override this method. Subclass
	 * can use hook to control execution of algorithm.
	 * 
	 * @return boolean
	 */

	protected boolean isDebugMode() {
		return false;
	}
}