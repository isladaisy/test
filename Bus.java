

public class Bus extends publicTransportation {

    int passenger = 0;
    int maxPassenger = 30;
    String status = "운행";
    int fare = 1000;
    int gasoline = 100;

    public void busstatus(int num) {
        System.out.println("버스번호 = " + num);
        System.out.println("탑승 승객 수 = " + passenger);
        System.out.println("잔여 승객 수 = " + maxPassenger);
        System.out.println("주유량 = " + gasoline);
        System.out.println("요금 = " + fare);
        System.out.println("상태 = " + status);
        System.out.println();
    }

    public void currentStatus(int p) {
        passenger += p;
        maxPassenger -= p;
        if (true) {
            int currentPassenger = passenger;
            int passengerLeft = maxPassenger;
            int totalfare = fare * p;
            System.out.println("탑승 승객 수는 = " + currentPassenger);
            System.out.println("잔여 승객 수는 = " + passengerLeft);
            System.out.println("요금 확인 = " + totalfare);
            System.out.println();
        }
    }

    public void gasoline(int g) {
        gasoline += g;
        if (true) {
            int currentGasoline = gasoline;
            System.out.println(currentGasoline);
        }

        if(gasoline<=5) {
            System.out.println("주유 필요");
        }
    }

    public void currentStatus(String s) {
        if (s.equals("차고지행")) { //상수.equals(변수) //null체크
            status = "차고지행";
        } else {
            status= "운행중";
        }

        System.out.println(status);
    }

    public void currentPassenger(int a) {
        passenger += a;
        if (passenger > 30) {
            System.out.println("최대 승객 수 초과");
            passenger = 0;
            maxPassenger = 30;
            System.out.println();
        }
    }



}
