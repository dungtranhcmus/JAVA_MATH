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
 * @author didim
 */
public class mathTest {
    
    public mathTest() {
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
    
    @Test
    public void TestSum(){
        math m = new math();
        float s = m.sum(3, 7);
        assertEquals("hàm sum không đúng",(float)10, s,0);
    }
    @Test
    public void TestMinus(){
        math m = new math();
        float s = m.minus(3, 7);
        assertEquals("hàm minus không đúng",(float)-4, s,0);
    }

    @Test
    public void TestSolve_1st_equation1(){
        math m = new math();
        float s = m.solve_1st_equation(7, 8);
        assertEquals("hàm solve_1st_equation không đúng trường hợp có nghiệm",(float)-8/7, s,0);
    }
    @Test
    public void TestSolve_1st_equation2(){
        math m = new math();
        float s = m.solve_1st_equation(0, 7);
        assertEquals("hàm solve_1st_equation không đúng trường hợp vô nghiệm",Float.NaN, s,0);
    }
    
    @Test
    public void TestSolve_1st_equation3(){
        math m = new math();
        float s = m.solve_1st_equation(0, 0);
        assertEquals("hàm solve_1st_equation không đúng trường hợp vô số nghiệm",0, s,0);
    }
    @Test
    public void TestSolve_1st_equation4(){
        math m = new math();
        float s = m.solve_1st_equation(1, 0);
        assertEquals("hàm solve_1st_equation không đúng trường hợp nghiệm bằng 0",0, s,0);
    }
    @Test
    public void TestSolve_2st_equation1(){
        math m = new math();
        float s = m.solve_2rd_equation(0f, 0f, 0f);
        assertEquals("hàm solve_2rd_equation không đúng trường hợp vô số nghiệm",0, s,0);
    }
    @Test
    public void TestSolve_2st_equation2(){
        math m = new math();
        float s = m.solve_2rd_equation(1f, -2f, 1f);
        assertEquals("hàm solve_2rd_equation không đúng trường hợp nghiệm bằng 1",1, s,0);
    }
    @Test
    public void TestSolve_2st_equation3(){
        math m = new math();
        float s = m.solve_2rd_equation(0f, 0f, 2f);
        assertEquals("hàm solve_2rd_equation không đúng trường hợp vô nghiệm",Float.NaN, s,0);
    }
}
