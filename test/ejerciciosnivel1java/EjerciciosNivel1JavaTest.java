/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1java;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jpb20
 */
public class EjerciciosNivel1JavaTest {
    
    public EjerciciosNivel1JavaTest() {
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
     * Test of maximo method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int[] lista = null;
        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();
        int[] expResult = null;
        int[] result = instance.maximo(lista);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of palIndromo method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testPalIndromo() {
        System.out.println("palIndromo");
        
        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();
       
        assertEquals(true , instance.palIndromo("Acaso hubo buhos aca"));
        assertEquals(true , instance.palIndromo("Aca"));
        assertEquals(false , instance.palIndromo("feo cara culo"));
        assertEquals(false , instance.palIndromo("ligar es agil"));
        assertEquals(true , instance.palIndromo("Allí esta sevilla"));
        
        
    }

    /**
     * Test of quitaEspaciosEnBlanco method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testQuitaEspaciosEnBlanco() {
        System.out.println("quitaEspaciosEnBlanco");
        String cadena = "";
        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();
        String expResult = "";
        String result = instance.quitaEspaciosEnBlanco(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isodromo method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testIsodromo() {
        System.out.println("isodromo");

        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();

        assertEquals(true, instance.isodromo("mucielago"));
        assertEquals(false, instance.isodromo("Cocreta"));
        assertEquals(false, instance.isodromo("mecagoén"));
        assertEquals(false, instance.isodromo("malácotin"));
        assertEquals(false, instance.isodromo("laángost"));
        assertEquals(true, instance.isodromo("muciélago"));
        
        

    }

    /**
     * Test of main method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosNivel1Java.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiaAcentos method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testCambiaAcentos() {
        System.out.println("cambiaAcentos");
        String _palabra = "";
        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();
        String expResult = "";
        String result = instance.cambiaAcentos(_palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divideFrase method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testDivideFrase() {
        System.out.println("divideFrase");
        String frase = "";
        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();
        String[] expResult = null;
        String[] result = instance.divideFrase(frase);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acronimo method, of class EjerciciosNivel1Java.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");

        EjerciciosNivel1Java instance = new EjerciciosNivel1Java();
       
        assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        assertEquals("CdETyS", instance.acronimo("Centro de Estudios Tecnológicos y Sociales"));
        //assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        //assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
        //assertEquals("AVE", instance.acronimo("Alta Velocidad Española"));
    }


    
}
