package colorsquares;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SquareGenerator {

    private Palette palette;
    private Squares squares;

    public void setPalette(Palette palette) {
        this.palette = palette;
    }

    public void setSquares(Squares squares) {
        this.squares = squares;
    }

    public void generate(String fileName) {
        try {
            PrintWriter file = new PrintWriter(fileName);
            generate(file);
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SquareGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generate(PrintWriter file) {

        file.println("<!DOCTYPE html><html><head><style>");

        for (int i = 0; i < palette.palette.length; i++) {
            file.println(".style" + i + "{width: 16px; height: 16px; float: left; background-color:#" + palette.palette[i] + "}");
        }

        file.println(".line-breaker {clear: both;}</style></head><body>");

        for (int y = 0; y < squares.squares.length; y++) {
            for (int x = 0; x < squares.squares[y].length; x++) {
                file.println("<div class=\"style" + squares.squares[y][x] + "\">" + "</div>");
            }
            file.println("<div class=\"line-breaker\"></div>");
        }

        file.println("</body></html>");
    }

}
