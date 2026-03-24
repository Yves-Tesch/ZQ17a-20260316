package tag07_grundlagen._01_Encapsulation;

public class App {

	public static void main(String[] args) {
		Person person = new Person();
		person.setAlter(15);
		
		System.out.println(person.getAlter());
		System.out.println(person.getIstVolljaehrig());
	}

}
