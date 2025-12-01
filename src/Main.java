import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreUsuario;
        int edad;
        double saldoCuenta;
        boolean esPremium;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Plataforma streaming ---");
        System.out.println("Ingresa tu nombre: ");
        nombreUsuario=scanner.nextLine();
        System.out.println("Ingrese tu edad: ");
        edad=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresar saldo: ");
        saldoCuenta=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Eres usuario premium?");
        esPremium=scanner.nextBoolean();

        boolean accesoExclusivo = (edad >= 18) && esPremium == true;
        boolean calificaPromocion = (saldoCuenta > 1000) || (edad < 25);
        boolean perfilIncompleto = (saldoCuenta == 0) || !nombreUsuario.equals("invitado");
        boolean perfilActivoTotal = !perfilIncompleto && accesoExclusivo || calificaPromocion;

        System.out.println("--- Perfil --- ");
        System.out.println("Acceso exclusivo: " + accesoExclusivo);
        System.out.println("Promociones disponibles: " + calificaPromocion);
        System.out.println("Perfil completo: " + perfilIncompleto);
        System.out.println("Perfil activo: " + perfilActivoTotal);

    }
}