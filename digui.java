public class digui {
    public static void main(String[] args) {
        initarr t = new initarr(1.1, 2.2, 3.4);
        copyarr a = new copyarr();
        double[] n = a.copy(t); 
        for (int j = 0; j < n.length; j++) {
            System.out.print(n[j] + " ");
        }
    }
}

class copyarr {
    public double[] copy(initarr arr1) {
        double[] newarr = new double[arr1.arr.length];
        for (int i = 0; i < arr1.arr.length; i++) {
            newarr[i] = arr1.arr[i];
        }
        return newarr;
    }
}

class initarr {
    double[] arr;

    public initarr(double... num) {
        // 正确初始化成员变量 arr
        this.arr = new double[num.length];
        for (int i = 0; i < num.length; i++) {
            this.arr[i] = num[i];
        }
    }
}
