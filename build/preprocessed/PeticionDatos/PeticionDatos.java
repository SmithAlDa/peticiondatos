package PeticionDatos;

import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public class PeticionDatos extends MIDlet {
    public Display pantalla;
    public Form    fmrDatos;
    public TextField    txtNombre ,  txtApe , txtTel;
    
    public void startApp() {
        
        pantalla = Display.getDisplay(this);
        fmrDatos = new Form ("Peticion de datos");
        txtNombre = new TextField("Nombre", "", 20, TextField.ANY);
        txtApe = new TextField("Apellidos", "", 20, TextField.ANY);
        txtTel = new TextField("Telefono", "", 12, TextField.PHONENUMBER);
        
        fmrDatos.append(txtTel);
        fmrDatos.append(txtApe);
        fmrDatos.append(txtNombre);
        
        pantalla.setCurrent(fmrDatos);
          
    }
    public void pauseApp() {
    }
    public void destroyApp(boolean unconditional) {
    }
}
