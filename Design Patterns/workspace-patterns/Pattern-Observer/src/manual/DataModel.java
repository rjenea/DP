package manual;

import java.util.ArrayList;
import java.util.List;

/**
 * A data class which acts as a wrapper to a String, and implements the Observer
 * design pattern to notify listeners of changes to the underlying model.
 *
 */
public class DataModel{
 
	@SuppressWarnings("unused")
	private String data;
 
	private List<DataListener> listeners = new ArrayList<DataListener>();
	/**
	 * Creates a new DataModel.
	 * @param data
	 */
	public DataModel(String data){
		super();
		setData(data);
	}
 
	/**
	 * Removes the parameter listener. 
	 * @param listener
	 */
	public void removeListener(DataListener listener){
		listeners.remove(listener);
	}
	/**
	 * Adds the parameter listener. 
	 * @param listener
	 */
	public void addListener(DataListener listener){
		listeners.add(listener);
	}
	/**
	 * Sets the data of this model. 
	 * @param newData
	 */
	public void setData(String newData){
		this.data = newData;
		for ( int i = 0; i < listeners.size(); i++ ){
			listeners.get(i).dataChanged(this);
		}
	}
}

