package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Station {
    public static boolean flag = true;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (flag) {
            int speed = 100;
            int restDis = 500;
            int brake = 0;
            int second = 0;

            while (restDis >= 0 && speed > 0) {
                second++;
                System.out.println("残り距離:" + restDis + " 速度:" + speed + "km/h ブレーキの強さ:" + brake);
                System.out.print("ブレーキの強さは?(2=強く、1=弱く、0=そのまま)\n>");
                String str = br.readLine();
                int choice = Integer.parseInt(str);

                System.out.println("-----------------------------------------------\n");

                switch (choice) {
                    case 2 -> brake++;
                    case 1 -> brake--;
                    default -> {
                    }
                }

                speed -= brake;
                int distance = speed * 1000 / 3600;

                restDis -= distance;
            }

            System.out.println(second + "秒 駅までの距離　" + restDis + "mで停止しました。");

            System.out.print("もう一度やりますか? (1=Yes; 2=No;)\n>");
            String str2 = br.readLine();
            int yesNo = Integer.parseInt(str2);
            if (yesNo == 0) {
                flag = false;
            }

        }
    }
}
