package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//백준 10828 스택
public class Stack03 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		String what;
		int answer = 0;
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			what = br.readLine();
			if(what.contains("push")) {
				what = what.trim();
				cnt++;
				stack.push(Integer.parseInt(what.substring(5)));
				continue;
			}else if(what.contains("pop")) {
				if(!stack.isEmpty()) {
					answer = stack.pop();
					cnt--;
				}else {
					answer = -1;
				}
			}else if(what.contains("size")) {
				answer = cnt;
			}else if(what.contains("empty")) {
				if(stack.isEmpty()) {
					answer = 1;
				}else {
					answer = 0;
				}
				
			}else if(what.contains("top")) {
				if(stack.isEmpty()) {
					answer = -1;
				}else {
					answer = stack.pop();
					stack.push(answer);
				}
			}
				
				System.out.println(answer);
		}

	}

}
