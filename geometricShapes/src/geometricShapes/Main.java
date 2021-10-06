package geometricShapes;

import java.util.Scanner;

import geometricShapes.shapes.Circle;
import geometricShapes.shapes.Rectangle;

public class Main {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);


		int option;
		boolean exit = false;
		while (exit == false) {
			System.out.println("Choose option: \n 1. Rectangle \n 2. Circle \n 3. Exit");
			option = sc.nextInt();
			exit = false;
			switch (option) {
			case 1:
				System.out.print("Enter Length: ");
				int length = sc.nextInt();
				System.out.print("Enter Breadth: ");
				int breadth = sc.nextInt();
				Rectangle rectangle = new Rectangle(length, breadth);
				System.out.println("Area and Perimeter of Rectangle is: " + rectangle.getArea() + " and "
						+ rectangle.getPerimeter());
				break;

			case 2:
				System.out.println("Enter Radius: ");
				double radius = sc.nextDouble();
				Circle circle = new Circle(radius);
				System.out.println(
						"Area and circumference of Circle is: " + circle.getArea() + " and " + circle.getCircumference());

				break;

			case 3:
				exit = true;
				break;
			default:
				System.out.print("Enter Valid option");

			}
		}
		System.out.println("Exited :)");
	}
}
