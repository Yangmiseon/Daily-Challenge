package team_rpg;

import java.util.Scanner;

public abstract class Battle1 {
	
	Scanner bt = new Scanner(System.in);
	//플레이어 몬스터 모두 불러온다.
	Player p;
	Monster m;
	Dungeon dg;
	int turns;
	boolean pass;
	
	//던전을 불러온다.
	Dungeon.stage();
	
	//체력을 비교하여 턴체크를 한다.
	public boolean moveFirst() {
		return Player.CurrentHealth> Monster.CurrentHealth;
	}
	
	
	public boolean TurnCheck(Player p, Monster m) {
		//턴을 정해주는 변수
		turns =1;
		
		//몬스터와 플레이어의 체력을 비교하여 누가 먼저할지 결정
		if(moveFirst()) {
			playerTurn(turns);
		}else {
			monsterTurn(turns);
			turns = 2;
		}
			//반복하여 비교해서 계속 턴을 반복함
			while (Player.CurrentHealth>0 && Monster.CurrentHealth>0) {
				if(turns%2 ==1) {
				monsterTurn(turns);
			}else {
				playerTurn(turns);
				turns++;
			}
		}
	}
	
	


//공격을 정의한다.
private void playerTurn(int pdmg) {
		pdmg =(int) (((((int)Math.random()*Monster.attackPower())+5)*Monster.weakness)-Player.attackPower());
       
        Monster.CurrentHealth(Monster.CurrentHealth() - pdmg);
        System.out.println(pdmg + " 만큼 가격! 몬스터의 체력은:" + Monster.CurrentHealth());
        pass = true;
    }
	
private void monsterTurn(int mdmg) {
		mdmg =(int) ((((int)(Math.random()*Player.attackPower())+5)*Monster.weakness)-Player.attackPower());
       
        Monster.CurrentHealth(Player.CurrentHealth - mdmg);
        System.out.println(mdmg + " 만큼 가격! " +Player.name+"님의 체력은:" + Player.CurrentHealth());
        pass = true;
    }
	
//서로 턴을 주고 받는다.
	void Turn() { //formatting?
       
		while(TurnCheck(p, m)) {
	
		if() {//플레이어턴이라면
			playerTurn(turns);
		
		System.out.println(Player.name + " - " + "HP: " + Player.CurrentHealth() + "/" + Player.MaxHealth());
        System.out.println(Monster.name + " - " + "HP: " + Monster.CurrentHealth());
        
		}else if() {//몬스터턴이라면
			monsterTurn(turns);
        System.out.println(Monster.name + "'s turn!");
        //monster.getSkills(); blah stuff
        System.out.println("The " + Monster.name + " looks displeased.");
        
	}
        //플레이어의 승리시와 패배시
		if(Player.CurrentHealth<=0) {
        	System.out.println("죽었습니다.");
        	//현재 레벨과 체력 호출
        	break;
        }else if(Monster.CurrentHealth()<=0) {
        	System.out.println("승리하셨습니다.");
        	//리워드호출
        	break;
        }
		}
	
}
}