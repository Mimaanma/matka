package fi.matkahuolto.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import fi.matkahuolto.tietopalvelu.Matkustaja;

public class MatkustajaTest {
	
    @Test 
    public void test() { 
        Matkustaja matkustaja = new Matkustaja(); 
        assertNotNull(matkustaja.getTila()); 
    } 

}
