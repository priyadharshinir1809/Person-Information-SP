package com.impiger.sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

//@SpringBootTest
@SpringBootTest(classes=com.impiger.sample.SampleApplication.class)
//@RunWith(SpringRunner.class)
//@DataJpaTest
class SampleApplicationTests {

	@Test
	void contextLoads() {
	}

}
