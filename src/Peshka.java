import java.util.Scanner;

public class Peshka extends StandartFigure{
    public Peshka(String nameOrPicture, String color, int[] coordinates){
        super(nameOrPicture, color, coordinates);
    }
    public void displayFigurePeshka(){
        for (int i = 0; i < coordinates.length; i++) {
            System.out.print(coordinates[i] + " ");
        }
        System.out.println("цвет фигуры: " + color + " название или же картинка " +nameOrPicture + " координаты находятся выше");

    }
    public void moveFigurePeshka(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы играете за пешку");
        System.out.println("Введите 1 для движения вверх");
        int userMove = scanner.nextInt();
        System.out.println("На сколько клеток вы хотите подвинуться макс 2 минимально 1");
        int userMoveDitantion = scanner.nextInt();
        //scanner.close();
        boolean isTrue = true;
        //типо с помощью индексами проверяем сможет ли ходить пешка или же уже перешли с половины поля
        if (userMoveDitantion < 2 && isTrue == true ){
            switch (userMove) {
                case 1:
                    coordinates[1]+=userMoveDitantion;
                    break;
                default:
                    System.out.println("Error!");
            }
        }else {
            System.out.println("Введите корекктные данные");
            moveFigurePeshka();
        }

    }
}
