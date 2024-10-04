import java.util.Scanner;
public class TheYangHuiTriangle {
    public static void main(String[] args) {
        int[][] arr = new int[10][];

        for (int j = 0; j<arr.length; j++ ) {
            arr[j] = new int[j+1];
            for (int i = 0; i<arr[j].length ; i++ ) {
                if (i == 0 || i == arr[j].length - 1) {
                    arr[j][i] = 1;
                } else {
                    arr[j][i] = arr[j-1][i] + arr[j-1][i-1];
                }
            }
        }

        //打印杨辉三角
        for(int i = 0; i <arr.length; i++){
            for (int j = 0; j<arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

