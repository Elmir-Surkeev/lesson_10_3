import java.util.Random;



public class Main {
    public static void main(String[] args) {
        String[] coordinates = {"A", "B", "C", "D", "E", "F", "G", "H"};
        Random rnd = new Random();
        String position = String.valueOf(rnd.nextInt(8) + 1);
        int randomQueenX = rnd.nextInt((rnd.nextInt(12) + 1));

        ChessFigure peshka = new Peshka(coordinates[rnd.nextInt(8)], position, FigurePicture.P, FigureColor.WHITE);
        ChessFigure king = new King (coordinates[rnd.nextInt(8)], position, FigurePicture.K, FigureColor.WHITE, "King");
        Queen queen = new Queen(coordinates[rnd.nextInt(8)], position, FigurePicture.Q, FigureColor.BLACK, "Queen", randomQueenX);
        Ladia ladia = new Ladia(coordinates[rnd.nextInt(8)], position, FigurePicture.R, FigureColor.WHITE, "Rook", randomQueenX);

        peshka.figureDescription();
        peshka.figureCoordinates();
        peshka.figureMove();

        king.figureDescription();
        king.figureCoordinates();
        king.figureMove();

        queen.figureDescription();
        queen.figureCoordinates();
        queen.figureMove("Queen", randomQueenX);

        ladia.figureDescription();
        ladia.figureCoordinates();
        ladia.figureMove();
    }
}
