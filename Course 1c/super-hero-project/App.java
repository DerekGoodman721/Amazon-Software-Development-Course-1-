public class App {
    public static void main(String[] args) {
        Hero fireFist = new Hero();
        fireFist.name ="Fire Fist";
        System.out.println("name of the hero " + fireFist.name);
        
        int punchDamage = fireFist.calculatePunchDamage();
        System.out.println("Ouch, your punch caused " + punchDamage + "% damage");

        Hero frostBlizzard = new Hero();
        frostBlizzard.name = "Frost Blizzard";
        frostBlizzard.strength = 35;
        System.out.println("name of the hero " + frostBlizzard.name);

        int specialAttackDamage = frostBlizzard.calculateSpecialAttackDamage("Ice Blast");
        System.out.println("Ouch, Your Ice Blast Hurts For " + specialAttackDamage + "% damage");
    }
}
