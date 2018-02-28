package com.how2java.pojo.charactor;

public class Hero implements Comparable<Hero>{
    public String name;
    public float hp;

    public int damage;

    public Hero(){}
    public Hero(String name){
        this.name = name;
    }
    public Hero(String name , float hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public void recover(){
        hp++;
    }

    public void hurt(){
        synchronized (this){
            --hp;
        }
    }

    public void attackHero(Hero hero){
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        hero.hp-=damage;
        System.out.format("%s 正在攻击 %s,%s的血变成了 %.0f%n",name,hero.name,hero.name,hero.hp);
        if (hero.isDead()){
            System.out.println(hero.name+"死了!");
        }
    }

    public boolean isDead(){
        return 0>=hp?true:false;
    }

    @Override
    public int compareTo(Hero anotherHero) {
        if (damage < anotherHero.damage){
            return 1;
        }
        else {
            return -1;
        }
    }

    public String toString(){
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
