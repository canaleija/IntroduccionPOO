package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscuchadorCharly implements ActionListener{
  
  private JFrameContadores frame;

  

  public EscuchadorCharly(JFrameContadores frame){
    this.frame = frame;

    

  }
    @Override
    public void actionPerformed(ActionEvent e) {
      JButtonContador aux = (JButtonContador)e.getSource();
      aux.actualizar();
      // sumar lo que tengan todos los botones
      int suma = this.frame.getBtn1().getContador()+
      this.frame.getBtn2().getContador()+
      this.frame.getBtn3().getContador()+
      this.frame.getBtn4().getContador();
      this.frame.getTxtSuma().setText(""+suma);

    int mayor = this.frame.getColeccion().get(0).getContador();

    for(JButtonContador aux2: this.frame.getColeccion()){
        if(aux2.getContador()>mayor){
          mayor = aux2.getContador();
        }
    }
    this.frame.getTxtMayor().setText(""+mayor);
    }
    
  }
