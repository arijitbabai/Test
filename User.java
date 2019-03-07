
import java.util.ArrayList;

public class User {
        private ArrayList<Vehicle> a = new ArrayList<Vehicle>();
    public void addVehicle(Vehicle v){
        a.add(v);
    }
    public void showVehicle(){
        for(int i = 0; i < a.size() ; i++){
            a.get(i).show();
        }
    }
    public void removeVehicle(Vehicle v){
        int i = a.indexOf(v);
        a.remove(i);
    }
}
