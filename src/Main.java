import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Figure figure;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Вибор фігур - прямокутний трикутник (1), трикутник (2) ,рівнобедрений (3) чи рівносторонній (4): ");

        int choice = Integer.parseInt(scanner.nextLine());

        String[] inputs;

        switch (choice) {

            case 1:

                System.out.println("Введіть катети прямокутного трикутника: ");

                inputs = scanner.nextLine().split(" ");

                figure = new Triangle(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));

                break;

            case 2:

                System.out.println("Введіть 3 сторони трикутника: ");

                inputs = scanner.nextLine().split(" ");

                figure = new Triangle_random(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));

                break;

            case 3:

                System.out.println("Введіть дві сторони рівнобедреного трикутника(одну з рівних і основу): ");

                inputs = scanner.nextLine().split(" ");

                figure = new Triangle_2(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));

                break;
            case 4:

                System.out.println("Введіть сторону рівностороннього трикутника: ");

                inputs = scanner.nextLine().split(" ");

                figure = new Triangle_3(Integer.parseInt(inputs[0]));

                break;
            default:

                System.out.println("Wrong input");

                return;

        }


        System.out.println("Периметр дорівнює: " + figure.getPerimeter());

        System.out.println("Площа рівна: " + figure.getSquare());


    }

}
