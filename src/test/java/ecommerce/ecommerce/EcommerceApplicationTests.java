package ecommerce.ecommerce;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ecommerce.ecommerce.repository.ProductoRepository;

import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
@SpringBootTest
class EcommerceApplicationTests {

	@Autowired
    private ProductoRepository productoRepository;

	@Test
	public void contextLoads() {
	}

}
