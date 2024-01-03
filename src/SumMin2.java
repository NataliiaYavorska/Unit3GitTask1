import java.util.Scanner;
public class SumMin2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        int a = input.nextInt();

        System.out.println("Введіть друге число, більше ніж перше: ");
        int b = input.nextInt();
for(int i=a+1; i<b; i++){
    if (i%2!=0){
        System.out.println("Непарні числа між " + a + " і " + b + ": " + i);
    }
}


    }
}


//Дано два числа A и B (A<B) выведите все нечетные значения,
// расположенные между данными числами.