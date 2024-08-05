import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        King king = new King("King", "white", new int[]{3, 4});
        Elephant elephant = new Elephant("Elephant", "white", new int[]{2, 1});
        Elephant ladia = new Elephant("Ladia", "white", new int[]{1, 1});
        Peshka peshka = new Peshka("Peshka", "black", new int[]{4, 2});
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("За кого вы хотите играть");
            System.out.println("1 пешка, 2 слоник, 3 король, 4 ладья");
            int choiceUser = scanner.nextInt();
            switch (choiceUser){
                case 1:
                    peshka.displayFigurePeshka();
                    peshka.moveFigurePeshka();
                    peshka.displayFigurePeshka();
                    break;
                case 2:
                    elephant.displayFigureElephant();
                    elephant.moveFigureElephant();
                    elephant.displayFigureElephant();
                    break;
                case 3:
                    king.displayFigure();
                    king.moveFigure();
                    king.displayFigure();
                    break;
                case 4:
                    ladia.displayFigureElephant();
                    ladia.moveFigureElephant();
                    ladia.displayFigureElephant();
                    break;
                default:
                    System.out.println("Пожалуйста введите только выше приведенные числа");
            }
        }catch (Exception e){
            System.out.println("Ошибка ввода! Пожалуйста, введите корректное число.");
            scanner.next();

        }
        scanner.close();

    }
}