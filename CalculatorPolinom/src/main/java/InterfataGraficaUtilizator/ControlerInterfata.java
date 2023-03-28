package InterfataGraficaUtilizator;

import ModelDeDate.Polinom;
import OperatiiLogice.operatie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlerInterfata {
            private InterfataGrafica interfata;

            public ControlerInterfata(InterfataGrafica interfata)
            {
                this.interfata=interfata;
                this.interfata.Adunare(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String polinom1= interfata.getTextPrimulPolinom().getText();
                        String polinom2= interfata.getTextAlDoileaPolinom().getText();
                        Polinom p1 = new Polinom(polinom1);
                        Polinom p2 = new Polinom(polinom2);
                        Polinom rezultat=new Polinom();
                        operatie op=new operatie();
                        rezultat = op.Adunare(p1, p2);
                        interfata.getTextRezultat().setText(rezultat.toString());
                    }
                });
                this.interfata.Scadere(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String polinom1= interfata.getTextPrimulPolinom().getText();
                        String polinom2= interfata.getTextAlDoileaPolinom().getText();
                        Polinom p1 = new Polinom(polinom1);
                        Polinom p2 = new Polinom(polinom2);
                        Polinom rezultat=new Polinom();
                        operatie op=new operatie();
                        rezultat = op.Scadere(p1, p2);
                        interfata.getTextRezultat().setText(rezultat.toString());
                    }
                });
                this.interfata.Inmultire(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String polinom1= interfata.getTextPrimulPolinom().getText();
                        String polinom2= interfata.getTextAlDoileaPolinom().getText();
                        Polinom p1 = new Polinom(polinom1);
                        Polinom p2 = new Polinom(polinom2);
                        Polinom rezultat=new Polinom();
                        operatie op=new operatie();
                        rezultat = op.Inmultire(p1, p2);
                        interfata.getTextRezultat().setText(rezultat.toString());
                    }
                });
                this.interfata.Derivare(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String polinom1= interfata.getTextPrimulPolinom().getText();
                        String polinom2= interfata.getTextAlDoileaPolinom().getText();
                        Polinom p1 = new Polinom(polinom1);
                        Polinom p2 = new Polinom(polinom2);
                        Polinom rezultat=new Polinom();
                        operatie op=new operatie();
                        rezultat = op.Derivare(p1);
                        interfata.getTextRezultat().setText(rezultat.toString());
                    }
                });
            }
}
