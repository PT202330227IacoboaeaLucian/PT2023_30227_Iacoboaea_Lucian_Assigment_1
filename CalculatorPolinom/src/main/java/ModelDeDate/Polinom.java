package ModelDeDate;

import java.util.HashMap;
import java.util.Map;

public class Polinom {
    private Map<Integer,Monom> polinom;


    public Polinom()
    {
        this.polinom= new HashMap<Integer,Monom>();
    }
    public void setPolinom(Map<Integer, Monom> polinom) {
        this.polinom = polinom;
    }

    public Map<Integer, Monom> getPolinom() {
        return polinom;
    }

    public void adauga(Monom p)
    {
            polinom.put(p.getPutere(),p);
    }

    public String toString()
    {
        String rezultat="";
        for(Monom m: polinom.values()) {
            if(m.getCoef() >0) {
                rezultat += "+";
            }
            rezultat += m.toString();
            if(m.getCoef()==0) {
                rezultat="";
            }
            if(m.getPutere()==0) {
                rezultat=""+ m.getCoef();
            }
        }
        return rezultat;
    }




}
