public class Penguin extends Animal{
    private boolean isSwimming;
    private int walkSpeed;
    private int swimSpeed;

    public Penguin (){
        super("Penguin");
        this.isSwimming = isSwimming;
        this.walkSpeed = walkSpeed;
        this.swimSpeed = swimSpeed;
    }
    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed){
        this.swimSpeed = swimSpeed;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed){
        this.walkSpeed = walkSpeed;
    }

    public boolean getIsSwimming(){
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming){
        this.isSwimming = isSwimming;
    }

    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ": I am eating delicious fish");
    }

    public void eatingCompleted(){
        System.out.println(getNameOfAnimal() + ": I have eaten fish");
    }
    public void swimming(){
        System.out.println(getNameOfAnimal() + ": I am swimming at the speed of " + swimSpeed + " nautical miles per hour");
    }
    public void walking() {
        System.out.println(getNameOfAnimal() + ": I am walking at the speed " + walkSpeed + " mph");
    }


}
