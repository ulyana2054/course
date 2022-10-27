package courseCl;
import java.util.Scanner;
public class Helper {
	public static void chooseCourse(Describable object) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Выберите курс: " 
							+"\n" + "1 - CR"
							+"\n" + "2 - ILO"
							+"\n" + "3 - SPVC");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			object = new CR_Course();
			break;
		case 2:
			object = new ILO_Course();
			break;
		case 3:
			object = new SPVC_Course();
			break;	
		
		}
	}
}
 /*
  * в конструкторы надо передать значения полей
  * значения надо ввести
  */

