package net.sigmalab.jspart.dao.jpa;

import net.sigmalab.jspart.dao.IAuthorDAO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import net.sigmalab.jspart.dao.DaoFactory;
import net.sigmalab.jspart.model.Author;
import net.sigmalab.jspart.model.Role;

public class AuthorDAOTest {

	private IAuthorDAO authorDao;

	@BeforeMethod
	public void setUp() throws Exception {		
		authorDao = DaoFactory.getDAOFactory(JpaDAOFactory.class).getAuthorDAO();
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testFindAll() {
//		fail("Not yet implemented"); // TODO
//	}

	@Test
	public void testCRUD() {
		Role role = new Role();
		role.description("Superuser role").name("ROLE_S");
		assertNotNull(role);
		int authorCount1 = authorDao.getAll().size();
		Author author = new Author().birthDay(
				GregorianCalendar.getInstance().getTime()).city("Tuzla")
				.country("YU").enabled(true).name("Srgjan")
				.password("testpassword").postalCode("123456").state(
						"BiH").streetName1("street 1").streetName2(
						"street 2").surname("Srepfler").username(
						"schrepfler2");
		author.getRoles().add(role);
		author.setTimeZone(TimeZone.getDefault());

		author = authorDao.save(author);

		System.out.println(author.getId());
		assertNotNull(author.getId());
		int authorCount2 = authorDao.getAll().size();
		assertEquals(authorCount1 + 1, authorCount2 );
                
                author = authorDao.get(author.getId());
                assertNotNull(author);
                
                author.setUsername("schrepfler");
                author = authorDao.save(author);
                
                author = authorDao.get(author.getId());
                assertEquals("schrepfler", author.getUsername());
                
                authorDao.remove(author.getId());
                assertEquals(authorCount1,authorCount2-1);
	}

//	@Test
//	public void testFindByExample() {
//		fail("Not yet implemented"); // TODO
//	}

}
