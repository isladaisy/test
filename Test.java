public class Test {

    public static void main(String[] args) {
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();

        b1.busstatus(1);
        b2.busstatus(2);
        b1.currentStatus(2);
        b1.gasoline(-50);
        System.out.println();
        b1.currentStatus("차고지행");
        b1.gasoline(10);
        System.out.println();
//        b1.currentStatus("운행중");
        b1.currentPassenger(45);
        b1.currentStatus(5);
        b1.gasoline(-55);
        b1.currentStatus("차고지행");

        System.out.println("========================");

        t1.taxistatus(1);
        t2.taxistatus(2);
        t1.placestatus(2, "서울역", 2);
        t1.gasoline(-80);
        t1.fareaccumulated();
        t1.currentPassenger(5);
        t1.placestatus(3, "구로디지털단지역", 12);
        System.out.println();
        t1.gasoline(-20);
        t1.fareaccumulated();






    }
}
