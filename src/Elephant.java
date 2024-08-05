import java.util.Scanner;

public class Elephant extends StandartFigure{
    public Elephant(String nameOrPicture, String color, int[] coordinates){
        super(nameOrPicture, color, coordinates);
    }
//    public void chekingPossibleMove(){
//        boolean isTrue = true;
//        //типо с помощью индексами проверяем сможет ли ходить слоник
//    }
public void displayFigureElephant(){
    for (int i = 0; i < coordinates.length; i++) {
        System.out.print(coordinates[i] + " ");
    }
    System.out.println("цвет фигуры: " + color + " название или же картинка " +nameOrPicture + " координаты находятся выше");

}
    public void moveFigureElephant(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы играете за " + nameOrPicture);
        System.out.println("Введите 1 для движения вверх, 2 для движения вниз, 3 чтобы повернуть вправо и 4 для поворота налево");
        int userMove = scanner.nextInt();
        System.out.println("На сколько клеток вы хотите подвинуться макс 8 минимально 1");
        int userMoveDitantion = scanner.nextInt();
        scanner.close();
        boolean isTrue = true;
        //типо с помощью индексами проверяем сможет ли ходить слоник
        if (userMoveDitantion < 8 && isTrue == true ){
            switch (userMove) {
                case 1:
                    coordinates[1]+=userMoveDitantion;
                    break;
                case 2:
                    coordinates[1]-=userMoveDitantion;
                    break;
                case 3:
                    coordinates[0]+=userMoveDitantion;
                    break;
                case 4:
                    coordinates[0]-=userMoveDitantion;
                    break;
                default:
                    System.out.println("Error!");
            }
        }else {
            moveFigureElephant();
        }

    }

}
