package Patika101.D46PatikaDevJava101Odev37BoksMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;          //    Dodge, hasarı savuşturma yüzdesidir.
    int critChance;     //    Critical Chance, kritik hasar vurma yüzdesidir.
    int critDamage;     //    Critical Damage, hasarın artış yüzdesidir.

    Fighter(String name, int damage, int health, int weight, int dodge, int critChance, int critDamage) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge <= 100 && dodge >= 0) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        if (critChance <= 100 && critChance >= 0) {
            this.critChance = critChance;
        } else {
            this.critChance = 0;
        }
        this.critDamage = critDamage;
    }

    int hit(Fighter opponent) {
        int tempDamage = this.damage;
        if (isCrit()) {
            tempDamage = tempDamage + tempDamage * this.critDamage / 100;
            System.out.println("__ulti__");
        }
        System.out.println(this.name + " => " + opponent.name + " " + tempDamage + " hasar vurdu.");
        if (opponent.isDodge()) {
            System.out.println(opponent.name + " gelen hasari savusturdu.");
            return opponent.health;
        }
        if ((opponent.health - tempDamage) <= 0) {
            return 0;
        }
        return opponent.health - tempDamage;
    }

    boolean isDodge() {
        double dodgeChange = Math.random() * 100;
        return this.dodge >= dodgeChange;
    }

    boolean isCrit() {
        double critChange = Math.random() * 100;
        return this.critChance >= critChange;
    }

}
