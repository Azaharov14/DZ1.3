import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int people = 18;
        System.out.println("Возраст совершеннолетия " + people + " лет");
        int age = 5;
        System.out.println("Если человеку " + age + " лет ");
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Нужно немного подождать");
        }


        int tempa = 20;
        if (tempa < 5) {
            System.out.println("На улице " + tempa + " градусов , нужно надеть шапку");
        } else {
            System.out.println("На улице " + tempa + " градусов , можно идти без шапки");
        }


        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }


        int earsPeople = 30;
        System.out.println("Человеку " + earsPeople + " лет");
        if (earsPeople >= 2 && earsPeople <= 6) {
            System.out.println("Если возраст человека равен " + earsPeople +
                    " , то ему нужно ходить в детский сад");
        } else {
            if (earsPeople >= 7 && earsPeople <= 17) {
                System.out.println("Если возраст человека равен " + earsPeople +
                        " , то ему нужно ходить в школу");
            } else {
                if (earsPeople >= 18 && earsPeople <= 24) {
                    System.out.println("Если возраст человека равен " + earsPeople +
                            " , то ему место в университете");
                } else {
                    if (earsPeople > 24) {
                        System.out.println("Если возраст человека равен " + earsPeople +
                                " , то ему пора ходить на работу");
                    }
                }
            }
        }


        int babyEars = 14;
        System.out.println(babyEars);
        if (babyEars < 5) {
            System.out.println("Если возраст ребенка равен " + babyEars + " , то ему нельзя кататься на аттракционе.");
        } else {
            if (babyEars >= 5 && babyEars < 14) {
                System.out.println("Если возраст ребенка равен " + babyEars + " , то ему можно кататься на аттракционе в сопровождении");
            } else {
                if (babyEars >= 14) {
                    System.out.println("Если возраст ребенка равен " + babyEars + " , то ему можно кататься на атракционе без сопровождения взрослого");
                }
            }
        }


        int carriageCapacity = 102;
        System.out.println("Всего мест " + carriageCapacity);
        int seatPlace = 60;
        System.out.println("Сидячих мест " + seatPlace);
        int numberOfPassengers = 102;
        boolean seatIsEmpty = numberOfPassengers <= seatPlace;
        boolean standingPlaceIsEmpty = numberOfPassengers > seatPlace && numberOfPassengers < carriageCapacity;
        if (seatIsEmpty) {
            System.out.println("В вагоне остались и сидячие и стоячие места");
        }
        if (standingPlaceIsEmpty) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }


        int one = 10;
        int two = 22;
        int three = 13;
        boolean greatsNumber = one > two && one > three;
        if (greatsNumber) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (one < three && two < three) {
            System.out.println(three);
        }
    }
}

