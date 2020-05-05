package team_rpg;
//근데 사용자가 공격을 
import java.util.Scanner;

public abstract class Battle {
	
	Scanner bt = new Scanner(System.in);
//플레이어 몬스터 모두 불러온다.
	Player p;
	Monster m;
	Dungeon dg;
	int turns;
	boolean pass;
	int pdmg;
	int mdmg;
	int wns;
	
//던전을 불러온다.
	dg.stage();
	
//체력을 비교하여 턴체크를 한다.
	public boolean moveFirst() {
		return Player.CurrentHealth> Monster.CurrentHealth;
	}
	public void TurnCheck(Player p, Monster m) {
		//턴을 정해주는 변수
		turns =1;
		
		//몬스터와 플레이어의 체력을 비교하여 누가 먼저할지 결정
		if(moveFirst()) {
			playerTurn();
		}else {
			monsterturn();
			turns = 2;
		}
	}
	
	
//공격을 정의한다.
	void playerAttack() {
		pdmg =(int) ((((int)(Math.random()*Monster.attackPower())+5)*Monster.weakness())-Player.attackPower());
       
        Monster.CurrentHealth(Monster.CurrentHealth() - pdmg);
        System.out.println(pdmg + " 만큼 가격! 몬스터의 체력은:" + Monster.CurrentHealth());
        pass = true;
    }
	
	void monsterAttack() {
	mdmg =(int) ((((int)(Math.random()*Player.attackPower())+5)*Monster.weakness)-Player.attackPower());
    
    Player.CurrentHealth(Player.CurrentHealth - mdmg);
    System.out.println(mdmg + " 만큼 가격! " +Player.name+"님의 체력은:" + Player.CurrentHealth());
    pass = true;
	}
	
//서로 턴을 주고 받는다.
	void PlayerTurn() { 
       
		//플레이어턴
		System.out.println(Player.name() + " - " + "HP: " + Player.CurrentHealth() + "/" + Player.MaxHealth());
        System.out.println(Monster.name() + " - " + "HP: " + Monster.CurrentHealth());
	}
	
	void MonsterTurn() {
		
        //몬스터턴
        System.out.println(Monster.name() + "의 공격!!!");
        //monster.getSkills(); blah stuff
        System.out.println("화가난" + Monster.name() + "!!!!");
        
	}
      
//회피를 정의 한다.???근데.... 몬스터가 먼저때리고 그데미지에서 빼서 회피하는게 맞죠??
	void playerWeakness() {
		wns = mdmg-(Math.random()*Monster.attackPower());
		Player.CurrentHealth(Player.CurrentHealth - wns);  
        System.out.println(wns + " 만큼 회피!:" + Player.CurrentHealth());
        pass = true;
	}


//사용자의 입력에 따른 공격
	void choicePlayerMovement() {
		System.out.println("Battle Start!!!");
		System.out.println("1.공격 2.회피");
		int choice = Integer.parseInt(bt.nextLine());
		
		switch(choice) {
		case 1:
			PlayerTurn();
			playerAttack();
			MonsterTurn();
			monsterAttack();
			break;
		case 2:
			PlayerTurn();
			playerAttack();
			playerWeakness();
			break;
		}
		  if(Player.CurrentHealth<=0) {
	        	System.out.println("죽었습니다.");
	        	break;
	        }else if(Monster.CurrentHealth()<=0) {
	        	System.out.println("승리하셨습니다.");
	        	//리워드호출
	        	break;
	        }
}
}
//choicePlayerMovement
//choiceMonsterMovement
//battleResult