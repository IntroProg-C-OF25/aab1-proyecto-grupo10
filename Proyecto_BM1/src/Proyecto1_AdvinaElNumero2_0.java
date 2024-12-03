
import java.util.Scanner;

public class Proyecto1_AdvinaElNumero2_0 {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100), numero, contador = 10;
        String pregunta = "no";     
        Scanner tcl = new Scanner(System.in);

        System.out.println("BEINVENIDO AL JUEGO DE ADINIVAR EL NUMERO!!");
        System.out.println("USTED TIENE 10 INTENTOS PARA ADIVINAR EL NUMERO:");

        while (contador > 0) {
            System.out.print("ADIVINA NUMERO (0-100): ");
            numero = tcl.nextInt();
            if (numero == aleatorio) {
                System.out.println("FELICIDADES ADIVINASTE");
                break;
            } else {
                System.out.println("SIGUE INTENTANDO");
                contador--;
                System.out.println("INTENTOS RESTANTES: " + contador);
            }
            if (contador == 0) {
                System.out.println("GAME OVER!! EL NUMERO ERA: " + aleatorio);
                break;
            }

            System.out.print("NECESITAS PISTAS?(S/N): ");
            pregunta = tcl.next();
            if (pregunta.equalsIgnoreCase("S")) {
                contador--;
                System.out.println("INTENTOS RESTANTES: " + contador);
                System.out.println(aleatorio > numero ? "EL NUMERO ES MAYOR!!" : "EL NUMERO ES MENOR!!");
                System.out.println(aleatorio % 2 == 0 ? "EL NUMERO ES PAR!!" : "EL NUMERO ES INPAR!!");
                int i = 1, c = 0;
                while (i <= aleatorio) {
                    if (aleatorio % i == 0) {
                        c++;
                    }
                    i++;
                }
                if (c == 2) {
                    System.out.println("EL NUMERO ES PRIMO!!");
                } else {
                    System.out.println("EL NUMERO NO ES PRIMO!!");
                }
                int a = 0, b = 1, suma = 0;
                boolean pertenece = false;
                while (suma <= aleatorio) {
                    if (suma == aleatorio) {
                        pertenece = true;
                        break;
                    }
                    suma = a + b;
                    a = b;
                    b = suma;
                }
                if (pertenece) {
                    System.out.println("EL NUMERO PERTENECE A LA SERIE FIBONACCI!!");
                } else {
                    System.out.println("EL NUMERO NO PERTENECE A LA SERIE FIBONACCI!!");
                }
                if (aleatorio % 5 == 0) {
                    System.out.println("EL NUMERO ES MULTIPLO DE 5!!");
                } else {
                    System.out.println("EL NUMERO NO ES MULTIPLO DE 5!!");
                }

            }
        }

    }
}
