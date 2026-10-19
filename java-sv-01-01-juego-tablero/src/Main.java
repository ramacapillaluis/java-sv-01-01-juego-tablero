import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1º) YAGO (DEFINIMOS UN TABLERO 10X10)
        char[][] matriz = new char[10][10];
        // 2º) Sergio
        int vidas = 10;
        // 3º) Dani + David
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna] = '*';
            }

        }

        //5º) ALEJANDRO
        char YODA = 'Y';
        matriz[0][0] = YODA;

        char CASILLA_FINAL = 'F';
        matriz[9][9] = CASILLA_FINAL;

        //6ª) MARCOS Y LUIS

        Random aleatorios = new Random();

        int filaRandom = aleatorios.nextInt(10);
        int columnaRandom = aleatorios.nextInt(10);

        matriz[filaRandom][columnaRandom] = 'M';

        //7º) MUFFIN+SEBAS - BORIS + IKER

        int filaRandom2 = aleatorios.nextInt(10);
        int columnaRandom2 = aleatorios.nextInt(10);

        for (int i = 0; i < 5; i++) {
            do {
                filaRandom2 = aleatorios.nextInt(10);
                columnaRandom2 = aleatorios.nextInt(10);
            } while (matriz[filaRandom2][columnaRandom2] != '*');
            matriz[filaRandom2][columnaRandom2] = 'P';

        }

        // 8º) PABLO IMPORTANTE DIA HOY

        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println("Y te puedes desplazar con las letras W A S D");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una letra: ");
        char desplazamiento = sc.next().charAt(0);

        System.out.println("La letra elegida es " + desplazamiento);

        // 9º) YOEL

        int filayoda = 0;
        int columnayoda = 0;

        matriz[filayoda][columnayoda] = YODA;

        if (desplazamiento == 'D') {
            columnayoda = columnayoda + 1;
            matriz[filayoda][columnayoda] = YODA;
        }

        // 4º) Carlos + Jaraba

        for (int fila = 0; fila <matriz.length; fila++) {
            for (int columna = 0; columna <matriz.length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println("");
        }



    }
}