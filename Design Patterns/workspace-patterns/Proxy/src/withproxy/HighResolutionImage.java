package withproxy;


public class HighResolutionImage implements Image{

	private String imagePath;
	
	public HighResolutionImage(String imagePath) {
		this.imagePath=imagePath;
		System.out.println("Object of Hige Resolution created");
	}
	
	@Override
	public void showImage() {
		System.out.println("Im a high resolution image..."+imagePath);
		
	}

	
}
