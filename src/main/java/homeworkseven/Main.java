package homeworkseven;

public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Бальтазар", 150);
        cat[1] = new Cat("Рокси", 100);
        cat[2] = new Cat("Баллу", 300);
        Plate plate = new Plate(400);
        System.out.println("Привет! У Вас есть три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName());
        System.out.println("Кто-то из них более прожорлив, кто-то менее. Сейчас в миске " + plate.getFood() + " грамм кошачьего корма. Посмотрим насколько его хватит, в данный момент коты очень голодны и направляются трапезничать.\n");


            for (Cat i : cat) {


                if (i.getSatiety() == 0) {


                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }


                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("В миске осталось " + plate.getFood() + " граммов корма.\n");
        }
    }

