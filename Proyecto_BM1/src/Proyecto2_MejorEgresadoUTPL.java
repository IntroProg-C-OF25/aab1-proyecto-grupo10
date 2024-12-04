
import java.util.Random;


public class Proyecto2_MejorEgresadoUTPL {

    public static void main(String[] args) {
        Random random = new Random();
        String[] nombres = {"Carlos", "Ana", "Jesus", "Maria", "Juan", "Daniela", "Sebastian", "Domenica", "Luis", "Tiago"};
        String nombre, mejor_egre = null, mejor_egre2 = null;
        double promedio, mejo_prom = -1, mejo_prom2 = -1;
        int cont = 1;
        while (cont <= 10) {
            nombre = nombres[random.nextInt(nombres.length)];
            promedio = Math.round(Math.random() * 10 * 100.0) / 100.0;
            System.out.println("Estudiante" + cont + ": " + nombre + " Promedio: " + promedio);
            if (promedio > mejo_prom) {
                mejo_prom2 = mejo_prom;
                mejor_egre2 = mejor_egre;
                mejo_prom = promedio;
                mejor_egre = nombre;
            } else {
                if (promedio > mejo_prom2) {
                    mejo_prom2 = promedio;
                    mejor_egre2 = nombre;
                }
            }
            cont++;
        }
        System.out.println("");
        System.out.println("Mejor egresado de la carrera: " + mejor_egre + " con un promedio de: " + mejo_prom);
        System.out.println("Por sus grandes logros y excelencia academica");
        System.out.println("Felicitaciones y exitos en su vida profesional!!");
        if (mejo_prom2 == mejo_prom || mejo_prom2 > 9) {
            System.out.println("Segundo mejor egresado: " + mejor_egre2 + " con un promedio de: " + mejo_prom2);
            System.out.println("Felicitaciones y exitos en tu vida profesional!");
        } else {
            System.out.println("No hay segundo mejor egresado");
        }
    }
}
    
