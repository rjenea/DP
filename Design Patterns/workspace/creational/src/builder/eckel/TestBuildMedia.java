package builder.eckel;

import static org.junit.Assert.*;

//: builder:BuildMedia.java
// Example of the Builder pattern
import java.util.*;

import org.junit.Test;

public class TestBuildMedia {
	private List<MediaItem> input = Arrays.asList(new MediaItem[] { new MediaItem("item1"), new MediaItem("item2"),
			new MediaItem("item3"), new MediaItem("item4"), });

	@Test
	public void testBook() {
		MediaDirector buildBook = new MediaDirector(new BookBuilder());
		Media book = buildBook.produceMedia(input);
		String result = "book: " + book;
		System.out.println(result);
		assertEquals(result, "book: [item1, item2, item3, item4]");
	}

	@Test
	public void testMagazine() {
		MediaDirector buildMagazine = new MediaDirector(new MagazineBuilder());
		Media magazine = buildMagazine.produceMedia(input);
		String result = "magazine: " + magazine;
		System.out.println(result);
		assertEquals(result, "magazine: [item1, item2, item3, item4]");
	}

	@Test
	public void testWebSite() {
		MediaDirector buildWebSite = new MediaDirector(new WebSiteBuilder());
		Media webSite = buildWebSite.produceMedia(input);
		String result = "web site: " + webSite;
		System.out.println(result);
		assertEquals(result, "web site: [item1, item2, item3, item4]");
	}
}