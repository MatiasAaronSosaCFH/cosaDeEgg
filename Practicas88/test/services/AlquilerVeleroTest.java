/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package services;

import entidades.Velero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 54117
 */
public class AlquilerVeleroTest {
    
    public AlquilerVeleroTest() {
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

    /**
     * Test of crearVelero method, of class AlquilerVelero.
     */
    @Test
    public void testCrearVelero() {
        System.out.println("crearVelero");
        AlquilerVelero instance = new AlquilerVelero();
        Velero expResult = null;
        Velero result = instance.crearVelero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularAlquiler method, of class AlquilerVelero.
     */
    @Test
    public void testCalcularAlquiler() {
        System.out.println("calcularAlquiler");
        Velero v = null;
        AlquilerVelero instance = new AlquilerVelero();
        double expResult = 0.0;
        double result = instance.calcularAlquiler(v);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
