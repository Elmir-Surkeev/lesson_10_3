class Ladia extends ChessFigure{
    int randomQueenX;
    public Ladia(String y, String x, FigurePicture picture,FigureColor color,  String nameFigure, int randomQueenX){
        super(x, y, picture, color);
        this.randomQueenX = randomQueenX;

    }
    void figureMove(){
        System.out.println("Фигура перемещена на координаты: " + randomQueenX);
    }
}
