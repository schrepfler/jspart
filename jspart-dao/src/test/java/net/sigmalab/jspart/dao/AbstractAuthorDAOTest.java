package net.sigmalab.jspart.dao;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import java.util.Date;
import java.util.TimeZone;

import net.sigmalab.jspart.domain.GeoLocationCivicAddress;
import net.sigmalab.jspart.domain.Role;
import net.sigmalab.jspart.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

public abstract class AbstractAuthorDAOTest extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
    private IUserDAO userDao;

    @Test
	public void testCRUD() {
        Role role = new Role.Builder()
        .description("Superuser")
        .name("ROLE_S").build();
        
        
        int userCountStart = userDao.getAll().size();
        User user = new User.Builder()
        .birthDay(new Date())
        .address(new GeoLocationCivicAddress.Builder()
        	.addressLine1("via Murri 75")
        	.addressLine2("")
        	.building("")
        	.city("Bologna")
        	.countryRegion("Italy")
        	.floorLevel("2")
        	.postalCode("40137")
        	.stateProvince("BO")
        	.latitude(20D)
        	.longitude(20D)
        	.altitude(200F)
        	.horizontalAccuracy(1F)
        	.verticalAccuracy(1F).build()
        	)
        .surname("Srepfler")
        .name("Srgjan")
        .username("username")
        .password("password")
        .timeZone(TimeZone.getDefault()).build();
        
        user.getRoles().add(role);

        user = userDao.save(user);

        System.out.println(user.getId());
        assertNotNull(user.getId());
        int userCountEnd = userDao.getAll().size();
        assertEquals(userCountStart + 1, userCountEnd);

        user = userDao.get(user.getId());
        assertNotNull(user);

        user.setUsername("schrepfler");
        user = userDao.save(user);

        user = userDao.get(user.getId());
        assertEquals("schrepfler", user.getUsername());

        userDao.remove(user.getId());
        assertEquals(userCountStart, userCountEnd - 1);
    }

}
