package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscuchadorCharly implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      JButtonContador aux = (JButtonContador)e.getSource();
      aux.actualizar();
    }
    
}
