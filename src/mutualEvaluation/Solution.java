package mutualEvaluation;

public class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int[][] answers = new int[scores.length][];
        for (int i = 0; scores.length > i; i++) {
            int checkScore = scores[i][i];  // 자기 자신을 평가
            int max = checkScore;
            boolean isMax = true;
            int min = checkScore;
            boolean isMin = true;
            double score = 0;    // 총 점수
            for (int j = 0; scores.length > j; j++) {
                score += scores[j][i];
                if (i != j && scores[j][i] >= max) {
                    isMax = false;
                }
                if (i != j && min >= scores[j][i]) {
                    isMin = false;
                }
                // TODO 최대 점수이거나 최소 점수일 경우 점수를 추가
                if (j == scores.length - 1) {
                    if (!isMax && !isMin) {     // 본인평가가 최대, 최소가 아니면 점수를 추가하고 평균을 구한다.
                        score /= scores.length;
                    } else {    // 평균을 구한다.
                        score -= scores[i][i];
                        score /= scores.length - 1;
                    }
                }
            }
            answer += gradePoint(score);
        }
        return answer;
    }

    public String gradePoint(double score) {
        String answer = "";
        if (score >= 90) answer += "A";
        else if (90 > score && score >= 80) answer += "B";
        else if (80 > score && score >= 70) answer += "C";
        else if (70 > score && score >= 50) answer += "D";
        else answer += "F";
        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{100, 90, 98, 88, 65}, {50, 45, 99, 85, 77}, {47, 88, 95, 80, 67}, {61, 57, 100, 80, 65}, {24, 90, 94, 75, 65}};
        Solution st = new Solution();
        System.out.println(st.solution(arr));
    }
}
