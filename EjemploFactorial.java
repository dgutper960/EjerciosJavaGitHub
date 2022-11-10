public class EjemploFactorial {
    //Dado un num N calcular su factorial (multiplicado por sus num precedentes)
    public static void main(String[] args) {

        int n=3;
        int factorial=1;
    

        System.out.println("Calcular factorial del numero: " + n);

        for(int i=1; i<=n; i++) {
            factorial = factorial *i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);

    }
    
}
