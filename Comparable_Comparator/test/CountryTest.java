/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author trwalker
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("CountryJUnit4Test");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("Test of getName");
        Country instance = new Country("Russia", 17098242.0);
        String expResult = "Russia";
        String result = instance.getName();
        System.out.println("expResult :" + " " + expResult);
        System.out.println("result :" + " " +result);
        System.out.println();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    public void testGetArea() {
        System.out.println("Test of getArea");
        Country instance = new Country("Russia", 17098242.0);
        double expResult = 17098242.0;
        double result = instance.getArea();
        System.out.println("expResult :" + " " + expResult);
        System.out.println("result :" + " " +result);
        System.out.println();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compareTo method, of class Country.
     */
    @Test
    public void testCompareTo() {
        System.out.println("Test of compareTo");
        Country instance = new Country("Russia", 17098242.0);
        Country other = new Country("United States", 9629091.0);
        int expResult = 1;
        int result = instance.compareTo(other);
        System.out.println("expResult :" + " " + expResult);
        System.out.println("result :" + " " +result);
        System.out.println();
        assertEquals(expResult, result);
        
        Country instance2 = new Country("United States", 9629091.0);
        Country other2 = new Country("Russia", 17098242.0);
        int expResult2 = -1;
        int result2 = instance2.compareTo(other2);
        System.out.println("expResult2 :" + " " + expResult2);
        System.out.println("result2 :" + " " +result2);
        System.out.println();
        assertEquals(expResult2, result2);
        
        Country instance3 = new Country("Isl", 1.0);
        Country other3 = new Country("And", 1.0);
        int expResult3 = 0;
        int result3 = instance3.compareTo(other3);
        System.out.println("expResult3 :" + " " + expResult3);
        System.out.println("result3 :" + " " +result3);
        System.out.println();
        assertEquals(expResult3, result3);
    }

    /**
     * Test of createComparatorByName method, of class Country.
     */
    @Test
    public void testCreateComparatorByName() {
     System.out.println("Test of createComparatorByName");
     ArrayList<Country> countries = new ArrayList<Country>();
     Country u = new Country("Uruguay", 176220.0);
     Country t = new Country("Thailand", 514000.0);
     Country b = new Country("Belgium", 30510.0);
     countries.add(u);
     countries.add(t);
     countries.add(b);
     System.out.print("Countries list before sorting :" + " " + countries);
     System.out.println();
     Collections.sort(countries, Country.createComparatorByName(true)); // The array list is sorted alphabetically from A to Z;
     ArrayList<Country> expResult = new ArrayList<Country>();
     expResult.add(b);
     expResult.add(t);
     expResult.add(u);
     ArrayList<Country> result = countries;
     System.out.println("expResult :" + " " + expResult);
     System.out.println("result :" + " " + result);
     System.out.println();
     assertEquals(expResult, result);
     
     ArrayList<Country> countries2 = new ArrayList<Country>();
     countries2.add(u);
     countries2.add(t);
     countries2.add(b);
     System.out.print("Countries2 list before sorting :" + " " + countries2);
     System.out.println();
     Collections.sort(countries2, Country.createComparatorByName(false)); // The array list is sorted alphabetically from Z to A;
     ArrayList<Country> expResult2 = new ArrayList<Country>();
     expResult2.add(u);
     expResult2.add(t);
     expResult2.add(b);
     ArrayList<Country> result2 = countries2;
     System.out.println("expResult2 :" + " " + expResult2);
     System.out.println("result2 :" + " " + result2);
     System.out.println();
     assertEquals(expResult2, result2);
    }
    
    /**
     * Test of createComparatorByArea method, of class Country.
     */
    @Test
    public void testCreateComparatorByArea() {
     System.out.println("Test of createComparatorByArea");
     ArrayList<Country> countries = new ArrayList<Country>();
     Country u = new Country("Uruguay", 176220.0);
     Country t = new Country("Thailand", 514000.0);
     Country b = new Country("Belgium", 30510.0);
     countries.add(u);
     countries.add(t);
     countries.add(b);
     System.out.print("Countries list before sorting :" + " " + countries);
     System.out.println();
     Collections.sort(countries, Country.createComparatorByArea(true));
                             // The array list is sorted in ascending order based on area values;
     ArrayList<Country> expResult = new ArrayList<Country>();
     expResult.add(b);
     expResult.add(u);
     expResult.add(t);
     ArrayList<Country> result = countries;
     System.out.println("expResult :" + " " + expResult);
     System.out.println("result :" + " " + result);
     System.out.println();
     assertEquals(expResult, result);
     
     ArrayList<Country> countries2 = new ArrayList<Country>();
     countries2.add(t);
     countries2.add(u);
     countries2.add(b);
     System.out.print("Countries2 list before sorting :" + " " + countries2);
     System.out.println();
     Collections.sort(countries2, Country.createComparatorByArea(false)); 
                             // The array list is sorted in descending order based on area values;
     ArrayList<Country> expResult2 = new ArrayList<Country>();
     expResult2.add(t);
     expResult2.add(u);
     expResult2.add(b);
     ArrayList<Country> result2 = countries2;
     System.out.println("expResult2 :" + " " + expResult2);
     System.out.println("result2 :" + " " + result2);
     System.out.println();
     assertEquals(expResult2, result2);
    }
}