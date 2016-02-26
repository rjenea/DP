package withproxy;

import java.util.List;


public class ImageViewer {

	List<Image> images;
	
	public ImageViewer(List<Image> images) {
		this.images=images;
	}
	
	public void displayImages(){
		
		for(Image image:images){
			image.showImage();
		}
	}
	
	
}
