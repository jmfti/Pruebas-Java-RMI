package aplicacionesdistribuidas.rmi.prueba2.shared;
 
import java.rmi.Remote;
import java.rmi.RemoteException;
 
public interface RemoteIF extends Remote {
 
    int getAge() throws RemoteException;
 
    float getHeight() throws RemoteException;
 
    String getName() throws RemoteException;
 
    void setAge(int age) throws RemoteException;
 
    void setHeight(float height) throws RemoteException;
 
    void setName(String name) throws RemoteException;
 
}