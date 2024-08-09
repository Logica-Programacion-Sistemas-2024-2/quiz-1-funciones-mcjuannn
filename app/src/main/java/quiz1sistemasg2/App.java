package quiz1sistemasg2;
import java.util.Scanner;


public class App {
    public static int CalcularValorHora(String tipoVehiculo, int horasParqueadero) {
        int valorHora = 0;
        int horaExtra = 0;
        int valorHoraExtra = 0;
        int totalValorHoras = 0;
        
        switch (tipoVehiculo) {
            case "C":
                if (horasParqueadero < 3) {
                    valorHora = 5000;
                    totalValorHoras = horasParqueadero * valorHora;
                    return totalValorHoras;
                }
                else if (horasParqueadero > 3) {
                    valorHora = 5000 * horasParqueadero;
                    horaExtra = horasParqueadero - 3;
                    valorHoraExtra = horaExtra * 2000;
                    totalValorHoras = valorHora + valorHoraExtra;
                    return totalValorHoras;
                }
                else {
                    return -1;
                }

            case "M":
            if (horasParqueadero < 3) {
                valorHora = 3000;
                totalValorHoras = horasParqueadero * valorHora;
                return totalValorHoras;
            }
            else if (horasParqueadero > 3) {
                valorHora = 3000 * horasParqueadero;
                horaExtra = horasParqueadero - 3;
                valorHoraExtra = horaExtra * 2000;
                totalValorHoras = valorHora + valorHoraExtra;
                return totalValorHoras;
            }
            else {
                return -1;
            }

            case "B":
               if (horasParqueadero < 3) {
                valorHora = 1000;
                totalValorHoras = horasParqueadero * valorHora;
                return totalValorHoras;
            }
            else if (horasParqueadero > 3) {
                valorHora = 1000 * horasParqueadero;
                horaExtra = horasParqueadero - 3;
                valorHoraExtra = horaExtra * 2000;
                totalValorHoras = valorHora + valorHoraExtra;
                return totalValorHoras;
            }
            else {
                return -1;
            }
            default:
            return -1;
        }
        
    }


    public static int CalcularDescuento(int totalValorHoras, int esEstudiante, int horasParqueadero) {
        double totalValorHorasDescuento = 0;
        if (horasParqueadero > 4) {
            totalValorHorasDescuento = totalValorHoras - (totalValorHoras * 0.3);
            return (int) totalValorHorasDescuento;
        }
       
        if (esEstudiante == 1) {
            totalValorHorasDescuento = totalValorHoras - (totalValorHoras * 0.05);
            }
            return (int) totalValorHorasDescuento;
        }

    
    public static int CalcularFactura(int totalValorHoras, int totalValorHorasDescuento){
            double valorFinal;
            valorFinal = (totalValorHoras - totalValorHorasDescuento) * (1.19);
            return (int) valorFinal;
        }
        

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué tipo de vehículo estacionó? (En mayuscula) (C: Carro | M: Moto | B: Bicicleta): ");
        String tipoVehiculo = sc.nextLine();
        sc.nextLine();

        String tipoVehiculoString = "";
        
        if (tipoVehiculo == "C") {
            tipoVehiculoString = "Carro";
        }
        if (tipoVehiculo == "M") {
            tipoVehiculoString = "Moto";
        }
        if (tipoVehiculo == "B") {
            tipoVehiculoString = "Bicicleta";
        }
        

        if (!tipoVehiculo.equals("C") && !tipoVehiculo.equals("M") && !tipoVehiculo.equals("B")) {
            System.out.println("Tipo de vehículo inválido. Intente de nuevo");
            return;
        }

        System.out.println("Cuántas horas permaneció en el parqueadero?: ");
        int horasParqueadero = sc.nextInt();
        sc.nextLine();

        System.out.println("¿Es usted un estudiante? (1. Sí | 2. No): ");
        int esEstudiante = sc.nextInt();
        sc.nextLine();

        if (esEstudiante != 1 && esEstudiante !=2) {
            System.out.println("Ingreso inválido. Intente nuevamente.");
            return;
        }

        int totalValorHoras = CalcularValorHora(tipoVehiculo, horasParqueadero);
        int totalDescuentos = CalcularDescuento(esEstudiante, esEstudiante, horasParqueadero);
        int final_a_pagar = CalcularFactura(totalValorHoras, totalDescuentos);

        System.out.println("PARQUEADERO: FACTURA");
        System.out.println("Tipo de vehiculo estacionado: " + tipoVehiculoString);
        System.out.println("Horas de permanencia: " + horasParqueadero);
        System.out.println("Valor total antes de descuentos: " + totalValorHoras);
        System.out.println("Valor del descuento por permanencia: " + totalDescuentos);
        System.out.println("Total a pagar: " + final_a_pagar);
        
       

    }

    /*  Implemente una funcion llamada calcularValorHora que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de vehiculo (C, M o B)
            - Un entero que representa la cantidad de horas de permanencia
        * Retorna:
            - Un entero representando el valor total de las boletas
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuento que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando la si es estudiante o no
            - Un entero represenatando la cantidad de horas
        * Retorna:
            - Un entero representando el valor del descuento
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor total de las horas
            - Un entero representando el valor del descuento
        * Retorna:
            - Un entero representando el valor del total de la factura incluyendo el iva
    */
    //------------------------------------------------------------------
    


    //------------------------------------------------------------------
}

