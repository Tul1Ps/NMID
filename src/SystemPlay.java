import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SystemPlay {

    public static void main(String[] args) throws Exception {
        System.out.println("载客车租借信息如下：");
        PassengerCar pc1 = new PassengerCar(1, "小轿车", 40, 4);
        PassengerCar pc2 = new PassengerCar(2, "面包车", 65, 7);
        PassengerCar pc3 = new PassengerCar(3, "大巴车", 180, 20);
        System.out.println("载货车租借信息如下：");
        Truck t1 = new Truck(4, "低栏车", 30, 1.5);
        Truck t2 = new Truck(5, "高栏车", 47, 2.5);
        Truck t3 = new Truck(6, "厢式车", 80, 4.5);
        System.out.println("皮卡车租借信息如下：");
        PickupTruck pt1 = new PickupTruck(7, "日式皮卡车", 60, 5, 1);
        PickupTruck pt2 = new PickupTruck(8, "美式皮卡车", 60, 2, 3);


        pc1.Num();
        pc1.Day();
        pc2.Num();
        pc2.Day();
        pc3.Num();
        pc3.Day();
        t1.Num();
        t1.Day();
        t2.Num();
        t2.Day();
        t3.Num();
        t3.Day();
        pt1.Num();
        pt1.Day();
        pt2.Num();
        pt2.Day();


        int Capacity = pc1.getMaxCapacity() + pc2.getMaxCapacity() + pc3.getMaxCapacity() + pt1.getMaxCapacity() + pt2.getMaxCapacity();
        double Load = t1.getMaxLoad() + t2.getMaxLoad() + t3.getMaxLoad() + pt1.getMaxLoad() + pt2.getMaxLoad();
        int add = pc1.value() + pc2.value() + pc3.value() + t1.value() + t2.value() + t3.value() + pt1.value() + pt2.value();
        int Day = pc1.getDay() + pc2.getDay() + pc3.getDay() + t1.getDay() + t2.getDay() + t3.getDay() + pt1.getDay() + pt2.getDay();
        int number = pc1.getNum() + pc2.getNum() + pc3.getNum() + t1.getNum() + t2.getNum() + t3.getNum() + pt1.getNum() + pt2.getNum();


        System.out.print("总体租车最大载人量为:" + Capacity);
        System.out.print("  总体租车最大载货量为:" + Load);
        System.out.print("  总体租车费用为:" + add);
        System.out.print("  总体租车天数为:" + Day);
        System.out.println("  租车总数为:" + number);


        pc1.get();
        pc2.get();
        pc3.get();
        t1.get();
        t2.get();
        t3.get();
        pt1.get();
        pt2.get();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        do {
            System.out.println("请按回车健结束");
            str = bf.readLine();
        } while (str.length() != 0);

        System.out.println("程序结束");
    }
}
