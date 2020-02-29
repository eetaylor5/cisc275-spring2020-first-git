public class Dog extends Animal {
//  String name;
//  int legs;

    Dog(String n, int l) {
    	super(n,l);
    }

    @Override
    public String toString() {
            return name + ": " + legs;
    }
}
