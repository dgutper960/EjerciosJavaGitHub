public class EjemploFactorial {
    //Dado un num N calcular su factorial (multiplicado por sus num precedentes)
    public static void main(String[] args) {

        int num=3;
        int result=1;
    

        System.out.println("Calcular factorial del numero: " + num);

        for(int i=num; i>=result; i--){
            result=num*i;
        }
        System.out.println("El factorial de " + num + " es: " + result);

    }
    
}
