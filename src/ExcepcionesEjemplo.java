import java.util.Scanner;

public class ExcepcionesEjemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = Integer.parseInt(scanner.nextLine());

        try{
            System.out.println("Division: " + (a/b));
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        } catch(NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");
        } finally {
            System.out.println("Siempre se ejecuta....");
        }

        System.out.println("Fin del programa");
    }
}
