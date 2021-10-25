package rpgcreature;

import java.util.Random;
/**
 * モンスターのスーパークラス
 */
public abstract class Golem extends Creature{
    protected boolean escapeFlag = false;

    /**
     * モンスタークラスのコンストラクタ
     * @param name　名前
     * @param hp　モンスターの体力
     */
    public Golem(String name,int hp){
        super("ゴーレム",100);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        Random r = new Random();
        int damage = 0;
        if( r.nextInt(100) < 5){
            System.out.printf("%sは魔法を唱えた！\n",getName());
            damage = r.nextInt(10)+5;
        }else{
            System.out.printf("%sの攻撃！\n",getName());
            damage = r.nextInt(5)+1;
        }
        opponent.damaged(damage);
        
        displayMessage(opponent,damage);
        
    }
}
