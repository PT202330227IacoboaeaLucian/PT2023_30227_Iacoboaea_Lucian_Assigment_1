package OperatiiLogice;

import ModelDeDate.Monom;
import ModelDeDate.Polinom;

import java.util.Map;

import static java.sql.Types.NULL;

public class operatie {
    public Polinom Adunare(Polinom a1, Polinom a2) {
        Polinom rezultat = new Polinom();
        for (int putere1 : a1.getPolinom().keySet()) {
            Monom monom = a1.getPolinom().get(putere1);
            for (int putere2 : a2.getPolinom().keySet()) {
                if (putere1 == putere2) {
                    monom.setCoef(monom.getCoef() + a2.getPolinom().get(putere2).getCoef());
                }
            }
            rezultat.adauga(monom);
        }
    for(Monom monom2: a2.getPolinom().values()) {
        boolean f=false;
        for(Monom monom1: a1.getPolinom().values()) {
            if(monom2.getPutere()==monom1.getPutere()) {
               f=true;
            }
        }
        if(!f) {
            rezultat.adauga((monom2));
        }
    }
        return rezultat;
    }
    public Polinom Scadere(Polinom a1, Polinom a2) {
        Polinom rezultat = new Polinom();
        for (int putere1 : a1.getPolinom().keySet()) {
            Monom monom = a1.getPolinom().get(putere1);
            for (int putere2: a2.getPolinom().keySet()) {
                Monom monom1=a2.getPolinom().get(putere2);
                if (putere1  == putere2) {
                    monom.setCoef(monom.getCoef() - a2.getPolinom().get(putere2).getCoef());
                }
            }
            rezultat.adauga(monom);
        }
        for(Monom monom2: a2.getPolinom().values()) {
            boolean f=false;
            for(Monom monom1: a1.getPolinom().values()) {
                if(monom2.getPutere()==monom1.getPutere()) {
                    f=true;
                }
            }
            if(!f) {
                monom2.setCoef(-1 * monom2.getCoef());
                rezultat.adauga(monom2);
            }
        }
        return rezultat;
    }
    public Polinom Inmultire(Polinom a1, Polinom a2)
    {
        Polinom rezultat = new Polinom();
        for(int putere1: a1.getPolinom().keySet()) {
          Monom rez=null;
            for (int putere2 : a2.getPolinom().keySet()) {
                rez = new Monom(a1.getPolinom().get(putere1).getCoef()*a2.getPolinom().get(putere2).getCoef(), putere1 + putere2);
                if(rezultat.getPolinom().get(rez.getPutere())!=null) {
                    rez.setCoef(rezultat.getPolinom().get(rez.getPutere()).getCoef()+rez.getCoef());
                }
                rezultat.adauga(rez);

            }
            rezultat.adauga(rez);
        }
        return rezultat;
    }
    public Polinom Derivare(Polinom a1)
    {
        Polinom rezultat = new Polinom();
        for(int putere1: a1.getPolinom().keySet()) {
            Monom m1= a1.getPolinom().get(putere1);
            m1.setCoef(m1.getCoef() *putere1);
            m1.setPutere(m1.getPutere() -1);
            rezultat.adauga(m1);
        }
        return rezultat;
    }
    public Polinom Integrare(Polinom a1)
    {
        Polinom rezultat=new Polinom();
        for(int putere1: a1.getPolinom().keySet()) {
            Monom m1=a1.getPolinom().get(putere1);
            m1.setCoef((int) (m1.getCoef() *(double)(1/(putere1+1))));
            m1.setPutere(m1.getPutere() +1);
            rezultat.adauga(m1);
        }
        return rezultat;
    }
}



