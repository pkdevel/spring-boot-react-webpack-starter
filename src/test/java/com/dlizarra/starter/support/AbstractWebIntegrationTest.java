package com.dlizarra.starter.support;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.dlizarra.starter.StarterProfiles;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(StarterProfiles.TEST)
public abstract class AbstractWebIntegrationTest {
	
}
