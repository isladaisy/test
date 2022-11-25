public class Taxi {

    String place;
    String status = "일반";
    int rapid = 0;
    int gasoline = 100;
    int passenger = 0;
    int maxPassenger = 4;
    int distance;
    int setdistance = 1;
    int setfare = 3000;
    int totalfare = 0;
    int fareperdistance = 1000;
    int fareaccumulated = 0;


    public void taxistatus(int num) {
        System.out.println("택시번호 = " + num);
        System.out.println("주유량 = " + gasoline);
        System.out.println("상태 = " + status);
        System.out.println();
    }

    public void placestatus(int n, String p, int d) {
        passenger += n;
        maxPassenger -= n;
        place = p;
        int distanceForPlace = d-1;

        if (d > 1) {
            totalfare = setfare + (distanceForPlace * fareperdistance);
        }

        if (n > 0) {
            status = "운행중";
        }

        System.out.println("탑승 승객 수 = " + passenger);
        System.out.println("잔여 승객 수 = " + maxPassenger);
        System.out.println("기본 요금 확인 = " + setfare);
        System.out.println("목적지 = " + place);
        System.out.println("목적지까지 거리 = " + d + "km");
        System.out.println("지불할 요금 = " + totalfare);
        System.out.println("상태 = " + status);
        System.out.println();
    }


    public void gasoline(int g) {
        gasoline += g;
        if (true) {
            int currentGasoline = gasoline;
            System.out.println("주유량 = " + currentGasoline);
        }

        if(gasoline<=5) {
            status = "운행불가";
            System.out.println("상태 = " + status);
            System.out.println("주유 필요");
        }
    }

    public void fareaccumulated() {
        fareaccumulated += totalfare;
        System.out.println("누적 요금 = " + fareaccumulated);
    }

    public void currentPassenger(int a) {
        passenger += a;
        if (passenger > 4) {
            System.out.println("최대 승객 수 초과");
            passenger = 0;
            maxPassenger = 4;
            System.out.println();
        }
    }



}
