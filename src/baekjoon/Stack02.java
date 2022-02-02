package baekjoon;

import java.util.Scanner;
import java.util.Stack;

//백준 10773 제로
public class Stack02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack  = new Stack<>();
		for (int i = 0; i <n; i++) {
			int num = sc.nextInt();
			if(num!=0) {
				stack.push(num);
			}else {
				stack.pop();
			}
		}
		int answer = 0;
		while(!stack.isEmpty()) {
			answer +=stack.pop();
		}
		System.out.println(answer);
		

		
		
	}

}
