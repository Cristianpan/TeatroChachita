package Test;

import Controlador.*;
import Modelo.Obra;
import Modelo.User;
import Vista.*;


public class ChachitaMain {
    public static void main(String[] args) {
//        Login frmLogin = new Login();
//        User modelUser = new User();
//        CtrlLogin ctrlLogin = new CtrlLogin(modelUser, frmLogin);

          CambiosObra a= new CambiosObra();
          Obra obra= new Obra();
          CtrlCambiosObra c= new CtrlCambiosObra(obra, a);
    }
}
