package interfaces;

import java.awt.event.KeyEvent;

public class Validar {

    Character s;
    
    public void soloLetras(KeyEvent evt){
        s = evt.getKeyChar();
        if(!Character.isLetter(s) && s != KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
}
