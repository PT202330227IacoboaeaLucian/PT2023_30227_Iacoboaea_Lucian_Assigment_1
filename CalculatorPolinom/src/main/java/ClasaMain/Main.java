package ClasaMain;

import InterfataGraficaUtilizator.InterfataGrafica;
import ModelDeDate.Monom;
import ModelDeDate.Polinom;
import OperatiiLogice.operatie;

public class Main {

    public static void main(String[] args){
        InterfataGrafica interfata=new InterfataGrafica();
        interfata.setVisible(true);
        Monom m1=new Monom(7,2);
        System.out.println(m1);
       Monom m2=new Monom(3,3);
       System.out.println(m2);
    Monom m3=new Monom(-6,4);
        System.out.println(m3);
        Monom m4=new Monom(3,4);
       System.out.println(m4);
       Monom m5=new Monom(9,6);
        System.out.println(m5);
        Monom m6=new Monom(12,2);
       System.out.println(m6);
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
        System.out.println(op.Scadere(p1,p2));
    }
}
