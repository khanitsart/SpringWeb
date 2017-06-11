package com.khanitsart.dev;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.khanitsart.dev.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringWebAwsApplicationTests {

	
@Autowired
private I18NService i18NService;
	
	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Welcome to the Web";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
	}

}
