public class Dolphin extends Animal implements Swim{
        private int swimmingSpeed;
        private String color;

        public Dolphin (){
            super("Dolphin");
            this.swimmingSpeed = swimmingSpeed;
            this.color = color;
        }

        public int getSwimmingSpeed() {
            return swimmingSpeed;
        }

        public void setSwimmingSpeed(int swimmingSpeed) {
            this.swimmingSpeed = swimmingSpeed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    @Override
    public void eatingFood() {
        System.out.println(getNameOfAnimal() + ": I am eating delicious fish");
    }

    public void eatingCompleted(){
            System.out.println("I have eaten fish");
        }
    public void swimming(){
            System.out.println(getNameOfAnimal() + ": I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }




}
