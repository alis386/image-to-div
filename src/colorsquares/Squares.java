package colorsquares;

import java.util.Scanner;

public class Squares {

    public int[][] squares;

    public void loadData(Scanner scanner) {
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        squares = new int[height][width];

        loadContent(scanner, width, height);
    }

    private void loadContent(Scanner scanner, int width, int height) {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                squares[y][x] = scanner.nextInt();
            }
        }
    }

}
