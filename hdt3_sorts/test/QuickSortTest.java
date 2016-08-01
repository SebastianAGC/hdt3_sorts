/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class QuickSortTest {
    
    public QuickSortTest() {
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
     * Test of sort method, of class QuickSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        Comparable[] list = null;
        int low = 0;
        int high = 0;
        QuickSort.sort(list, low, high);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of partition method, of class QuickSort.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        Comparable[] list = null;
        int low = 0;
        int high = 0;
        int expResult = 0;
        int result = QuickSort.partition(list, low, high);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
