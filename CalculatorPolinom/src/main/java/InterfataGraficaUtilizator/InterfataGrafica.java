package InterfataGraficaUtilizator;
import java.awt.EventQueue;
import OperatiiLogice.operatie;
import ModelDeDate.Polinom;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
public class InterfataGrafica extends JFrame {
    private JPanel panou;
    private JLabel calcPolinomLabel;
    private JLabel primulPolinom;
    private JLabel alDoileaPolinom;
    private JLabel rezultat;
    private JTextField textPrimulPolinom;
    private JTextField textAlDoileaPolinom;
    private JTextField textRezultat;

    private JButton butonAdunare;
    private JButton butonScadere;
    private JButton butonInumltire;
    private JButton butonImpartire;
    private JButton butonIntegrare;
    private JButton butonDerivare;

    public JTextField getTextPrimulPolinom() {
        return textPrimulPolinom;
    }

    public JTextField getTextAlDoileaPolinom() {
        return textAlDoileaPolinom;
    }

    public JTextField getTextRezultat() {
        return textRezultat;
    }

    public InterfataGrafica() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 408, 552);
        panou = new JPanel();
        panou.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(panou);
        panou.setLayout(null);

        calcPolinomLabel = new JLabel("Calculator de Polinoame");
        calcPolinomLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calcPolinomLabel.setBounds(94, 10, 228, 25);
        panou.add(calcPolinomLabel);

        primulPolinom = new JLabel("Primul Polinom =");
        primulPolinom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        primulPolinom.setBounds(10, 78, 144, 26);
        panou.add(primulPolinom);

        alDoileaPolinom = new JLabel("Al doilea polinom =");
        alDoileaPolinom.setFont(new Font("Tahoma", Font.PLAIN, 15));
        alDoileaPolinom.setBounds(10, 146, 144, 26);
        panou.add(alDoileaPolinom);

        rezultat = new JLabel("Rezultat =");
        rezultat.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rezultat.setBounds(10, 223, 144, 25);
        panou.add(rezultat);

        textPrimulPolinom= new JTextField();
        textPrimulPolinom.setBounds(164, 76, 201, 35);
        panou.add(textPrimulPolinom);
        textPrimulPolinom.setColumns(10);

        textAlDoileaPolinom = new JTextField();
        textAlDoileaPolinom.setColumns(10);
        textAlDoileaPolinom.setBounds(164, 144, 201, 35);
        panou.add(textAlDoileaPolinom);

        textRezultat = new JTextField();
        textRezultat.setBounds(164, 220, 201, 35);
        panou.add(textRezultat);
        textRezultat.setColumns(10);


        butonAdunare= new JButton("Adunare");
        butonAdunare.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butonAdunare.setBounds(22, 270, 144, 50);
        panou.add(butonAdunare);

        butonScadere = new JButton("Scadere");
        butonScadere.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butonScadere.setBounds(221, 270, 144, 50);
        panou.add(butonScadere);

        butonInumltire = new JButton("Inmultire");
        butonInumltire.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butonInumltire.setBounds(22, 350, 144, 50);
        panou.add(butonInumltire);

        butonImpartire = new JButton("Impartire");
        butonImpartire.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butonImpartire.setBounds(221, 350, 144, 50);
        panou.add(butonImpartire);

        butonIntegrare = new JButton("Integrare");
        butonIntegrare.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butonIntegrare.setBounds(22, 428, 144, 50);
        panou.add(butonIntegrare);

        butonDerivare = new JButton("Derivare");
        butonDerivare.setFont(new Font("Tahoma", Font.PLAIN, 15));
        butonDerivare.setBounds(221, 428, 144, 50);
        panou.add(butonDerivare);
    }
    public void Adunare (ActionListener actionListener) {this.butonAdunare.addActionListener(actionListener);}
    public void Scadere (ActionListener actionListener)
    {
        this.butonScadere.addActionListener(actionListener);
    }
    public void Inmultire (ActionListener actionListener) {this.butonInumltire.addActionListener(actionListener);}
    public void Derivare (ActionListener actionListener) {this.butonDerivare.addActionListener(actionListener);}
    public void Integrare (ActionListener actionListener) {this.butonIntegrare.addActionListener(actionListener);}

}
