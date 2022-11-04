public class EjercicioBucle {
    //variable num aleatorio 1-100 y que se salga de bucle cuando salga el numSalir

    public static void main(String[] args) {
        
        int max = 10;
        int enteroRandom = (int)Math.floor(Math.random()*max);
        int numSalir = 3;
        do {
            enteroRandom = (int)Math.floor(Math.random()*max);   
            System.out.println(enteroRandom);
        } while (enteroRandom != numSalir );
        
    }

}
