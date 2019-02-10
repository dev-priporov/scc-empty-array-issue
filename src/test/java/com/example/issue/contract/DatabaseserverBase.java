package com.example.issue.contract;

import com.example.issue.controller.GetController;
import com.example.issue.service.GetService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
public class DatabaseserverBase {

	@InjectMocks
	private GetController controller;

	@Mock
	private GetService service;

	private String json = "[\n" +
			"  {\n" +
			"    \"array\": [\n" +
			"      \"a\",\n" +
			"      \"b\"\n" +
			"    ]\n" +
			"  },\n" +
			"  {\n" +
			"    \"array\": [\n" +
			"      \"a\",\n" +
			"      \"b\"\n" +
			"    ]\n" +
			"  },\n" +
			"  {\n" +
			"    \"array\": []\n" +
			"  }\n" +
			"]";

	@Before
	public void setup() {
		Mockito.when(service.method()).thenReturn(
				json
		);

		RestAssuredMockMvc.standaloneSetup(MockMvcBuilders.standaloneSetup(controller));
	}

	@Test
	public void emptyTestForGradleTest() {}

}
