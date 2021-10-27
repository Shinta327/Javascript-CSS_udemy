class Task1 {
  public static void main(String[] args) {
    // 1から100までの整数を全て足す計算プログラム

    // 計算結果を格納するnumber
    int number = 0;
    for (int i = 1; i <= 100; i++) {
      number += i;
    }

    System.out.println(number);
  }
}