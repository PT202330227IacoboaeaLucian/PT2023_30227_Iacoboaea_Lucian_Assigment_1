package ClasaMain;

import InterfataGraficaUtilizator.ControlerInterfata;
import InterfataGraficaUtilizator.InterfataGrafica;
import ModelDeDate.Monom;
import ModelDeDate.Polinom;
import OperatiiLogice.operatie;

public class Main {

    public static void main(String[] args){
       InterfataGrafica interfata=new InterfataGrafica();
       ControlerInterfata controler=new ControlerInterfata(interfata);
        interfata.setVisible(true);
    }
}
