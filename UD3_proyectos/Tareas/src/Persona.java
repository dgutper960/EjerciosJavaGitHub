public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Persona fulanito = new Persona();
        System.out.println("Su nombre: " + fulanito.getName());

        //Creamos una stancia (objeto) de persona: Juanito de 20 años
        Persona juanito = new Persona("Juanito", 20);
        System.out.println("Su nombre: " + juanito.getName());
        System.out.println("Su edad: " + juanito.getAge());
        System.out.println("Su especie: " + Persona.getSpecies());

        Persona Pepito = new Persona("Pepito", 10);
        System.out.println("Su nombre: " + Pepito.getName());
        System.out.println("Su edad: " + Pepito.getAge());
        System.out.println("Su especie: " + Pepito.setSpecies());


        Persona David = new Persona("David", 38);
        System.out.println("Su nombre: " + David.getName());
        System.out.println("Su edad: " + David.getAge());
        System.out.println("Su especie: " + David.getSpecies());

    }
}

