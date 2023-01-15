## 개요
+ 우아한 프리코스 1주차 과제 - 숫자 야구를 구현한다.
+ 필요 기능은 [우아한 프리코스 - 숫자야구](https://github.com/woowacourse/java-baseball-precourse) 에서 확인할 수 있다.

## 동작 흐름
1. 컴퓨터는 중복되지 않는 임의의 수 3개를 순서대로 선택한다.
2. 사용자는 컴퓨터가 선택한 수를 예상하여 입력한다.
3. 사용자의 입력에 대한 결과를 출력한다.
   1. 사용자가 입력한 수 중 컴퓨터가 선택한 수와 같은 자리에 위치한 같은 수는 스트라이크가 된다.
   2. 사용자가 입력한 수 중 컴퓨터가 선택한 수와 다른 자리에 위치한 같은 수는 볼이 된다.
   3. 스트라이크, 볼이 전부 존재하지 않는 경우 낫싱이 된다.
4. 사용자가 정답을 맞히게 되면 게임이 종료된다.
5. 새로운 게임을 시작할 것인지 입력을 받는다.
   1. 1을 입력하면 새로운 게임을 시작하여 1번으로 돌아간다.
   2. 2를 입력하면 게임을 끝내고 프로그램을 종료한다.

## 필요 기능
[v] 게임 초기 설정을 한다.<br>
[v] 사용자에게 입력을 받는다.<br>
[ ] 정답을 출력한다.<br>
[ ] 재시작 여부를 묻는다.<br>

## 예외 처리
### 정답 입력
+ 숫자가 아닌 입력을 포함한 경우 `IllegalArgumentException`을 발생시킨다.
+ 숫자가 세자리가 아닌 경우 `IllegalArgumentException`을 발생시킨다.
### 재시작 여부 입력
+ 숫자가 아닌 입력에 대해 `IllegalArgumentException`을 발생시킨다.
+ '1', '2'가 아닌 입력에 대해 `IllegalArgumentException`을 발생시킨다.

## 프로젝트 구성
📦java-baseball-precourse<br>
┣ 📂.git<br>
┣ 📂.gradle<br>
┣ 📂.idea<br>
┣ 📂build<br>
┣ 📂gradle<br>
┣ 📂out<br>
┣ 📂src<br>
┃ ┣ 📂main<br>
┃ ┃ ┗ 📂java<br>
┃ ┃ ┃ ┣ 📂baseball<br>
┃ ┃ ┃ ┃ ┗ 📜Application.java<br>
┃ ┃ ┃ ┣ 📂baseballgame<br>
┃ ┃ ┃ ┃ ┗ 📜Game.java<br>
┃ ┃ ┃ ┗ 📂constant<br>
┃ ┃ ┃ ┃ ┣ 📜Constant.java<br>
┃ ┃ ┃ ┃ ┗ 📜StringError.java<br>
┃ ┗ 📂test<br>
┃ ┃ ┗ 📂java<br>
┃ ┃ ┃ ┗ 📂baseball<br>
┃ ┃ ┃ ┃ ┗ 📜ApplicationTest.java<br>
┣ 📜.gitignore<br>
┣ 📜build.gradle<br>
┣ 📜gradlew<br>
┣ 📜gradlew.bat<br>
┣ 📜LICENSE<br>
┗ 📜README.md<br>

### 사용 클래스
+ baseballgame/Game : 전체 게임을 진행하는 클래스
+ constant/Constant : Game에서 사용되는 상수를 관리하는 클래스
+ constant/StringError : Exception에 사용될 에러 메시지를 관리하는 클래스

## 진행 현황
+ 230115 - 프로젝트 시작, 구현 완료