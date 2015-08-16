package aplicacionesdistribuidas.rmi.prueba2.server;
 
import aplicacionesdistribuidas.rmi.prueba2.shared.RemoteIF;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
/**
 *
 * @author
 */
public class RemoteObject extends UnicastRemoteObject implements RemoteIF{
    private String name;
    private int age;
    private float height;
 
    public RemoteObject() throws RemoteException{
        name="foo";
        age=31;
        height=1.71f;
    }
 
    @Override
    public String getName()  throws RemoteException{
        return name;
    }
 
    @Override
    public void setName(String name) throws RemoteException {
        this.name = name;
    }
 
    @Override
    public int getAge() throws RemoteException {
        return age;
    }
 
    @Override
    public void setAge(int age) throws RemoteException {
        this.age = age;
    }
 
    @Override
    public float getHeight() throws RemoteException {
        return height;
    }
 
    @Override
    public void setHeight(float height) throws RemoteException {
        this.height = height;
    }
 
}