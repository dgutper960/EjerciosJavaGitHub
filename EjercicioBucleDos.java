public class EjercicioBucleDos {
    public static void main(String[] args) {
      final int MAX = 10;
      int numAleatorio = (int) (Math.random()*MAX);
      int numSalir = 3;

      while(numSalir != numAleatorio) {
        System.out.println(numAleatorio);
        numAleatorio = (int) (Math.random()*MAX);
    }
    System.out.println("Numero salir es igual a " + numSalir);
    }
    
}
