public abstract class charater{
    protected String name;
    protected int HP;
    protected int ATK;
    charater(String name,int health,int attackpower){
        this.name = name;
        this.HP = health;
        this.ATK = attackpower;
        
    }
    public String getName(){
        return this.name;
    }
    public int getHP(){
        return this.HP;
    }
    public int getATK(){
        return this.ATK;
    }
    public void attack(charater order){
        System.out.println(this.name+"攻擊了"+order.getName()+"造成了"+this.ATK+"點傷害");
        order.takeDemage(this);
        
    }
    public void takeDemage(charater order){
        HP -=order.getATK();
        System.out.println(name+"受到了來自"+order.getName()+"的"+order.getATK()+"點傷害");
        System.out.println(name+"的血量剩餘"+HP);
    }
    public abstract void display();
}

    
