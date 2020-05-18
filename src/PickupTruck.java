import java.util.Scanner;

public class PickupTruck {

    private int No;//序号
    private String name;//车辆名称
    private int cost;//租车费用
    private int MaxCapacity;//最大载人数
    private int MaxLoad;//最大载货量
    private int num;//租借数量
    private int day;//租借天数
    private Scanner keyboard = new Scanner(System.in);

    public PickupTruck(int No, String name, int cost, int maxCapacity, int maxLoad) {
        this.No = No;
        this.name = name;
        this.cost = cost;
        MaxCapacity = maxCapacity;
        MaxLoad = maxLoad;
        System.out.println("车辆序号：" + No + " 名称：" + name + " 费用：" + cost + " 最大载人：" + maxCapacity + " 最大载货：" + maxLoad);
    }

    /*
       得到租借车的数量
    */
    public void Num() {
        String s;
        System.out.println("请输入序号" + No + "(" + name + ")" + "的租用数量");
        do {
            s = keyboard.next();

        } while (s.indexOf(".") != -1 || Integer.parseInt(s) < 0);

        num = Integer.parseInt(s);
    }

    /*
       得到租借车的租借天数
    */
    public void Day() {
        System.out.println("请输入序号" + No + "(" + name + ")" + "的租车天数");
        String s;
        do {
            day = keyboard.nextInt();
            System.out.println("请确认序号" + No + "(" + name + ")" + "的租车天数为" + day + "天？(确定请输入Y，重新选择请输入任意字符)");
            s = keyboard.next();
            if (s.charAt(0) == 'N') {
                System.out.println("请重新输入租车天数");
            }
        } while (s.charAt(0) != 'Y');
    }

    /*
        返回此种类车总共的最大载人数
     */
    public int getMaxCapacity() {
        return MaxCapacity * num;
    }

    /*
        返回此种类车总共的最大载货量
     */
    public double getMaxLoad() {
        return MaxLoad * num;
    }

    /*
        返回租借的此种类车的总费用
     */
    public int value() {
        return cost * num * day;
    }

    /*
       返回租借此种类车的数量
    */
    public int getNum() {
        return num;
    }

    /*
        返回租借此种类车的租借天数
     */
    public int getDay() {
        return day;
    }

    /*
       打印此种类车的租借数目，如为0则不打印
    */
    public void get() {
        if (getNum() != 0) {
            System.out.println(name + "的租用数目为：" + getNum());

        }
    }
}
