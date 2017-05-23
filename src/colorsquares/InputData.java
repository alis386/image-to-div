package colorsquares;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputData {

    public Palette palette = new Palette();
    public Squares squares = new Squares();

    public void loadData(String fileName) {

        File file = new File(fileName);
        try {
            loadData(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InputData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadData(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        palette.loadData(scanner);
        squares.loadData(scanner);
    }

}
