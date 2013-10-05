package org.hackathon.openassets.services.rest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.rmannibucau.featuredmock.http.FeaturedHttpServer;
import com.github.rmannibucau.featuredmock.http.FeaturedHttpServerBuilder;

public class SnippetServiceTest {
	
	private SnippetService service = new SnippetService();
	
	@Test
	public void get_valid_snippet() {
		String snippet = service.getHtmlSnippet("http://localhost:1234/snippet");
		assertEquals(1, snippet.split("\n").length);
		assertEquals("<div id=\\\"wizytowka\\\"><div class=\\\"avatar\\\"><a target=\\\"_blank\\\" href=\\\"\\\"><img src=\\\"http://resources.sejmometr.pl/mowcy/a/1/761.jpg\\\" alt=\\\"Małgorzata Adamczak\\\" /></a></div><div class=\\\"opis\\\"><h2><a target=\\\"_blank\\\" href=\\\"http://sejmometr.pl/poslowie/2\\\">Małgorzata Adamczak</a></h2><p class=\\\"klub\\\"><img src=\\\"http://resources.sejmometr.pl/s_kluby/1_a_t.png\\\" /></p></div></div>", snippet);
	}

	@BeforeClass
	public static void before() {
		server = new FeaturedHttpServerBuilder().port(1234).build().start();
	}
	
	@AfterClass
	public static void after() {
		server.stop();
	}
	
	private static FeaturedHttpServer server;
}
