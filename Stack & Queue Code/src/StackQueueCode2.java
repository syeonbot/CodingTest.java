public class StackQueueCode2 {
    public int[] solution(int n, int[] arr){
        for(int i = 0; i < n-1; i++){
            int idx = i;
            for(int j = j+1; j<n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        StackQueueCode2 T = new StackQueueCode2();
        T.solution();
        }
}
