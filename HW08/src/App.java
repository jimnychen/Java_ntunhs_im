
public class App {
    public static void main(String[] args) throws Exception {
        charater mage01 = new Mage("mage", 100, 60);
        Warrior warrior01 = new Warrior("warrior", 100, 0);
        mage01.display();
        warrior01.useShield(110);
        mage01.attack(warrior01);
    }
}
