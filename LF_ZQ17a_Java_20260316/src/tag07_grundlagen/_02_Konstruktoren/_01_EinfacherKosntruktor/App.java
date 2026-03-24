package tag07_grundlagen._02_Konstruktoren._01_EinfacherKosntruktor;

public class App {

	public static void main(String[] args) {
		Person person = new Person("Yves", 38);
		System.out.println("Name: " + person.getName());
		System.out.println("Alter der Person: " + person.getAlter());
		System.out.println("Status Volljährigkeit: " + (person.getIstVolljaehrig() ? "Volljährig" : "Nicht volljährig"));
	}

}
