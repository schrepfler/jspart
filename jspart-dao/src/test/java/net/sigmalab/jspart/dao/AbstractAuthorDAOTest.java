package net.sigmalab.jspart.dao;

import java.util.GregorianCalendar;
import java.util.TimeZone;

import net.sigmalab.jspart.dao.IUserDAO;
import net.sigmalab.jspart.domain.User;
import net.sigmalab.jspart.domain.Role;

import org.springframework.test.AbstractTransactionalSpringContextTests;

public abstract class AbstractAuthorDAOTest extends AbstractTransactionalSpringContextTests {

    private IUserDAO authorDao;
    private IRoleDAO roleDAO;

	public void testCRUD() {
        Role role = new Role();
        role.setDescription("Superuser role");
        role.setName("ROLE_S");
        assertNotNull(role);
        int authorCount1 = authorDao.getAll().size();
        User author = new User();
        author.setBirthDay(GregorianCalendar.getInstance().getTime());
        author.setCity("Tuzla");
        author.setCountry("YU");
        author.setEnabled(true);
        author.setName("Srgjan");
        author.setPassword("testpassword");
        author.setPostalCode("123456");
        author.setState("BiH");
        author.setStreetName1("street 1");
        author.setStreetName2("street 2");
        author.setSurname("Srepfler");
        author.setUsername("schrepfler2");
        author.getRoles().add(role);
        author.setTimeZone(TimeZone.getDefault());

        author = authorDao.save(author);

        System.out.println(author.getId());
        assertNotNull(author.getId());
        int authorCount2 = authorDao.getAll().size();
        assertEquals(authorCount1 + 1, authorCount2);

        author = authorDao.get(author.getId());
        assertNotNull(author);

        author.setUsername("schrepfler");
        author = authorDao.save(author);

        author = authorDao.get(author.getId());
        assertEquals("schrepfler", author.getUsername());

        authorDao.remove(author.getId());
        assertEquals(authorCount1, authorCount2 - 1);
    }

	public void setAuthorDao(IUserDAO authorDao) {
		this.authorDao = authorDao;
	}
	
    public void setRoleDAO(IRoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

}
