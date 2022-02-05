package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//프로그래머스 해시 > 완주하지 못한 선수 
public class Queue02 {

	public static void main(String[] args) {
		class Solution {
		    public String solution(String[] participant, String[] completion) {
		    	 String answer = "";
		 		Queue<String > queue = new LinkedList<>();
		 		Arrays.sort(participant);
		 		Arrays.sort(completion);
		 		       
		 		for (int i = 0; i <participant.length; i++) {
		 		 queue.add(participant[i]);
		 		}
		 		for (int j = 0; j < completion.length; j++) {
		 		  String ans = queue.remove();
		            if(!ans.equals(completion[j]) ) {
		 		    answer = ans; 
		 		    break;
		 		   }else {
		 		     answer = participant[participant.length-1];
		 		   }
		 		}
		 		System.out.println(answer);
		 		 return answer;
		    }
		}
		
		Solution s = new Solution();
		String [] participant = {"leo", "kiki", "eden"};//{"mislav", "stanko", "mislav", "ana"};
		String [] completion = {"eden", "kiki"}; //{"stanko", "ana", "mislav"};
		
		s.solution(participant, completion);

	}

}
