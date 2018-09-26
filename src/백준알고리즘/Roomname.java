package 백준알고리즘;

import java.util.Scanner;

/**
 * 방번호 알고리즘 - 0~9까지의 세트 (9=6)
 * 입력값 인지시 6을 9로 인지하기
 * 
 * @author 이혜림
 *
 */
public class Roomname {
Scanner scanner = new Scanner(System.in);
int[] number = new int[10];
String roomNumber = scanner.next();

roomNumber = roomNumber.replace('6','9');
int index;
for(char ch : roomNumber.toCharArray()) {
	index = (int)ch - 48;
	number[index] +=1;
}



}

