import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Pesos Argentinos a USD\n"
                    + "2 - Reales Brasileros a USD \n"
                    +"3 - Pesos Colombianos a USD\n"
                    +"4 - Salir");
            System.out.print("INGRESE UNA OPCIÓN: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion){
                case '1':
                    convertir(1036.73, "Pesos Argentinos");
                    break;
                case '2':
                    convertir(0.38, "Reales Brasileros");
                    break;
                case '3':
                    convertir(4322.47, "Pesos Colombianos");
                    break;
                case '4':
                    System.out.println("CERRANDO PROGRAMA");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
        }
    }

    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100d)/100;

        System.out.println("--------------------------------------");
        System.out.println("|   Usted tiene $"+dolares+ "USD   |");
        System.out.println("--------------------------------------");
    }
}
