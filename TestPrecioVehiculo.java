import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author marcosgt11
 *
 */
class TestPrecioVehiculo {

	@Test
	void test() {
		Coche ferrari = new Coche(4,"sacatucarrera");
		assertEquals(ferrari.precioVehiculo(),120);
		assertTrue(ferrari.precioVehiculo()==120);
		assertFalse(ferrari.precioVehiculo()==10);
	}

}
