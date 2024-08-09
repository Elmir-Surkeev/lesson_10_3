class King extends ChessFigure{
    private String nameFigure;
    public King(String y, String x, FigurePicture picture,FigureColor color,  String nameFigure){
        super(x, y, picture, color);
        this.nameFigure = nameFigure;

    }
    public void figureMove(String newY){
        System.out.println("Фигура "+ nameFigure+"перемещена на координаты: " + getX() + newY);
    }
}
