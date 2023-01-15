package baseballgame;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import constant.ErrorString;

/**
 * run -> 전체 프로그램 실행을 담당.
 * playOneGame -> 한번의 게임을 실행
 * ckeckRestart -> 재시작 여부 확인
 * getStrike -> 스트라이크 개수 확인
 * getBall -> 볼 개수 확인
 */
public class Game {
	List<Integer> answer = new ArrayList<>();

	public Game(){
		while(answer.size() < 3){
			int randomNumber = Randoms.pickNumberInRange(0, 9);
			if(!answer.contains(randomNumber)){
				answer.add(randomNumber);
			}
		}

		for (Integer integer : answer) {
			System.out.println(integer.toString());
		}
	}

	public static void run(){
		//엔트리 포인트
		Game game;
		do{
			game = new Game();
			game.playGameOnce();
		}while(game.restart() == false);
	}

	private void playGameOnce(){
		//한번의 게임을 실행
	}
	private boolean restart(){
		String inputString = Console.readLine();
		if(inputString.equals("1")){
			return true;
		}else if(inputString.equals("2")){
			return false;
		}else{
			throw new IllegalArgumentException("[Game.restart()]:"+ErrorString.wrongInput);
		}
	}
}
