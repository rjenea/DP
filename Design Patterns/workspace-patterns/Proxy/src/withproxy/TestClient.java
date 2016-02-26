package withproxy;

import java.util.ArrayList;
import java.util.List;


public class TestClient {

	public static void main(String[] args) {
		
		ImageProxy imageProxy1 = new ImageProxy("path1");
		ImageProxy imageProxy2 = new ImageProxy("path2");
		
		
		
		List<Image> images = new ArrayList<>();
		images.add(imageProxy1);
		images.add(imageProxy2);
		
		ImageViewer imageViewer= new ImageViewer(images);
		imageViewer.displayImages();
	}
}
