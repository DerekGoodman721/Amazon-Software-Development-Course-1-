public class Tiger extends Animal implements Walk{
    private int numberOfStripes;
    private int speed;
    private String soundLevel;

    public Tiger (){
        super("Tiger");
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevel;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(String soundLevel) {
        this.soundLevel = soundLevel;
    }

    @Override
    public void eatingCompleted(){
        System.out.println(getNameOfAnimal() +": I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + speed + " mph");
    }
}
