package lab3;


/*1613665 박세연 영어영문학과
 * 21-06-24
 *Dice 클래스를 작성하고 주사위를 굴려 목표에 도달할 때까지의 굴림 횟수를 세는 프로그램입니다.*/

class Dice                      //주사위 클래스 작성
{
	private int value;
	
	public Dice()            //생성자 작성
	{
		value = 0;
	}
	
	void roll()                 //주사위를 굴려서 난수를 생성하는 메소드
	{
		this.value = (int)(Math.random() * 6 + 1);
	}
	
	int getValue()         //private 필드인 value에 대한 접근자 메소드
	{
		return value;
	}
}

public class DiceTest 
{
	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();                  //주사위 객체 2개 생성
		Dice dice2 = new Dice();
		
		int count = 0;                                    //횟수를 기록할 필드
		
		do
		{
			dice1.roll();                                    //주사위 2개를 굴려 난수 생성
			dice2.roll();
			
			System.out.println("주사위1= " + dice1.getValue() + " 주사위2= " + dice2.getValue());
			//굴려서 나온 값 출력	
			count++;       //실행 횟수 증가
		} while((dice1.getValue() + dice2.getValue()) != 2);     //두 주사위 눈의 값을 합해서 2일때 종료
		
		System.out.println("(1,1)이 나오는데 걸린 횟수 = " + count);
		//종료 조건에 도달하기까지 시도한 횟수 출력
	}
}