package dzone;

import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	private CompressionStrategy strategy;

	// Can be set at runtime by the application preferences
	public void setCompressionStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	// Use the strategy
	public void createArchive(ArrayList<File> files) {
		strategy.compress(files);
	}

}