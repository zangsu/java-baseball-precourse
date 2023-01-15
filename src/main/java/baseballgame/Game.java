package baseballgame;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

/**
 * run -> 전체 프로그램 실행을 담당.
 * playOneGame -> 한번의 게임을 실행
 * ckeckRestart -> 재시작 여부 확인
 * getStrike -> 스트라이크 개수 확인
 * getBall -> 볼 개수 확인
 */
public class Game {

	public Game(){
		//게임 시작 전 필요한 초기화를 실행
	}

	public static void run(){
		//엔트리 포인트
		Game game;
		do{
			game = new Game();
			game.playGameOnce();
		}while(game.restart() == true);
	}

	private void playGameOnce(){
		//한번의 게임을 실행
	}
	private boolean restart(){
		//사용자에게 입력을 받고 재시작 여부를 boolean값으로 반환
		return true;
	}
}
