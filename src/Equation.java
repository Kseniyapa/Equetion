import java.util.Scanner;
/*
 *  ax^2 + bx + c = -7
 */

public class Equation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите а: ");
        int a = scan.nextInt();
        System.out.print("Введите b: ");
        int b = scan.nextInt();
        System.out.print("Введите c: ");
        int c = scan.nextInt();


        int x1, x2;
        int D = b * b - 4 * a * c;      // дискриминант
        if (D < 0) {
            System.out.println("Корней нет");
        } else if (D == 0) {
            x1 = -b / 2 * a;
            System.out.printf("Корень один: %d", x1);
        } else {
            x1 = (int) ((-b - Math.sqrt(D)) / 2 * a);
            x2 = (int) ((-b + Math.sqrt(D)) / 2 * a);
            System.out.printf("x1 = %d, x2 = %d", x1, x2);
        }
    }
}


