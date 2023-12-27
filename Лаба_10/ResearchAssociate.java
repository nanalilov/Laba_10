import java.util.Scanner;
public class ResearchAssociate extends Employee {

	public void fieldOfStudy() {
		// TODO - implement ResearchAssociate.fieldOfStudy
		throw new UnsupportedOperationException();
	}

	public void doResearch() {
		// TODO - implement ResearchAssociate.doResearch
		throw new UnsupportedOperationException();
	}

	public void findStudentsForResearch() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите колличество студентов для исследования - ");
		int list = scanner.nextInt();

		System.out.println("Введите колличество студентов для исследования - ");
		int speed = scanner.nextInt();

		return (double) list * speed;
	}
	}

}