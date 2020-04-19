package by.academy.homework2;

public class Task3 {
    public static void main(String[] args) {
        Fridge Fridge = new Fridge("Атлант");
        Fridge.plugIn();
        Fridge OldFridge= new OldFridge("Икар");
        OldFridge.plugIn();
    }
}

abstract class Appliances {
    abstract void plugIn();
}

class Fridge extends Appliances {

    String name;

    public Fridge(String name) {
        this.name = name;
    }

    public Fridge() {

    }

    @Override
    public void plugIn() {
        System.out.println(this + " включен в розетку.");
    }

    @Override
    public String toString() {
        return name;

    }

}

class OldFridge extends Fridge {

    public OldFridge(String name) {
        super();
        this.name = name;
    }

    @Override
    public void plugIn() {
        System.out.println(this + " включен в розетку.");
        System.out.println(this + " начал тарахтеть как трактор ");
    }
}