package java_01;

public class Quiz07 {
    /*
    아래 주어진 배열에서 최솟값을 구하는 코드를 작성하세요. (10점)
        int[] arrays = {90, 87, 50, 65, 20}
     */
    public static void main(String[] args) {
        int min = 100;
        int[] arrays = {90, 87, 50, 65, 20};

        for (int i = 0; i < arrays.length ; i++) {
            if (min > arrays[i]){
                min = arrays[i];
            }
        }System.out.println(min);
    }
}
