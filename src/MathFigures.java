public class MathFigures {
    public static void main(String[] args) {
        int a, b;
        for (a=0; a < 10; a++) {
            for (b=0; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        int max = 6;
        for (int i=0; i<6; i++){
            for(int j=0; j<max-i; j++) {
                System.out.print(" ");
            }
            for (int k= 0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i=max; i>=0; i--){
            for(int j=max-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=i*2+1; k>0; k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}




//Используя циклы и метод:
//System.out.print("*"), System.out.print(" "), System.out.print("\n") (для перехода на новую строку).
//Выведите на экран:
//прямоугольный треугольник
//равносторонний треугольник
//ромб