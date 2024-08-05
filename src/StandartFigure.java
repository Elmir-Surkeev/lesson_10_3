import java.util.Scanner;
public class StandartFigure {
    String nameOrPicture;
    String color = "black";
    int[] coordinates;
    public StandartFigure(String nameOrPicture, String color, int[] coordinates){
        this.nameOrPicture = nameOrPicture;
        this.color = color;
        this.coordinates = coordinates;
    }
    public void displayFigure(){
        for (int i = 0; i < coordinates.length; i++) {
            System.out.print(coordinates[i] + " ");
        }
        System.out.println("цвет фигуры: " + color + " название или же картинка " +nameOrPicture + " координаты находятся выше");

    }
    public void moveFigure(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 для движения вверх, 2 для движения вниз, 3 чтобы повернуть вправо и 4 для поворота налево");
        int userMove = scanner.nextInt();
        switch (userMove) {
            case 1:
                coordinates[1]++;
                break;
            case 2:
                coordinates[1]--;
                break;
            case 3:
                coordinates[0]++;
                break;
            case 4:
                coordinates[0]--;
                break;
            default:
                System.out.println("Error!");
                return;
        }
        scanner.close();
        displayFigure();
    }
}
