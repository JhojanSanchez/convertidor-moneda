import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;

        while (opcion !=8){
            System.out.println( "*****************************************\n" +
                    "Bienvenidos al conversor de monedas\n"+
                    "Ingrese la conversión que vas a realizar\n"+
                    "1. Dólar a Peso Argentino\n"+
                    "2. Peso Argentino a Dólar\n"+
                    "3. Dólar a Real Brasileño\n" +
                    "4. Real Brasileño a Dólar\n" +
                    "5. Dólar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dólar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir.\n" +
                    "*****************************************");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertidorDeMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertidorDeMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertidorDeMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertidorDeMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertidorDeMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertidorDeMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertidorDeMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Gracias por usar la aplicación.");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }

        }

    }
}
