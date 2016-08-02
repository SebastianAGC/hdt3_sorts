/*
 *Pruebas unitarias para la clase del sort Radix
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastián
 */
public class RadixsortTest {
    
    public RadixsortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sort method, of class Radixsort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Comparable[] a = {5,1,3,4};
        Radixsort instance = new Radixsort();
        Comparable[] expResult = {1,3,4,5};
        Comparable[] result = instance.sort(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
