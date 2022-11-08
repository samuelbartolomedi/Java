package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage = other.attack - armor;
        if (damage > 0) {
            life = life - damage;
        } else {
            life = life - 1;
        }
        if (life < 0){
            life = 0;
        } else {
            life = life;
        }
    }

    public String status() {
        if (life > 0) {
            return name + ": " +
                    life + " de vida";
        } else {
            return name + ": " +
                    life + " de vida (morreu)";
        }
    }
}
