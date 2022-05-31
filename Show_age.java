import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Show_age {

	public static void main(String[] args) {

		String name;
		String birth;
		LocalDate date;
		LocalDate today;
		Integer age;

		Scanner aa = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		name = aa.next();

		Scanner bb = new Scanner(System.in);
		System.out.println("Digite uma data: ");
		birth = bb.next();
		date = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		today = LocalDate.now();

		age = Period.between(date, today).getYears();

		System.out.println("Olá, " + name + "! Atualmente você tem " + age + " anos!");

		aa.close();
		bb.close();
	}

}
