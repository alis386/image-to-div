package colorsquares;

import java.util.Scanner;

public class Palette {

    public Color[] palette;

    public void loadData(Scanner scanner) {

        int numberOfElements = scanner.nextInt();
        palette = new Color[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            palette[i] = loadSingleElement(scanner);
        }
    }

    private Color loadSingleElement(Scanner scanner) {
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        return new Color(r, g, b);
    }

}
