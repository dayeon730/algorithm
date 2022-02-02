package baekjoon;

import java.util.Scanner;
import java.util.Stack;

//น้มุ 9012 ฐýศฃ
public class Stack01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int a = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i <n; i++) {
			String s = sc.next();
			String answer = "YES";
			for (int j = 0; j < s.length(); j++) {
				Character character = s.charAt(j) ;
				if(character=='(') {
					stack.push(character);
				}else if( character==')') {
					if(stack.isEmpty()) {
						answer="NO"; 
						break;
					}else {
						stack.pop();						
					}
				}
			}
			if(!stack.isEmpty()) {
				answer = "NO";
			}
			System.out.println(answer);
			stack.clear();
		}

	}

}
