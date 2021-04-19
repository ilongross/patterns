package jav.condition_pattern.coin_ball;

import jav.proxy_pattern.VendingMonitor;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {

        VendingMachine luci = VendingMachine.getVender();
        VendingMonitor monitor = new VendingMonitor(luci);
        luci.setBalls(5);
        Scanner scanner = new Scanner(System.in);
        int op = -1;
        System.out.println("Действия:");
        System.out.println("\t1 - вставить монетку.");
        System.out.println("\t2 - получить жевачку.");
        System.out.println("\t3 - забрать монетку обратно.");
        System.out.println("\t4 - заполнить автомат шариками");
        System.out.println("\t0 - выход из программы.");

        while(op != 0 ) {
//            System.out.println("\n" + luci);
//            System.out.println("Жевачек в автомате: " + luci.getBalls());
            monitor.report();
            op = scanner.nextInt();
            if(op == 1) {
                luci.insertCoin();
            }
            else if(op == 2) {
                luci.getGumBall();
            }
            else if(op == 3) {
                luci.takeAwayCoin();
            }
            else if(op == 4) {
                System.out.print("Введи количество шариков для пополнения автомата: ");
                luci.fillMachine(scanner.nextInt());
            }
        }

    }
}