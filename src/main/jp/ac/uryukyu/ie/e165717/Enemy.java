package jp.ac.uryukyu.ie.e165717;

public class Enemy extends LivingThing {
    public Enemy(  String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("大魔王%sは倒れた。\n", name);
        }
    }

}