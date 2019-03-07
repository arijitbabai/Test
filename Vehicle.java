

public class Vehicle {
    private String name;
    Vehicle( String name) {
        this.name = name;
    }
    public void show(){
        Printer.print(name);
    }
}
