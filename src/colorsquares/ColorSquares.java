package colorsquares;

public class ColorSquares {

    private static InputData inputData = new InputData();
    private static SquareGenerator squareGenerator = new SquareGenerator();

    public static void main(String[] args) {

        inputData.loadData("Data2.txt");
        squareGenerator.setPalette(inputData.palette);
        squareGenerator.setSquares(inputData.squares);
        squareGenerator.generate("Output.htm");
    }

}
