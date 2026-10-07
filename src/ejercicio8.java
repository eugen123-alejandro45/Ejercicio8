
public class ejercicio8 {
    public static void main(String[] args) {
        int secuencia [][] = new int [10][10];

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                secuencia[y][x] = 1;
            }
        }

        secuencia[0][4] = 8;
        secuencia[2][6] = 8;
        secuencia[3][1] = 8;
        secuencia[8][6] = 8;

        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                System.out.print(secuencia[y][x] + " ");
            }
            System.out.println();
        }
    }
}