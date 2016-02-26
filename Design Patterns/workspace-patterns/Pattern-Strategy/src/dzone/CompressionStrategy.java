package dzone;

import java.io.File;
import java.util.ArrayList;

public interface CompressionStrategy {

	public void compress(ArrayList<File> files);
}
