package ClasaMain;

import InterfataGraficaUtilizator.InterfataGrafica;
import ModelDeDate.Monom;
import ModelDeDate.Polinom;
import OperatiiLogice.operatie;

public class Main {

    public static void main(String[] args){
        //-2x^6+7x^12-3x^3+2x^4
        //-4x^6+6x^12+2x^3-2x^4
        InterfataGrafica interfata=new InterfataGrafica();
        interfata.setVisible(true);
        Monom m1=new Monom(-2,6);
        System.out.println(m1);
       Monom m2=new Monom(7,12);
       System.out.println(m2);
    Monom m3=new Monom(-3,3);
        System.out.println(m3);
        Monom m7=new Monom(2,4);
        System.out.println(m7);
        Monom m4=new Monom(-4,6);
       System.out.println(m4);
       Monom m5=new Monom(6,12);
        System.out.println(m5);
        Monom m6=new Monom(2,3);
       System.out.println(m6);
        Monom m8=new Monom(-2,4);
        System.out.println(m8);
        Polinom p1=new Polinom();
        Polinom p2=new Polinom();
        p1.adauga(m1);
        p1.adauga(m2);
        p1.adauga(m3);
        p2.adauga(m4);
       p2.adauga(m5);
       p2.adauga(m6);
        System.out.println(p1);
        System.out.println(p2);
        operatie op = new operatie();
        System.out.println(op.Adunare(p1,p2));
//        Polinom p = new Polinom("-3x^7-2x^3-5x^0");
//        System.out.println(p);
    }
}
