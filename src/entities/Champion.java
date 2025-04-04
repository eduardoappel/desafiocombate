package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion() {}
    
    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }   
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public void attack(Champion opponent) {
        int damage = this.attack - opponent.getArmor();
        if (damage > 0) {
            opponent.setLife(opponent.getLife() - damage);
        }
    }

    public String status() {
        if (this.life <= 0) {
            return this.name + " morreu";
        } else {
            return this.name + " com vida: " + this.life;
        }
    }
}
