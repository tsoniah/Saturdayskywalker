package classthree;
/* Polymorphism is the ability of an object to take on many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

// Method Overloading
public static void car(){
	System.out.println("My car is Audi");
}

public static void car(String color){
	System.out.println("My car is Audi, its color is " + color);
}

public static void car(String color, int door){
	System.out.println("My car is Audi, its color is " + color + ", This has door " + door);
}

// Method Overridding
public static void login(String username, String password){
	System.out.println("This is the Method Overridding in child class");
}

}
tem.out.println("This is the Method Overridding in child class");


	
	
	

