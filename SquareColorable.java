package Colorable;

public class SquareColorable extends Square implements  Colorable {
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
