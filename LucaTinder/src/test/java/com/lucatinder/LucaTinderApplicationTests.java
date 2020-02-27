package com.lucatinder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
class LucaTinderApplicationTests {

	@Test
    public void contextLoads() throws Exception {
    	//Deberia fallar aposta
    	assertThat(false).isTrue();
    }

}
