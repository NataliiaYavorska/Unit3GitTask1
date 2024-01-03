import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        int a = input.nextInt();

        System.out.println("Введіть друге число, більше ніж перше: ");
        int b = input.nextInt();

        int sum = 0;
        for(int i=a+1; i<b; i++) {
            sum += i;
        }
        System.out.println("Сума чисел між "  + a + " і " + b + " дорівнює: " + sum);
    }
}



// Дано два числа A и B (A<B) выведите суму всех чисел,
// расположенных между данными числами на экран.
// Дано два числа A и B (A<B) выведите все нечетные значения,
// расположенные между данными числами.