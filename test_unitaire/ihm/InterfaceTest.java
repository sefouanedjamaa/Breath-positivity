package ihm;

import static org.junit.jupiter.api.Assertions.*;
import ihm.Interface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InterfaceTest {
	private Interface interf;
	
	
	@BeforeEach
    void setUp() throws Exception {
          interf = new Interface("interface_test");
    }
	
	
	@Test
	void test() {

		assertEquals(true, interf.bouttonAppuye());	
		
	
	}
	
	

}
