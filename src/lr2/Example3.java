<<<<<<< HEAD
/*3. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.*/
package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int div1 = number % 4;

        if (div1 == 0 & number >=10) {
            System.out.println("Число удовлетворяет критериям");
        }
        else System.out.println("Число не удовлетворяет критериям");
        System.out.println ("При делении на 4 остаток = "+div1);
        if (number >=10) {
            System.out.println("Число не меньше 10");
        }
        else System.out.println("Число меньше 10");

    }
}
=======
/*3. Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.*/
package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = in.nextInt();

        int div1 = number % 4;

        if (div1 == 0 & number >=10) {
            System.out.println("Число удовлетворяет критериям");
        }
        else System.out.println("Число не удовлетворяет критериям");
        System.out.println ("При делении на 4 остаток = "+div1);
        if (number >=10) {
            System.out.println("Число не меньше 10");
        }
        else System.out.println("Число меньше 10");

    }
}
>>>>>>> github/master
