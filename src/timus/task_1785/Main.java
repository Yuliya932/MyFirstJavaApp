package timus.task_1785;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt(); //считываем поступившее значение

        if (a >= 1 && a <= 4){
            System.out.println("few");
        } else  if (a >= 5 && a <= 9){
            System.out.println("several");
        } else  if (a >= 10 && a <= 19){
            System.out.println("pack");
        } else  if (a >= 20 && a <= 49){
            System.out.println("lots");
        } else  if (a >= 50 && a <= 99){
            System.out.println("horde");
        } else  if (a >= 100 && a <= 249){
            System.out.println("throng");
        } else  if (a >= 250 && a <= 499){
            System.out.println("swarm");
        } else  if (a >= 500 && a <= 999){
            System.out.println("zounds");
        } else  if (a >= 1000){
            System.out.println("legion");
        }


              out.flush();
    }
}
/*от 1 до 4	несколько	few
        от 5 до 9	немного	several
        от 10 до 19	отряд	pack
        от 20 до 49	толпа	lots
        от 50 до 99	орда	horde
        от 100 до 249	множество	throng
        от 250 до 499	сонмище	swarm
        от 500 до 999	полчище	zounds
        от 1000	легион	legion*/