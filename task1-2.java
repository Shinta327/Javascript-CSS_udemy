class Task2 {
  public static void main(String[] args) {
    // 2から100までの偶数のみを全て足す計算プログラムを作成してください

    // 計算結果を格納する変数
    int number = 0;
    for (int i = 2; i <= 100; i += 2) {
      number += i;
    }
    System.out.println(number);
  }
}