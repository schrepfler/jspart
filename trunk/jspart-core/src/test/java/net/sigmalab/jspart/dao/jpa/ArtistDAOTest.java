package net.sigmalab.jspart.dao.jpa;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import net.sigmalab.jspart.dao.DaoFactory;
import net.sigmalab.jspart.dao.IArtistDAO;
import net.sigmalab.jspart.model.Author;
import net.sigmalab.jspart.model.Role;

public class ArtistDAOTest {

	private IArtistDAO artistDao;

	@BeforeMethod
	public void setUp() throws Exception {		
		artistDao = DaoFactory.getDAOFactory(JpaDAOFactory.class).getArtistDAO();
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
	public void testMakePersistent() {
		// Role role = roleDao.findById(new Long(530));
		Role role = new Role();
		role.setDescription("Superuser role").setName("ROLE_S");
		assertNotNull(role);
		int artistCount1 = artistDao.getAll().size();
		Author author = new Author().setBirthDay(
				GregorianCalendar.getInstance().getTime()).setCity("Tuzla")
				.setCountry("YU").setEnabled(true).setName("Srgjan")
				.setPassword("testpassword").setPostalCode("123456").setState(
						"BiH").setStreetName1("street 1").setStreetName2(
						"street 2").setSurname("Srepfler").setUsername(
						"schrepfler2");
		author.getRoles().add(role);
		author.setTimeZone(TimeZone.getDefault());

		artistDao.save(author);

		System.out.println(author.getId());
		assertNotNull(author.getId());
		int artistCount2 = artistDao.getAll().size();
		assertEquals(artistCount1 + 1, artistCount2);

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
