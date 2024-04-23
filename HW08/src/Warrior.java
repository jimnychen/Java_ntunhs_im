public class Warrior extends charater{
    private int DEF = 0;
    Warrior(String name, int health, int attackpower) {
        super(name, health, attackpower);
    }
    @Override
    public void display(){
        System.out.println("戰士名稱："+name);
        System.out.println("攻擊力："+ATK);
        System.out.println("血量"+HP);
        System.out.println("防禦力："+DEF);
    }
    @Override
    public void attack(charater order){
        order.takeDemage(this);
        System.out.println(this.name+"攻擊了"+order.getName()+"造成了"+this.ATK+"點傷害");
    }
    @Override
    public void takeDemage(charater order){
        HP -=Math.max(DEF-=order.getATK(),0);
        System.out.println(this.getName()+"受到了來自"+order.getName()+"的"+order.getATK()+"點傷害");
        System.out.println(name+"的血量剩餘"+HP+",防禦力剩餘"+DEF);
    }
    public int getDEF() {
        return DEF;
    }
    public void useShield(int ShieldRank){
        DEF +=ShieldRank;
    }
}
