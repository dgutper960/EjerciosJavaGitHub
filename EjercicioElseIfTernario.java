public class EjercicioElseIfTernario {
     //Si a>=b, mostrar a; en otro caso, mostrar b
    public static void main(String[] args) {
    int a=8, b=6;

    if (a>=b) {
        System.out.println(a + " es el mayor");
    }else{
        System.out.println(b + " es el mayor");
    }
//Para ponenrlo en una sola línea sería:
    String resultado = (a>=b)?"a es mayor":"b es menor o igual";
    System.out.println(resultado);

    }
}




