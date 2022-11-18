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
        // Задача 3
        System.out.println("Задача 3");
        int capacity = 102;
        int seatPlaces = 60;
        int standingPlaces = capacity - seatPlaces;
        /*
        if (capacity >= 102) {
            System.out.println("В вагоне мест нет");
        }
        if (capacity < 102) {
            System.out.println("Есть свободные места");
        }
        if (seatPlaces >= 60) {
            System.out.println("Сидячих мест нет");
        }
        if (seatPlaces < 60) {
            System.out.println("Есть свободные сидячие места");
        }
        if (standingPlaces >= standingPlaces) {
            System.out.println("Стоячих мест нет");
        }
        if (standingPlaces < standingPlaces) {
            System.out.println("Сточих мест нет");
        }
        */
        int seatPlacesUsed = 25;
        int standingPlacesUsed = 37;
        if (seatPlacesUsed < seatPlaces) {
            System.out.println("Есть еще " +(seatPlaces - seatPlacesUsed)+ " сидячих мест");
        }
        if (seatPlacesUsed == seatPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (standingPlacesUsed < standingPlaces) {
            System.out.println("Есть еще " +(standingPlaces - standingPlacesUsed)+ " стоячих мест");
        }
        if (standingPlacesUsed == standingPlaces) {
            System.out.println("Стоячих мест нет");
        }
        // Задача 4
        System.out.println("Задача 4");
        int age_v2 = 17;
        if (age_v2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Вы еще не совершеннолетний");
        }
}