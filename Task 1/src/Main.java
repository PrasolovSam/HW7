import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ингредиент Жабьи глаза");
        int toadEyesCount = new Scanner(System.in).nextInt();          //Жабьи глаза
        System.out.println("Введите ингредиент Слезы вурдалака");
        int ghoulTearsCount = new Scanner(System.in).nextInt();        //Слезы вурдалака
        System.out.println("Введите ингредиент Кости ворона");
        int ravenBonesCount = new Scanner(System.in).nextInt();       //Кости ворона
        System.out.println("Введите ингредиент Пельмени");
        int dumplingsCount = new Scanner(System.in).nextInt();         //Пельмени(а почему, собственно нет? xD )

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить Эликсир зоркости");
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4){
            System.out.println("Вы можете приготовить Эликсир стойкости");
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("Вы можете приготовить эликсир скрытности");
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("Вы можете приготовить запретный эликсир");
        }
    }
}
