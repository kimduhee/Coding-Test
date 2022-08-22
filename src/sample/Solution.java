package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * ���̵�/�Ű���/�Ű�ȼ�
 * @author namanok
 *
 */
public class Solution {
	public int[] solution(int [] arr) {

        int preNo = 0;
        List<Integer> li = new ArrayList<>();
        for(int i=0; i<arr.length;i++) {
            if(i==0 || arr[i] != preNo) {
            	preNo = arr[i];
                li.add(arr[i]);
            } else if(preNo == arr[i]){
                continue;
            }
        }
        
        int[] answer = li.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] i = {1,1,3,3,0,1,1};
		s.solution(i);
	}
	
}
