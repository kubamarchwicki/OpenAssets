package org.hackathon.openassets.datagrabber;

import static org.fest.assertions.Assertions.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.rmannibucau.featuredmock.http.FeaturedHttpServer;
import com.github.rmannibucau.featuredmock.http.FeaturedHttpServerBuilder;

public class HtmlDocumentSnippetReaderTest {
	private static FeaturedHttpServer server; 
	
	HtmlDocumentSnippetReader reader = new MockedSnipperReader();

	@Test
	public void parse_snipper() throws InterruptedException {
		
		List<ImageNode> urls = reader.getImageUrls("153773");
		
		assertThat(urls).hasSize(6);
		
		for (int i = 0; i<urls.size(); i++) {
			int index = i+1;
			assertThat(urls.get(i).getId())
				.overridingErrorMessage("Expected pageId [page"+index+"], but got ["+urls.get(i).getId()+"]")
				.isEqualTo("page"+index);
			assertThat(urls.get(i).getUrl())
				.overridingErrorMessage("Expected image ["+index+"], but got ["+urls.get(i).getUrl()+"]")
				.isEqualTo("http://docs.sejmometr.pl/htmlex/153773/p"+index+".png");
			
		}
	}
	
	@Test
	public void snippet_does_not_exists() {
		List<ImageNode> urls = reader.getImageUrls("999999");
		assertThat(urls).hasSize(0);
	}
	
	@BeforeClass
	public static void before() {
		server = new FeaturedHttpServerBuilder().port(1234).build().start();
	}
	
	@AfterClass
	public static void after() {
		server.stop();
	}
	
	
	private static class MockedSnipperReader extends HtmlDocumentSnippetReader {

		public String getHtmlSnippetUrl(String documentId) {
			return "http://localhost:1234/" + documentId;
		}
		
	}
	
}
