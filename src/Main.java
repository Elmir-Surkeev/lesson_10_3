import java.util.Random;



public class Main {
    public static void main(String[] args) {
        String[] coordinates = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Random rnd = new Random();
        String position = String.valueOf(rnd.nextInt(8) + 1);
        int randomQueenX = rnd.nextInt((rnd.nextInt(12) + 1));

        ChessFigure ladia = new ChessFigure(coordinates[rnd.nextInt(8)], position, FigurePicture.K, FigureColor.WHITE);
        King king = new King (coordinates[rnd.nextInt(8)], position, FigurePicture.K, FigureColor.WHITE, "King");
        Queen queen = new Queen(coordinates[rnd.nextInt(8)], position, FigurePicture.K, FigureColor.WHITE, "Queen", randomQueenX);

        king.figureDescription();
        king.figureCoordinates();
        king.figureMove(String.valueOf(rnd.nextInt(8) + 1));

        queen.figureDescription();
        queen.figureCoordinates();
        queen.figureMove("Queen", randomQueenX);

        ladia.figureDescription();
        ladia.figureCoordinates();
        ladia.figureMove(String.valueOf(rnd.nextInt(8) + 1));
    }
}
