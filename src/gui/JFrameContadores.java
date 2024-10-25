package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.util.LinkedList;

public class JFrameContadores extends JFrame{

    private JButtonContador btn1;
    private JButtonContador btn2;
    private JButtonContador btn3;
    private JButtonContador btn4;
    private LinkedList <JButtonContador> coleccion;
    private JTextField txtSuma;
    private JTextField txtMayor;


    public JFrameContadores (){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.btn1 = new JButtonContador();
        this.btn2 = new JButtonContador();
        this.btn3 = new JButtonContador();
        this.btn4 = new JButtonContador();
        this.txtMayor = new JTextField();
        this.txtMayor.setEditable(false);
        this.txtSuma = new JTextField();
        this.txtSuma.setEditable(false);
        this.coleccion = new LinkedList<JButtonContador>();
        this.coleccion.add(btn1);
        this.coleccion.add(btn2);
        this.coleccion.add(btn3);
        this.coleccion.add(btn4);
       
        // escuchador
        EscuchadorCharly charly = new EscuchadorCharly(this);
        this.btn1.addActionListener(charly);
        this.btn2.addActionListener(charly);
        this.btn3.addActionListener(charly);
        this.btn4.addActionListener(charly);
        // agregarlos 
        setLayout(new GridLayout(3, 2));
        add(this.btn1);
        add(this.btn2);
        add(this.btn3);
        add(this.btn4);
        add(this.txtMayor);
        add(this.txtSuma);
        
        setVisible(true);
    }


    public JButtonContador getBtn1() {
        return btn1;
    }


    public JButtonContador getBtn2() {
        return btn2;
    }


    public JButtonContador getBtn3() {
        return btn3;
    }


    public JButtonContador getBtn4() {
        return btn4;
    }


    public JTextField getTxtSuma() {
        return txtSuma;
    }


    public JTextField getTxtMayor() {
        return txtMayor;
    }


    public LinkedList<JButtonContador> getColeccion() {
        return coleccion;
    }
    
}
