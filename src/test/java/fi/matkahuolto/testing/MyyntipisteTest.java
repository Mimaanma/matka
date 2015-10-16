package fi.matkahuolto.testing;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import fi.matkahuolto.lippupalvelu.Myyntipiste;

public class MyyntipisteTest {
	
	@Test
	public void testNull() {
		Myyntipiste mp = new Myyntipiste(); 
        assertNotNull(mp.getSijainti()); 
	}

}
