import javax.jws.soap.SOAPBinding;

public class MyMain {
    public static void main( String args[]){
        User u = new User();
        Vehicle v = new Scooter("Bajaj");
        Vehicle v1 = new Scooter("Hero");
        u.addVehicle(v);
        u.addVehicle(v1);
        u.showVehicle();
        u.removeVehicle(v);
        u.showVehicle();
    }
}
