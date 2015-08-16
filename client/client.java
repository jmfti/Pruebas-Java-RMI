package aplicacionesdistribuidas.rmi.prueba2.client;
 
import aplicacionesdistribuidas.rmi.prueba2.shared.RemoteIF;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author
 */
public class Client {
    public static void main(String[] args){
        try {
 
            String url = "rmi://localhost:30500/remoteobject";
            RemoteIF rif = (RemoteIF) Naming.lookup(url);
            System.out.println(rif.getAge());   // it prints the default value, 31
            System.out.println(rif.getHeight());
            System.out.println(rif.getName());
 
            rif.setAge(2);           // we set age on remote object to 2
            rif.setHeight(1.98f);
            rif.setName("test2");
 
            System.out.println(rif.getAge());   // it prints 2
            System.out.println(rif.getHeight());
            System.out.println(rif.getName());
 
        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}