package lesson1;

public class Main {
    public static void main(String[] args){
        Cat cat1;
        cat1 = new Cat();
        //System.out.println("Имя кота: " + cat1.name);
        //System.out.println("Возраст кота: " + cat1.age);
        //Cat cat2 = cat1;
        //cat2.name = "Moris";
        //System.out.println("Имя кота: " + cat1.name);
        //cat1.setAge(5);
        //cat1.setColor("Белый");
        //cat1.setName("Мурзик");
        //System.out.println("Возраст кота 1: " + cat1.getAge());
        //System.out.println("Цвет кота 1: " + cat1.getColor());
        //System.out.println("Имя кота 1: " + cat1.getName());
        //Cat cat2 = new Cat("Барсик", 1, "Черный");
        //System.out.println("Возраст кота 2: " + cat2.getAge());
        //System.out.println("Цвет кота 2: " + cat2.getColor());
        //System.out.println("Имя кота 2: " + cat2.getName());
        //Cat cat3 = new Cat();
        //cat3.setColor("Серый").setAge(5).setName("Мурка");
        //Cat cat2 = new Cat();
        //cat2.setName("Cat");
        //System.out.println();
        //Wolf wolf = new Wolf();
        //wolf.setAge(4);
//
        //Util.makeAnimalOlder(wolf);
        //System.out.println("Возраст волка = " + wolf.getAge());
        //final String str = "adsfsadfdf";

        Wolf wolf = new Wolf();
        Animal cat = new Cat();
        ((Cat)cat).jump();
        ((Cat)cat).setName("М");
        cat.voice();
    }
}
