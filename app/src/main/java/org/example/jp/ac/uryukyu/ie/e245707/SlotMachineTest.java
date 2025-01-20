public class SlotMachineTest {
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine(5);

        // 初期コイン数のテスト
        assert slotMachine.getCoins() == 5 : "初期コイン数が正しく設定されていません。";

        // スロットを回してコインが減少することを確認
        slotMachine.spin();
        assert slotMachine.getCoins() == 4 : "コインが正しく減少していません。";

        // スロットの結果判定テスト
        int[] winningResult = {7, 7, 7};
        int reward = slotMachine.getResult(winningResult);
        assert reward == 10 : "勝利時の報酬が正しくありません。";
        assert slotMachine.getCoins() == 14 : "コインが正しく追加されていません。";

        System.out.println("すべてのテストが成功しました！");
    }
}
