package charactor2;

public class Hero {

    public String name;
    protected float hp;

    float armor;
    int moveSpeed;

    class BattleScore{
        int kill;
        int die;
        int assit;

        public void legendary(){
            if(kill>=8){
                System.out.println(name+"超神！");
            }
            else {
                System.out.println(name+"尚未超神！");
            }
        }
    }

    public boolean equals(Object object){
        if(object instanceof Hero){
            Hero hero = (Hero)object;
            return this.hp == hero.hp;
        }
        return false;
    }

    public String toString(){
        return name;
    }

    public void finalize(){
        System.out.println("这个英雄正在被回收");
    }

    public static void main(String [] args){

        Hero garen = new Hero();
        garen.name = "盖伦";

        BattleScore score = garen.new BattleScore();
        score.kill=9;
        score.legendary();
//        //只有一个引用
//        Hero hero;
//        /**
//         * 不断生成新的对象
//         * 每创建一个对象，前一个对象就没有引用指向了
//         * 那些对象就满足垃圾回收的条件
//         * 当垃圾堆积得比较多的时候，就会触发垃圾回收
//         * 一旦这个对象被回收的时候，就会调用finalize方法。
//         */
//        for (int i=0;i<1000000;++i){
//           hero = new Hero();
//        }
    }

}
