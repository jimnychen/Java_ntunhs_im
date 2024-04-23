public class Mage extends charater{
    private int MP;
    Mage(String name, int health, int attackpower) {
        super(name, health, attackpower);
    }
    public int getMP() {
        return MP;
    }
    @Override
    public void display(){
        System.out.println("法師名稱："+name);
        System.out.println("攻擊力："+ATK);
        System.out.println("血量"+HP);
        System.out.println("法力："+MP);
    }
    public void useMagic(int MATK){
        MP-=MATK;
        if(MP<MATK);
    }
}
