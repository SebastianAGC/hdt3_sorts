/*
 *Pruebas unitarias para la clase del sort Gnome
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
public class GnomeSortTest {
    
    public GnomeSortTest() {
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
     * Test of gnomeSort method, of class GnomeSort.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Comparable[] inputArr = {5,1,3,4};
        Comparable[] expResult = {1,3,4,5};
        Comparable[] result = GnomeSort.gnomeSort(inputArr);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
