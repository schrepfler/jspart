package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.AbstractAuthorDAOTest;

import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AuthorDAOTest extends AbstractAuthorDAOTest {
	
	@Test
	public AuthorDAOTest() {
		super();
	}

}