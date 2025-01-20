package org.example.jp.ac.uryukyu.ie.e245707;
import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    /**
 * メインクラス。スロットゲームを実行する。
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    SlotMachine slotMachine = new SlotMachine(100);

    System.out.println("スロットゲームを開始します！ 初期コイン数: " + slotMachine.getCoins());
    while (slotMachine.getCoins() > 0) {
        System.out.println("Enterキーを押してスロットを回してください...");
        scanner.nextLine();

        int[] result = slotMachine.spin();
        System.out.println("スロット結果: " + result[0] + " " + result[1] + " " + result[2]);

        int reward = slotMachine.getResult(result);
        if (reward > 0) {
            System.out.println("おめでとうございます！ " + reward + "コイン獲得！");
        } else {
            System.out.println("残念！ また挑戦してください。");
        }

        System.out.println("現在のコイン数: " + slotMachine.getCoins());
    }

    System.out.println("ゲーム終了！コインがなくなりました。");
    scanner.close();
}
}

