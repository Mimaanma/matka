package fi.matkahuolto.testing;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import fi.matkahuolto.lippupalvelu.Lippu;

public class LippuTest {
	
	@Test
    public void testlippuNull() { 
        Lippu lippu = new Lippu(); 
        assertNotNull(lippu.getLähtöPaikka());    
        assertNotNull(lippu.getMenoPaikka());   
        assertNotNull(lippu.getLähtöAika());       
        assertNotNull(lippu.getSaapumisAika()); 
        assertNotNull(lippu.getHinta());
        
    } 

}
