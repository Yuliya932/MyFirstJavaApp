<<<<<<< HEAD
/*4. Напишите программу, в которой пользователю предлагается
ввести название месяца и количество дней в этом месяце.
Программа выводит сообщение о том,
что соответствующий месяц содержит указанное количество дней.*/


package lr1;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце: ");
        int days = in.nextInt();


        System.out.println("Месяц " + month+ " содержит " + days + " день (дней)" );

        in.close();

    }
}
=======
/*4. Напишите программу, в которой пользователю предлагается
ввести название месяца и количество дней в этом месяце.
Программа выводит сообщение о том,
что соответствующий месяц содержит указанное количество дней.*/


package lr1;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце: ");
        int days = in.nextInt();


        System.out.println("Месяц " + month+ " содержит " + days + " день (дней)" );

        in.close();

    }
}
>>>>>>> github/master
