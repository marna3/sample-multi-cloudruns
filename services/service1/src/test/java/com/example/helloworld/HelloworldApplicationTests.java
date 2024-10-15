package com.example.helloworld;

import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(HelloworldApplication.class)
class HelloworldApplicationTests {

	@Autowired
    private MockMvc mockMvc;

	@Test
	void shouldReturnHelloWorld() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Hello World!"))	;
    }
}
