public class Practice3 {
    public int[] solution(int n, int[] arr){
        for(int i= 1; i<n; i++){
            int tmp = arr[i], j;
            for(j = i-1; j>= 0; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Practice3 T = new Practice3();
    }
}
