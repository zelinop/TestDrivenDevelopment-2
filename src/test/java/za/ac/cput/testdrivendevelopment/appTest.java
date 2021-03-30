
package za.ac.cput.testdrivendevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
        
/**
 *
 * @author 
 */
public class appTest {
    
    public appTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    //Test for Equality
    @Test
    public void testAbc1 () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 5));
    
    }
    //Test Identity
    @Test
    public void testAbc2 (){
   
        AddTwoNumbers atn = new AddTwoNumbers (){};
        
        assertSame(10, atn.abc(5, 5));
    }
        
    //Failing test
    @Test
    public void testAbc3 () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 4));
    
    }
    //Timeout test for 5 seconds
    @Timeout (5)
    @Test
    public void testAbc4 () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 5));
    
    }
 
    //Disabling the test
    @Disabled
    @Test
    public void testAbc5 () {
    AddTwoNumbers atn = new AddTwoNumbers (){};
    
    assertEquals(10, atn.abc(5, 5));
    
    }
}
