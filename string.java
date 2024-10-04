public class string{
  public static void main(String[] args) {
        // 创建第一个对象并进行测试
        Cale calc1 = new Cale(10.5, 5.2);
        System.out.println("加法结果: " + calc1.add());
        System.out.println("减法结果: " + calc1.subtract());
        System.out.println("乘法结果: " + calc1.multiply());
        System.out.println("除法结果: " + calc1.divide());

        // 创建第二个对象并进行测试（除数为 0 的情况）
        Cale calc2 = new Cale(8.0, 0);
        System.out.println("加法结果: " + calc2.add());
        System.out.println("减法结果: " + calc2.subtract());
        System.out.println("乘法结果: " + calc2.multiply());
        System.out.println("除法结果: " + calc2.divide());
    }
}


public class Cale {
    private double num1;
    private double num2;

    // 构造函数，初始化两个操作数
    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 加法
    public double add() {
        return num1 + num2;
    }

    // 减法
    public double subtract() {
        return num1 - num2;
    }

    // 乘法
    public double multiply() {
        return num1 * num2;
    }

    // 除法，处理除数为 0 的情况
    public double divide() {
        if (num2 == 0) {
            System.out.println("除数不能为 0！");
            return Double.NaN; // 返回 NaN 表示无效结果
        }
        return num1 / num2;
    }