//등수구하기
//        N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을
//        작성하세요.
//        같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92점인데 92점이
//        3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
//        ▣ 입력설명
//        첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력
//        된다.
//        ▣ 출력설명
//        입력된 순서대로 등수를 출력한다.
//        ▣ 입력예제 1
//        5
//        87 89 92 100 76
//        ▣ 출력예제 1
//        4 3 2 1 5
public class ArrayCode5 {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i = 0; i<n; i++){
            int cnt = 1;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        ArrayCode5 practice5 = new ArrayCode5();
        int[] arr = {87, 89, 92, 100, 76};
        for(int x : practice5.solution(5, arr)){
            System.out.print(x+" ");
        }
    }
}
