import java.util.Scanner;

public class CalculoSueldoNeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los datos del empleado
        System.out.print("Ingrese la categoría del empleado (A, B, C): ");
        String categoria = scanner.nextLine();

        System.out.print("Ingrese la antigüedad del empleado en años: ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        // Calcular el aumento por antigüedad
        double aumento = 0.0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = sueldoBruto * 0.10;
        } else if (antiguedad > 10) {
            aumento = sueldoBruto * 0.30;
        }

        // Calcular el plus por categoría
        double plus = 0.0;
        switch (categoria.toUpperCase()) {
            case "A":
                plus = 1000;
                break;
            case "B":
                plus = 2000;
                break;
            case "C":
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida");
                return; // Terminar el programa si la categoría es inválida
        }

        // Calcular el sueldo neto
        double sueldoNeto = sueldoBruto + aumento + plus;

        // Mostrar el resultado
        System.out.println("Sueldo Neto: " + sueldoNeto);
    }
}
