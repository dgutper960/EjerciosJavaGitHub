public class EjemploSwitch {
    
enum Dia {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO,
    }
    public static void main(String[] args) {

    Dia DiaDeHoy = Dia.MIERCOLES;
    switch (DiaDeHoy) {
        case LUNES: System.out.println("Los Lunes son lo más");
            break;
        case MARTES: System.out.println("Los Martes no te embarques");
            break;
        case MIERCOLES: System.out.println("Los Miercoles son estiercoles");
            break;
        case JUEVES: System.out.println("Los Jueves te enjueges");
            break;
        case VIERNES: System.out.println("Los Viernes viernetes...");
            break;
        case SABADO: System.out.println("Sabash...");
            break;
        case DOMINGO: System.out.println("El día del sueñor");
            break;
        }

    }
        
}
