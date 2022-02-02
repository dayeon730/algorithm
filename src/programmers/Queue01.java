package programmers;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 스택/큐 > 기능개발 
public class Queue01 {

	public static void main(String[] args) {
		class Solution {
			public int[] solution(int[] progresses, int[] speeds) {
				int[] answer ;

				List<Integer> days = new ArrayList<>();
				List<Integer> ans = new ArrayList<>();


				for(int i=0; i<progresses.length; i++){
					int cnt = 0;
					while(progresses[i]<100){
						progresses[i]+=speeds[i];    
						cnt++;
					}
					days.add(cnt);
				}

				int pre = days.remove(0);
				int count = 1;
				while(!days.isEmpty()){
					int now = days.remove(0);
					if(pre >= now){
						count++;
						continue;
					}
					ans.add(count);
					pre = now;
					count = 1;

				}
				ans.add(count);
				//System.out.println(answer.length);
				answer = new int[ans.size()];
				for(int i=0; i<ans.size(); i++){

					answer[i] = ans.get(i);
				}
				System.out.println(ans);
				return answer;
			}
		}

		Solution s = new Solution();
		int[] progresses = {93, 30, 55}; //[95, 90, 99, 99, 80, 99]
		int[] speeds = {1, 30, 5}; //[1, 1, 1, 1, 1, 1]	

		s.solution(progresses, speeds);
	}
}
