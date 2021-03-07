
package Login.home;

import java.util.Date;

public class ControllerSportivo {
    
    SezioneSportivo f9;
    AdminPage f2;
    Controller cProc;
    AggiungiSportivo fAggiungSportivo;
    CercaSportivo fCercaSportivo;
    AccessoProcuratore fp1;
    GestioneSportivoDaProcuratore fp2;
    loginForm loginFinestra;
    loginForm f1;
             
    public static void main(String[] args){
        ControllerSportivo theControllerSportivo = new ControllerSportivo();
        Controller controllerProcuratore = new Controller();
        String[] datiProcuratore = new String[2];
    }
    
    public void apriSezioneSportivo(){
         f9 = new SezioneSportivo(this);
         f9.setVisible(true);
         f2 = new AdminPage(cProc, this);
         f2.setVisible(false);
     }
    
    public void apriAggiungSportivo(){
        fAggiungSportivo = new AggiungiSportivo(this);
        fAggiungSportivo.setVisible(true);
        fp2.setVisible(false);
    }
    
    public void tornaIndietroDaAggiungSportivo(){
        fAggiungSportivo.setVisible(false);
        f9.setVisible(true);
    }
    
    public void AddSportivo(String[] datiSportivo, Date sqlDate, String code_id){
        ConnectionDatabaseSportivo sportivoDB = new ConnectionDatabaseSportivo();
        sportivoDB.inserisciNuovoSportivoDB(datiSportivo, sqlDate, code_id);
    }
    
    public void apriCercaSportivo(){
        fCercaSportivo = new CercaSportivo(this);
        fCercaSportivo.setVisible(true);
    }
    
    public void SerchSportivo(){
        ConnectionDatabaseSportivo sportivoDB = new ConnectionDatabaseSportivo();
        sportivoDB.cercaSportivoDB();
    }
    
    public void tornaIndietroDafCercaSportivo(){
        fCercaSportivo.setVisible(false);
        f9.setVisible(true);
    }
    
    public void tornaIndietroDaSezioneSportivo(){
        f9.setVisible(false);
    }
    
    public void apriAccessoComeProcuratore(){
        fp1 = new AccessoProcuratore(this);
        fp1.setVisible(true);
    }
    
   public void apriGestioneSportivoDaProcuratore(){
       fp2 = new GestioneSportivoDaProcuratore(this);
       fp2.setVisible(true);
       fp1.setVisible(false);
   }
   
   public void tornaIndietroDaGestioneSportivoDaProcuratore(){
       fp2.setVisible(false);
       fp1.setVisible(true);
   } 
   
   public void tornaIndietroDaAggiungiProcuratore(){
       fAggiungSportivo.setVisible(false);
       fp2.setVisible(true);
   }
   
    public void tornaIndietroDaAccessoComeProcuratore(){
        fp1.setVisible(false);
        f1 = new loginForm(this);
        f1.setVisible(true);
     }
}
