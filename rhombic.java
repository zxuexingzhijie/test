public class rhombic{
    public static void main(String[] args){
        int tower = 5;
        for (int i = 1;i<=tower ;i++ ) {
            for (int f = 1; f <= tower-i;f++){System.out.print(" ");}
            for (int j = 1; j<=2*i-1 ; j++) {
                if(j == 1 || j == 2*i-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = tower - 1; i >= 1 ; i--) {
            for(int w = 1;w <= tower - i; w++){
                System.out.print(" ");
            }
            for(int f = 1;f <= 2*tower-1;f++){
                if(f == 1 || f == 2*i-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
        }
}