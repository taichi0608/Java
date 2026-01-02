class Person {
  // インスタンスフィールド
  String name;
  int age;
  double height;
  double weight;

  // 人数を数えるstaticフィールド
  static int count = 0;

  // コンストラクタ
  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    count++; // 人数をカウント
  }

  // BMIを計算するメソッド
  double bmi() {
    return this.weight / (this.height * this.height);
  }

  // 自己紹介を出力するメソッド
  void print() {
    System.out.println("名前は" + this.name + "です");
    System.out.println("年は" + this.age + "です");
    System.out.println("BMIは" + this.bmi() + "です");
  }
}
