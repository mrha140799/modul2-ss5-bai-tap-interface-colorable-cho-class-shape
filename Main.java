package Colorable;

public class Main  {
    public static void main(String[] args) {
       SquareColorable square[] = new SquareColorable[1];
       for (SquareColorable s : square) {
           s = new SquareColorable();
           s.setSide(10);
           s.howToColor();
       }

    }
}
