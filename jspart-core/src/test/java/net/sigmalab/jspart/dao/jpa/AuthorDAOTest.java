package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.AbstractAuthorDAOTest;

public final class AuthorDAOTest extends AbstractAuthorDAOTest {
	
	@Override
	protected String[] getConfigLocations() {
		return new String[]{"classpath:applicationContext.xml"};
	}

}
