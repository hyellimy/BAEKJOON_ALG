package 백준알고리즘;

import java.util.Scanner;

/**
 * 설탕문제 다른 풀이법
 * : 3 / 5키로 봉지로 모든 값 이동 
 * @author 이혜림
 *
 */
public class Sugar2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sugarAmount = sc.nextInt();
	
	if(sugarAmount >= 3 && sugarAmount <= 5000) {
		if(sugarAmount % 5 == 0) {
			System.out.println(sugarAmount/5);
			sugarAmount = -1;
		}else {
			int fivesugarbyonebox = sugarAmount/5;
			for(int fiveSugarBoxCnt = fivesugarbyonebox;fiveSugarBoxCnt >0 ; fiveSugarBoxCnt++) {
				int remainSugarAmount = sugarAmount - (fiveSugarBoxCnt*5);
			
			if(remainSugarAmount % 3 ==0 ) {
				int threeSugarByOneBox = remainSugarAmount /3;
				System.out.println(threeSugarByOneBox + fivesugarbyonebox);
				sugarAmount = -1;
				break;
				
			}
			
			}
		
		}
		if(sugarAmount % 3 ==0) {
			System.out.println(sugarAmount /3);
		}else if(sugarAmount >0) {
			System.out.println(-1);
		}
		
	
	}
	
}
}
