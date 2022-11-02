public class IfElseMultiple {
    // Dias de la semana
    public static void main(String[] args) {
        Integer dia=9;

        if (dia==1)
            System.out.println("Lunes");
        else if (dia==2)
            System.out.println("Martes");
        else if (dia==3)
            System.out.println("Miercoles");
        else if (dia==4)
            System.out.println("Jueves");
        else if (dia==5)
            System.out.println("Viernes");
        else if (dia==6||dia==7)
            System.out.println("Es fin de semana");
        else
            System.out.println("Los días de la semana son del 1 al 7");  
    }
    
}
