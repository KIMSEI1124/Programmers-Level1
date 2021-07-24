package phonekemon;

import java.util.HashSet;
import java.util.Set;

/**
 * nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
 * nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
 * 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
 * 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
 * HashSet API사용 - 중복을 허용하지 않는다는 성격을 사용
 */

public class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        int takeMon = nums.length/2;
        Set<Integer> setInt = new HashSet<Integer>();
        for (int i = 0; nums.length>i;i++) {
            setInt.add(nums[i]);
        }
        if ( takeMon > setInt.size()){
            answer = setInt.size();
        } else {
            answer = takeMon;
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        Solution2 st = new Solution2();
        int[] nums1 = new int[] {1,1,1,100,100,100,300,300}; // 3
        int[] nums2 = new int[] {3,3,3,2,2,4};  // 3
        int[] nums3 = new int[] {3,3,3,2,2,2};  // 2
        int[] nums4 = new int[] {3,1,2,3};      // 2
        st.solution(nums4);
    }
}
