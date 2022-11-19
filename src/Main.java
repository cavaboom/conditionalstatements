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
            System.out.println("Есть еще " + (seatPlaces - seatPlacesUsed) + " сидячих мест");
        }
        if (seatPlacesUsed == seatPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (standingPlacesUsed < standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces - standingPlacesUsed) + " стоячих мест");
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
        // Задача 5
        System.out.println("Задача 5");
        int yearsOld_v2 = 25;
        if (yearsOld_v2 >= 7 && yearsOld_v2 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (yearsOld_v2 >= 18 && yearsOld_v2 < 24) {
            System.out.println("Человек может отправлятся в университет");
        } else if (yearsOld_v2 >= 24) {
            System.out.println("Человек окончил университет и может искать работу");
        }
        // Задача 6
        System.out.println("Задача 6");
        int capacity_v2 = 102;
        int seatPlaces_v2 = 60;
        int standingPlaces_v2 = capacity - seatPlaces;
        int seatPlacesUsed_v2 = 25;
        int standingPlacesUsed_v2 = 36;
        if (seatPlacesUsed_v2 < seatPlaces_v2) {
            System.out.println("Есть еще " + (seatPlaces - seatPlacesUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingPlacesUsed_v2 < standingPlaces_v2) {
            System.out.println("Есть еще " + (standingPlaces - standingPlacesUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет");
        }
        // Задача 7
        System.out.println("Задача 7");
        int age_v3 = 25;
        /*
        boolean preSchool = age_v3 >= 2 && age_v3 <= 6;
        boolean school = age_v3 > 6 && age_v3 <= 18;
        boolean student = age_v3 > 18 && age_v3 <= 24;
        boolean adult = age_v3 > 24;
        if (preSchool) {
            System.out.println("Если возраст человека равен " +age_v3+ " то ему нужно ходить в детский сад");
        }
        else if (school) {
            System.out.println("Если возраст человека равен " +age_v3+ " то ему нужно ходить в школу");
        }
        else if (student) {
            System.out.println("Если возраст человека равен " +age_v3+ " то ему нужно ходить в университет");
        }
        else if (adult) {
            System.out.println("Если возраст человека равен " +age_v3+ " то ему нужно ходить на работу");
        }

         */
        if (age_v3 >= 2 && age_v3 <= 6) {
            System.out.println("Если возраст человека равен " + age_v3 + " то ему нужно ходить в детский сад");
        } else if (age_v3 > 6 && age_v3 <= 18) {
            System.out.println("Если возраст человека равен " + age_v3 + " то ему нужно ходить в школу");
        } else if (age_v3 > 18 && age_v3 <= 24) {
            System.out.println("Если возраст человека равен " + age_v3 + " то ему нужно ходить в университет");
        } else if (age_v3 > 24) {
            System.out.println("Если возраст человека равен " + age_v3 + " то ему нужно ходить на работу");
        }
        // Задача 8
        System.out.println("Задача 8");
        int ageOfTheChild = 15;
        if (ageOfTheChild < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else if (ageOfTheChild >= 14) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }
        // Задача 9
        System.out.println("Задача 9");
        int one = 3;
        int two = 1;
        int three = 2;
        if (one > two) {
            if (one >= three) {
                System.out.println("Большее число " + one);
            } else {
                System.out.println("Большее число " + three);
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Большее число " + two);
            } else {
                System.out.println("Большее число " + three);
            }
        }
    }
}