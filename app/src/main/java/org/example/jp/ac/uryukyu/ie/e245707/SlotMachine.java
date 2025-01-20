public class SlotMachine {
        /**
     * スロットマシンのロジックを担当するクラス。
     */
    private int coins;
    private final Random random;

    /**
     * コンストラクタ。
     * 初期コイン数を設定。
     * @param initialCoins 初期コイン数。
     */
    public SlotMachine(int initialCoins) {
        this.coins = initialCoins;
        this.random = new Random();
    }

    /**
     * スロットを回す。
     * @return スロットの結果（3つの整数）。
     */
    public int[] spin() {
        if (coins <= 0) {
            throw new IllegalStateException("コインが足りません。");
        }
        coins--;
        return new int[]{
            random.nextInt(10),
            random.nextInt(10),
            random.nextInt(10)
        };
    }
    /**
     * スロットの結果を判定し、コインを追加。
     * @param result スロットの結果（3つの整数）。
     * @return 勝利した場合の獲得コイン数。
     */
    public int getResult(int[] result) {
        if (result[0] == result[1] && result[1] == result[2]) {
            int reward = 100;
            coins += reward;
            return reward;
        }
        return 0;
    }

    /**
     * 現在のコイン数を取得。
     * @return 現在のコイン数。
     */
    public int getCoins() {
        return coins;
    }
}
