class Ladia extends King{
    int randomQueenX;
    public Ladia(String y, String x, FigurePicture picture,FigureColor color,  String nameFigure, int randomQueenX){
        super(x, y, picture, color, nameFigure);
        this.randomQueenX = randomQueenX;

    }
    public void figureMove(String nameFigure, int randomQueenX){
        System.out.println("Фигура "+ nameFigure+"перемещена на координаты: " + randomQueenX);
    }
}
