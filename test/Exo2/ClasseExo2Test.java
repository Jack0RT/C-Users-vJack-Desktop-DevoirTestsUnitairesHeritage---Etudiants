/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Exo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacqu
 */
public class ClasseExo2Test {
    
    public ClasseExo2Test() {
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
     * Test of CalculerForfait method, of class ClasseExo2.
     */
    @Test
    public void testCalculerForfait()
    {
       // Cas n°1
        
        int age =25;
        boolean licencie=true;
        boolean carteNeige=true;
        boolean assurance=true;
        double expResult = 14.7;
        double result = ClasseExo2.CalculerForfait(licencie, age, carteNeige, assurance);
        assertEquals(expResult, result,0.0);
        // Cas n°2
        age =25;
        licencie=false;
        carteNeige=true;
        assurance=true;
        double expResult2 = 30;
        double result2 = ClasseExo2.CalculerForfait(licencie, age, carteNeige, assurance);
        assertEquals(expResult2, result2,0.0);
        
        // Cas n°3
        
        
        // Cas n°4
        
        
    }
}
