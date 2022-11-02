public class SwitchEjemploDos {
    //Dado un mes dar el núm de días que tiene

    public enum Mes {
        Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
    }
    public static void main(String[] args) {

        Mes mesDeHoy = Mes.Enero;

        switch (mesDeHoy) {
            case Enero: System.out.println("Tiene 31 días");  
                break;
            case Febrero: System.out.println("Tiene 28 o 29 días"); 
                break;
            case Marzo: System.out.println("Tiene 31 días"); 
                break;
            case Abril: System.out.println("Tiene 30 días");  
                break;
            case Mayo: System.out.println("Tiene 31 días");
                break;
            case Junio: System.out.println("Tiene 30 días");
                break;
            case Julio: System.out.println("Tiene 31 días");
                break;
            case Agosto: System.out.println("Tiene 31 días");
                break;
            case Septiembre: System.out.println("Tiene 30 días");
                break;
            case Octubre: System.out.println("Tiene 31 días");
                break;
            case Noviembre: System.out.println("Tiene 30 días");
                break;
            case Diciembre: System.out.println("Tiene 31 días");
                break;
            default: System.out.println("El año tiene 12 meses");
                break;
        }
    }
}