package task2;

public class GoodPupil extends Pupil {

    public GoodPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName() + " good study ");
    }

    @Override
    public void read() {
        System.out.println(getName() + " good read ");
    }

    @Override
    public void write() {
        System.out.println(getName() + " good write ");
    }

    @Override
    public void relax() {
        System.out.println(getName() + " sometimes relax");
    }
}
