package tag07_grundlagen._02_Konstruktoren._02_MehrfacherKonstruktor;

public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		System.out.println("Name Person 1: " + person1.getName()
			+ "\nAlter Person 1: " + person1.getAlter());
		
		System.out.println();
		
		Person person2 = new Person("Hendrik");
		System.out.println("Name Person 2: " + person2.getName()
		+ "\nAlter Person 2: " + person2.getAlter());
		
		System.out.println();
		
		Person person3 = new Person("Jasmin", 28);
		System.out.println("Name Person 3: " + person3.getName()
		+ "\nAlter Person 3: " + person3.getAlter());

	}

}
