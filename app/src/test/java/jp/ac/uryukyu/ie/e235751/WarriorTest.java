package jp.ac.uryukyu.ie.e235751;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int attack = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, attack);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        int weponSkillAttack = (int) (attack * 1.5);
        int nowEnemyHp;
        for (int i = 0; i < 3; i++) {
            nowEnemyHp = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(nowEnemyHp - weponSkillAttack, slime.getHitPoint());
            System.out.printf("nowEnemyHp - weponSkillAttack = %s , slime.getHitPoint() = %s\n",
                    nowEnemyHp - weponSkillAttack, slime.getHitPoint());
        }
    }
}
