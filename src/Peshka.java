import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Peshka extends ChessFigure {
    public Peshka(String coordinate, String position, FigurePicture figurePicture, FigureColor figureColor) {
        super(coordinate, position, figurePicture, figureColor);
    }

    @Override
    void figureMove() {
        System.out.println("Это пешка");
    }
}
