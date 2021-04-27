public class Fruit {
	private String name;
	public Fruit(String name) {
		this.name = name;
	    System.out.println("Fruit constructor is invoked");
	  }
	public String getName() {
		return this.name;
	}
}

class Apple extends Fruit{
	String colour;
	public Apple(String name, String colour) {
		super (name);
		this.colour = colour;
	    System.out.println("Apple constructor is invoked");
	  }
}

class RedApple extends Apple{
	String taste;
	double price;
	public RedApple(String name, String colour, String taste, double price) {
		super (name, colour);
		this.taste = taste;
		this.price = price;
	}
}

class GreenApple extends Apple{
	String taste;
	double price;
	public GreenApple(String name, String colour, String taste, double price) {
		super (name, colour);
		this.taste = taste;
		this.price = price;
	}
}

class Orange extends Fruit{
	String colour, taste;
	double price;
	public Orange(String name, String colour, String taste, double price) {
		super (name);
		this.colour = colour;
		this.taste = taste;
		this.price = price;
	    System.out.println("Orange constructor is invoked");
	  }
}

class Strawberry extends Fruit{
	String colour, taste;
	double price;
	public Strawberry(String name, String colour, String taste, double price) {
		super (name);
		this.colour = colour;
		this.taste = taste;
		this.price = price;
		System.out.println("Strawberry constructor is invoked");
	}
}

class Main {
	public static void main(String[] args) {
		Apple a = new Apple("Apple", "Red");
		System.out.println("\nName: \t\t" + a.getName());
	    System.out.println("Colour: \t"+ a.colour);
	    System.out.println();
	    
		RedApple b = new RedApple("Red Apple", "Red", "Sweet", 1.4);
		System.out.println("\nName: \t\t" + b.getName());
	    System.out.println("Colour: \t"+ b.colour);
	    System.out.println("Taste: \t\t" + b.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", b.price);
	    
		GreenApple c = new GreenApple("Green Apple", "Green", "Sour", 1.2);
		System.out.println("\nName: \t\t" + c.getName());
	    System.out.println("Colour: \t"+ c.colour);
	    System.out.println("Taste: \t\t" + c.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", c.price);
	    
		Orange d = new Orange("Orange","Orange", "Sweet", 0.7);
		System.out.println("\nName: \t\t" + d.getName());
	    System.out.println("Colour: \t"+ d.colour);
	    System.out.println("Taste: \t\t"+ d.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", d.price);
	    
		Strawberry e = new Strawberry("Strawberry", "Red", "Sweet", 5);
		System.out.println("\nName: \t\t" + e.getName());
	    System.out.println("Colour: \t"+ e.colour);
	    System.out.println("Taste: \t\t" + e.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", e.price);
	}
}
