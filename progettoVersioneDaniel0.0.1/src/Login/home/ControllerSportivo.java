
package Login.home;

import java.util.Date;

public class ControllerSportivo {
    
    SezioneSportivo f9;
    AdminPage f2;
    Controller cProc;
    AggiungiSportivo fAggiungSportivo;
    CercaSportivo fCercaSportivo;
    
    public static void main(String[] args){
        
        ControllerSportivo theControllerSportivo = new ControllerSportivo();
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
        f9.setVisible(false);
    }
    
    public void tornaIndietroDaAggiungSportivo(){
        fAggiungSportivo.setVisible(false);
        f9.setVisible(true);
    }
    
    public void AddSportivo(String[] datiSportivo, Date sqlDate){
        ConnectionDatabaseSportivo sportivoDB = new ConnectionDatabaseSportivo();
        sportivoDB.inserisciNuovoSportivoDB(datiSportivo, sqlDate);
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
}
