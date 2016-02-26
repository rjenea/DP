package withoutproxy;

import java.util.ArrayList;
import java.util.List;


public class TestClient {

	public static void main(String[] args) {
		
		HighResolutionImage highResolutionImage1 = new HighResolutionImage("path1");
		HighResolutionImage highResolutionImage2 = new HighResolutionImage("path2");
		
		List<Image> images = new ArrayList<>();
		images.add(highResolutionImage1);
		images.add(highResolutionImage2);
		
		ImageViewer imageViewer= new ImageViewer(images);
		imageViewer.displayImages();
	}
}
