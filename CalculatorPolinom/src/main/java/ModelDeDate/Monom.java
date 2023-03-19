package ModelDeDate;



public class Monom {
    int coef;
    int putere;

    public Monom(int coef, int putere) {
        this.coef = coef;
        this.putere = putere;
    }

    public int getCoef() {
        return coef;
    }

    public int getPutere() {
        return putere;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public String toString() {
        return this.coef + "X^" + this.putere;
    }
}

