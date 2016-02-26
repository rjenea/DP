package dzone;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public void compress(ArrayList<File> files) {
		System.out.println("Zip strategy");
	}
}
