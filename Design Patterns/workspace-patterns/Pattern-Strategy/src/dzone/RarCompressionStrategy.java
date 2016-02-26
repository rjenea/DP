package dzone;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compress(ArrayList<File> files) {
		System.out.println("Rar strategy");
	}
}