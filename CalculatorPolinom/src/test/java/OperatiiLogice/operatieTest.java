package OperatiiLogice;
import OperatiiLogice.operatie;
import ModelDeDate.Polinom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class operatieTest {

    @BeforeEach
    void setUp() {
        System.out.println("Incepe testul!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("S-a terminat testul!");
    }

    @Test
    void adunare() {
        String p1="+3x^6-4x^7+2x^9";
        String p2="+4x^6-9x^7+2x^2";
        Polinom pol= new Polinom(p1);
        Polinom pol1=new Polinom(p2);
        Polinom rezultat = new Polinom();
        operatie op=new operatie();
         rezultat= op.Adunare(pol,pol1);
         assertEquals("+2X^2+7X^6-13X^7+2X^9",rezultat.toString());
    }

    @Test
    void scadere() {
        String p1="+3x^6-4x^7+2x^9";
        String p2="+4x^6-9x^7+2x^2";
        Polinom pol= new Polinom(p1);
        Polinom pol1=new Polinom(p2);
        Polinom rezultat = new Polinom();
        operatie op=new operatie();
        rezultat= op.Scadere(pol,pol1);
        assertEquals("-2X^2-1X^6+5X^7+2X^9",rezultat.toString());
    }

    @Test
    void inmultire() {
        String p1="+3x^6-4x^7+2x^3";
        String p2="+4x^6-9x^7+2x^2";
        Polinom pol= new Polinom(p1);
        Polinom pol1=new Polinom(p2);
        Polinom rezultat = new Polinom();
        operatie op=new operatie();
        rezultat= op.Inmultire(pol,pol1);
        assertEquals("+4X^5+6X^8+0X^9-18X^10+12X^12-43X^13+36X^14",rezultat.toString());
    }

    @Test
    void derivare() {
        String p1="+3x^6-4x^7+2x^3";
        Polinom pol= new Polinom(p1);
        Polinom rezultat = new Polinom();
        operatie op=new operatie();
        rezultat= op.Derivare(pol);
        assertEquals("+6X^2+18X^5-28X^6", rezultat.toString());

    }
    @Test
    void testPicat()
    {
        String p1="+3x^6-4x^7+2x^3";
        Polinom pol= new Polinom(p1);
        Polinom rezultat = new Polinom();
        operatie op=new operatie();
        rezultat= op.Derivare(pol);
        assertEquals("+18X^2+18X^5-28X^6", rezultat.toString());
    }
    @Test
    void testPicat1()
    {
        String p1="+3x^6-4x^7+2x^3";
        String p2="+4x^6-9x^7+2x^2";
        Polinom pol= new Polinom(p1);
        Polinom pol1=new Polinom(p2);
        Polinom rezultat = new Polinom();
        operatie op=new operatie();
        rezultat= op.Adunare(pol,pol1);
        assertEquals("+18X^2+18X^5-28X^6", rezultat.toString());
    }

    @Test
    void integrare() {
    }
}