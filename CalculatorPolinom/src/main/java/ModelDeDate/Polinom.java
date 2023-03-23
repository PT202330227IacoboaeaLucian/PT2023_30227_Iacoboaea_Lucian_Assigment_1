package ModelDeDate;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom {
    private Map<Integer,Monom> polinom;


    public Polinom()
    {
        this.polinom= new HashMap<Integer,Monom>();
    }
    public Polinom(String s)
    {
        String regex="[+-]?\\d*[xX]\\^\\d+";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        this.polinom= new HashMap<Integer,Monom>();
        while(m.find())
        {
            String mon = m.group();
            String [] parti =mon.split("[xX]\\^");
            int coeficient= Integer.parseInt(parti[0]);
            int putere=Integer.parseInt(parti[1]);
            Monom mono=new Monom(coeficient,putere);
            this.polinom.put(putere,mono);
        }
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
