package lesson1;

public class Cat extends Animal implements CanSwim, CanRun {

    private boolean isWild;

    public Cat() {
    }

    @Override
    public void voice(){
        System.out.println("Кот мяукает");
    }

    public void jump(){
        System.out.println("Кот прыгает");
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
        this.isWild = false;
    }

    public boolean getIsWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public void swim() {
        System.out.println("Кот плывет!");
    }

    @Override
    public void run() {
        System.out.println("Кот бегать!");
    }
}
