package id;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class App {
<<<<<<< HEAD
    // variables y comtenedores
    private JLabel etiquetaSu;
    private JPanel panelIzquierdo, panelDerecho, panelInferior;
    private JButton botonIz1, botonIz2, botonIz3;
    private JButton botonDe1, botonDe2, botonDe3;
    private JButton btnSum, btnRes, btnMul, btnDiv, btnCalc;
    private JScrollPane scroll;
    private JTextField inputNum1, inputNum2;
    private JLabel lblNum1, lblNum2;
    private JPanel panelMain;

    public void contruyePanelIzquierdo() {
        panelIzquierdo = new JPanel();
        botonIz1 = new JButton("Izq1");
        botonIz2 = new JButton("Izq2");
        botonIz3 = new JButton("Izq3");
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));       
    }

    public void contruyePanelDerecho() {
        panelDerecho = new JPanel();
        btnSum = new JButton("+");
        btnRes = new JButton("-");
        btnMul = new JButton("*");
        btnDiv = new JButton("/");
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
        panelDerecho.add(btnSum);
        panelDerecho.add(btnRes);
        panelDerecho.add(btnMul);
        panelDerecho.add(btnDiv);
    }

    public void contruyePanelInferior() {
       panelInferior = new JPanel();
       btnCalc = new JButton("Calcular");
       panelInferior.add(btnCalc);
       panelInferior.setLayout(new FlowLayout());

    }

    public void contruyeVentana() {
        JFrame frame = new JFrame();            
        frame.setLayout(new BorderLayout());
        frame.setSize(400,300);

        // agregamos los paneles al frame principal
        // frame.add(etiquetaSu, BorderLayout.NORTH);
        frame.add(panelMain, BorderLayout.CENTER);
        frame.add(panelIzquierdo, BorderLayout.WEST);
        frame.add(panelDerecho, BorderLayout.EAST);
        frame.add(panelInferior, BorderLayout.SOUTH);
        // Configuramos el frame
        // frame.pack();
=======
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(600, 300);        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JButton btn1 = new JButton("Hola word"); //crean los elem
        JButton btn2 = new JButton("Valerde btn"); //crean los elem
        JCheckBox checkBox = new JCheckBox("opt1");
        panel.add(btn1); //agregan los elm
        panel.add(btn2);
        panel.add(checkBox);
        panel.add(new JLabel("Este es un nuevo cambio"));
        panel.add(new JButton("Button 2"));
>>>>>>> ae49fea4a7b621db254c69bf07a01138a0dbe8b5
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public App() {
        contruyePanelInferior();
        contruyePanelIzquierdo();
        construirPanelCentral();
        contruyePanelDerecho();
        contruyeVentana();
    }

    private void construirPanelCentral() {
        panelMain = new JPanel();
        JPanel cont1 = new JPanel();
        JPanel cont2 = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        cont1.setLayout(new BoxLayout(cont1, BoxLayout.X_AXIS));
        cont2.setLayout(new BoxLayout(cont2, BoxLayout.X_AXIS));
        lblNum1 = new JLabel("Numero 1: ");
        lblNum2 = new JLabel("Numero 2: ");
        inputNum1 = new JTextField();
        inputNum2 = new JTextField();
        cont1.add(lblNum1);
        cont1.add(inputNum1);
        cont2.add(lblNum2);
        cont2.add(inputNum2);
        panelMain.add(cont1);
        panelMain.add(cont2);
        
    }

    public static void main(String[] inforux) {
        new App();
    }
}
