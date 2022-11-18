public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Вы еще не совершеннолетний");
        }
        // Задача 2
        System.out.println("Задача 2");
        int yearsOld = 25;
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (yearsOld >= 18 && yearsOld < 24) {
            System.out.println("Человек может отправлятся в университет");
        }
        if (yearsOld >= 24) {
            System.out.println("Человек окончил университет и может искать работу");
        }
    }
}