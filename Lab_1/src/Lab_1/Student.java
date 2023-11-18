package Lab_1;
import java.util.Scanner;

public class Student {
	 private String imie;
	    private String nazwisko;
	    private int id;
	    
	    public Student() {}
	    
	    public Student(String imie, String nazwisko, int id) {
	        this.imie = imie;
	        this.nazwisko = nazwisko;
	        this.id = id;
	    }
	    public void wyświetl() {
	        System.out.println("Imie: "+imie);
	        System.out.println("Nazwisko: "+nazwisko);
	        System.out.println("Numer Indeksu: "+id);
	    }
	    public void studentZKonsoli() {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Wprowadź imię: ");
	    	imie = scanner.nextLine();

	    	System.out.println("Wprowadź nazwisko: ");
	    	nazwisko = scanner.nextLine();

	    	System.out.println("Wprowadź numer indeksu: ");
	    	id = Integer.parseInt(scanner.nextLine());
	    	scanner.close();
	    	wyświetl();
	    }
}
