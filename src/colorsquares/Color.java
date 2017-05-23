package colorsquares;

public class Color {

    private int color;
    private final int requredHexLength = 6;

    Color() {
        set(0, 0, 0);
    }

    Color(int r, int g, int b) {
        set(r, g, b);
    }

    Color(String hexString) {
        set(hexString);
    }

    public void set(int r, int g, int b) {
        color = (r << 16) | (g << 8) | (b << 0);
    }

    public void set(String hexString) {
        color = Integer.parseInt(hexString, 16);
    }

    public int getR() {
        return (color >> 16) & 0xFF;
    }

    public int getG() {
        return (color >> 8) & 0xFF;
    }

    public int getB() {
        return (color >> 0) & 0xFF;
    }

    @Override
    public String toString() {
        String hexString = Integer.toHexString(color);
        return padWithZeros(hexString.toUpperCase());
    }

    private String padWithZeros(String string) {
        while (string.length() < requredHexLength) {
            string = "0" + string;
        }
        return string;
    }

}
