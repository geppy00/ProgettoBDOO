
package Login.home;
import java.sql.*;


public class Controller {
    
    loginForm f1;
    
    public static void main(String[] args) {
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        
        Controller theController = new Controller();
        loginForm f1 = new loginForm(theController); 
        f1.setVisible(true);
        
    }
    
public boolean accedi (String nomeUtente, String passwordUtente){
        int flag = 0;
        System.out.println("nomeUtente: "+nomeUtente+" passwordUtente: "+passwordUtente);
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        flag = db1.selectOperation(nomeUtente);
        if(flag == 1)
            return true;
        else
            return false;
        
}
}

