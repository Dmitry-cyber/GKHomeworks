package homeworksix;

import java.util.Random;

public class DogandCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Pushok");

        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Sharik");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

        System.out.println();

        cat1.run(1700);
        cat1.swim(5);
        cat1.jump(1.7);
    }

    public static class Animals {//super class
        protected String name;
        protected String type;
        protected int maxRun;
        protected int maxSwim;
        protected double maxJump;
        public Random random = new Random();

        public Animals(String name){
            this.name = name; // при создании объекта нужно ввести имя
        }

        public void run(int dist) { // выводит инфо об объекте относительно действия
            if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't run so far.");
        }

        public void swim(int dist) {// выводит инфо об объекте относительно действия
            if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't swim so far.");
        }

        public void jump(double height) {// выводит инфо об объекте относительно действия
            if (this.maxJump >= height)
                System.out.println(this.type + " " + this.name + " jump " + height + " m.");
            else System.out.println(this.type + " " + this.name + " can't jump so hi.");
        }

        public void info() { // выводит сведения об объекте в разрезе дейсвтий
            System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + " m., Jump: " + this.maxJump + " m.");
        }
    }

    public static class Cat extends Animals {//наследующий класс
        public Cat(String name) {
            super(name);// наследуюемый признак
            this.maxJump = 2.0;
            this.maxRun = random.nextInt(45) + 155;
            this.type = "Cat";
        }

        @Override
        public void swim(int dist) {
            System.out.println("Cat's no swim!");
        }
    }

    public static class Dog extends Animals {//наследующий класс
        public Dog(String name) {
            super(name);
            this.type = "Dog";
            this.maxRun = random.nextInt(300) + 300;
            this.maxSwim = random.nextInt(6) + 5;
            this.maxJump = Math.random() * 0.7 + 0.1;
        }
    }
}
