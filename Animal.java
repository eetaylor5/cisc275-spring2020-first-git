public class Animal {
    String name;
    int legs;

    Animal(String n, int l) {
            name = n;
            legs = l;
    }

    @Override
	public String toString() {
            return name + legs;
    }
    
    int getLegs() {
    	return this.legs;
    }
}
