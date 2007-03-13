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

public class ArtistDAOTest {

	private IAuthorDAO authorDao;

	@BeforeMethod
	public void setUp() throws Exception {		
		authorDao = DaoFactory.getDAOFactory(JpaDAOFactory.class).getAuthorDAO();
	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testFindById() {
//		Author artist = artistDao.get(new Long(0));
//		assertNotNull(artist);
//	}

//	@Test
//	public void testFindAll() {
//		fail("Not yet implemented"); // TODO
//	}

	@Test
	public void testCRUD() {
		Role role = new Role();
		role.setDescription("Superuser role").setName("ROLE_S");
		assertNotNull(role);
		int artistCount1 = authorDao.getAll().size();
		Author author = new Author().setBirthDay(
				GregorianCalendar.getInstance().getTime()).setCity("Tuzla")
				.setCountry("YU").setEnabled(true).setName("Srgjan")
				.setPassword("testpassword").setPostalCode("123456").setState(
						"BiH").setStreetName1("street 1").setStreetName2(
						"street 2").setSurname("Srepfler").setUsername(
						"schrepfler2");
		author.getRoles().add(role);
		author.setTimeZone(TimeZone.getDefault());

		authorDao.save(author);

		System.out.println(author.getId());
		assertNotNull(author.getId());
		int artistCount2 = authorDao.getAll().size();
		assertEquals(artistCount1 + 1, artistCount2);
                
                author = authorDao.get(author.getId());
                assertNotNull(author);
                
                author.setUsername("schrepfler");
                authorDao.save(author);
                
                author = authorDao.get(author.getId());
                assertEquals("schrepfler", author.getUsername());
                
                authorDao.remove(author.getId());
                assertEquals(artistCount1,artistCount2-1);
	}

//	@Test
//	public void testRemoveArtist() {
//		fail("Not yet implemented"); // TODO
//	}

//	@Test
//	public void testFindByExample() {
//		fail("Not yet implemented"); // TODO
//	}

}
