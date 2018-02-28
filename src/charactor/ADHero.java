package charactor;

public class ADHero extends Person {
    public static void battlewin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String [] args){
        Person.battlewin();
        ADHero.battlewin();

        Person person=new ADHero();
        person.battlewin();
    }
}
