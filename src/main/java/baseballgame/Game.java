package baseballgame;

import static constant.Constant.*;
import static constant.StringError.*;

import java.util.ArrayList;
import java.util.List;

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
	List<Integer> answer = new ArrayList<>();

	public Game(){
		while(answer.size() < answerSize){
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
		do{
			System.out.print(inputNumberString);
			String inputString = Console.readLine();
			changeInputStringToIntArray(inputString);
		}while(checkGameResult(inputNumberString));
	}

	private boolean checkGameResult(String inputNumberString){
	}

	private int[] changeInputStringToIntArray(String inputString){ //verifyInputStringInGame() -> changeInputStringToIntArray
		int[] intArray = new int[normalInputLength];
		verifyInputStringLength(inputString, normalInputLength);
		for(int i = 0; i<inputString.length(); i++){
			if(inputString.charAt(i) < '0' || inputString.charAt(i) > '9'){
				throw new IllegalArgumentException(wrongTypeInputError);
			}
			intArray[i] = Integer.parseInt(inputString.substring(i, i+1));
		}
		return intArray;
	}
	private void verifyInputStringLength(String inputString, int correctLength){
		if(inputString.length() != correctLength){
			throw new IllegalArgumentException(wrongLengthInputError);
		}
	}
	private boolean restart(){
		String inputString = Console.readLine();
		if(inputString.equals(restartString)){
			return true;
		}else if(inputString.equals(terminateString)){
			return false;
		}else{
			throw new IllegalArgumentException("[Game.restart()]:"+ wrongInputError);
		}
	}
}
