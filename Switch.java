public class Switch {
    public static void main(String[] args) {
    
    int dia = 6;

    switch (dia) {
        case 1: System.out.println("Lunes");
                break;
        case 2: System.out.println("Martes");
                break;
        case 3: System.out.println("Miércoles");
                break;
        case 4: System.out.println("Jueves");
                break;
        case 5: System.out.println("Viernes");
                break;
        case 6: case 7: System.out.println("Es fin de semana");
                break;
        default: System.out.println("Los días de la semana son del 1 al 7");
        }
    
    }
}
