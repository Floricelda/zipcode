package com.java.test.zipode.unitest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import com.java.test.zipcode.daos.SepomexDao;
import com.java.test.zipcode.models.ResponseModel;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:resources/dbtest.properties")
public class ZipCodeTest {
	@Autowired
	private SepomexDao sepomexDao;

	@Test
	public void test() {
		String cp= "06140";
		ResponseModel zipCodesR=sepomexDao.getDataByCp(cp);
		System.out.println("zipCodesR result in unitTest: "+zipCodesR);
	}
}
