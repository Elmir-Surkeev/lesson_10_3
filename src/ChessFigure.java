
class ChessFigure {
    private String x;
    private String y;
    private FigurePicture picture;
    private FigureColor color;

    public String getX() {
        return x;
    }

    public ChessFigure(String x, String y, FigurePicture picture, FigureColor color) {
        this.x = x;
        this.y = y;
        this.picture = picture;
        this.color = color;
    }

    public void figureDescription() {
        System.out.println("Фигура: " + picture + ", Цвет: " + color);
    }

    public void figureCoordinates() {
        System.out.println("Координаты: " + x + y);
    }

    public void figureMove(String newY) {
        this.y = newY;
        System.out.println("Фигура перемещена на координаты: " + x + y);
    }
}