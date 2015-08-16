package aplicacionesdistribuidas.rmi.prueba2.server;
 
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author
 */
public class Server {
    public static void main(String[] args){
 
        try {
            RemoteObject ro = new RemoteObject();
            String url = "rmi://localhost:30500/remoteobject";
            Registry reg = LocateRegistry.getRegistry(30500);      // get an instance of our registry
            reg.list();   // if there's a problem with registry this will throw an exception
 
            Naming.rebind(url, ro);    // it binds the object with that url
            System.out.println("object bound to url");
 
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}