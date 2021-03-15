package lesson1.game1;

public class Cat extends Animal implements CanRun, CanSwim {

    public Cat(String name, int maxSpeed, int swimSpeed) {
        super(name, maxSpeed, swimSpeed, 1);
    }

    @Override
    public double run(int length, int height) {
        if (height > 100) {
            super.setHeightKoeff(0.9);
        }
        else {
            super.setHeightKoeff(1);
        }
        return (super.getMaxSpeed() * super.getHeightKoeff()) * length;
    }

    @Override
    public double swim(int length) {
        return super.getSwimSpeed() * length;
    }
}
