//задание 1
/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2!=0){
            System.out.print(a);
        }
    }
} */
//задание 2
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0 || a < 10) {
            System.out.println("Положительное число меньше 10 или ноль");
        }
        else if(a != 0 || a > 10){
            System.out.println("Положительное число больше 10 или отрицательное");
        }

    }
} */
//задание 3
/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.print("Понедельник");
        }
        if (a == 2) {
            System.out.print("Вторник");
        }
        if (a == 3) {
            System.out.print("Среда");
        }
        if (a == 4) {
            System.out.print("Четверг");
        }
        if (a == 5) {
            System.out.print("Пятница");
        }
        if (a == 6 || a == 7) {
            System.out.print("Выходной");
        }
    }
} */
//задание 4
/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1: System.out.print("Понедельник");
            break;
            case 2: System.out.print("Вторник");
            break;
            case 3: System.out.print("Среда");
            break;
            case 4: System.out.print("Четверг");
            break;
            case 5: System.out.print("Пятница");
            break;
            default:
                System.out.print("Выходной");

        }
    }
} */
//задание 5
/* public class Main {
    public static void main(String[] args) {
        int number = 1;
        int numstr = 1;
        while(number<11){
            System.out.println("Task"+numstr);
            numstr = numstr + 1;
            number = number + 1;
        }
    }
} */
//задание 6
/* public class Main {
    public static void main(String[] args) {
        int number = 1;
        do {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
    }
} */
//задание 7
public class Main {
    public static void main(String[] args) {
        char startChar = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(startChar + " ");
            startChar++;
        }
    }
}

