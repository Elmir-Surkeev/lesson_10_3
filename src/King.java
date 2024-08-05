public class King extends StandartFigure{
    public King(String nameOrPicture, String color, int[] coordinates){
        super(nameOrPicture, color, coordinates);
    }
    public void displayFigureKing(){
        for (int i = 0; i < coordinates.length; i++) {
            System.out.print(coordinates[i] + " ");
        }
        System.out.println("цвет фигуры: " + color + " название или же картинка " +nameOrPicture + " координаты находятся выше");

    }
}
