package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class JFrameContadores extends JFrame{

    private JButtonContador btn1;
    private JButtonContador btn2;
    private JButtonContador btn3;
    private JButtonContador btn4;


    public JFrameContadores (){
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.btn1 = new JButtonContador();
        this.btn2 = new JButtonContador();
        this.btn3 = new JButtonContador();
        this.btn4 = new JButtonContador();
        // escuchador
        EscuchadorCharly charly = new EscuchadorCharly();
        this.btn1.addActionListener(charly);
        this.btn2.addActionListener(charly);
        this.btn3.addActionListener(charly);
        this.btn4.addActionListener(charly);
        // agregarlos 
        setLayout(new GridLayout(2, 2));
        add(this.btn1);
        add(this.btn2);
        add(this.btn3);
        add(this.btn4);
        
        setVisible(true);
    }
    
}
