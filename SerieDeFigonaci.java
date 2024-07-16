package ejercicio;

public class SerieDeFigonaci {
    public static void main(String[] args) {
        int n = 10; // número de términos de la serie
        int t1 = 0, t2 = 1; // primeros dos términ
        System.out.print("Serie de Fibonacci: ");
        System.out.print(t1 + " ;" + t2); // imprime los dos primer
        for (int i = 3; i <= n; ++i) {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            System.out.print(" ; " + sum); // imprime el término actual
            }
            System.out.println();
            }
            

    }

