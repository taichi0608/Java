package curriculum.b;
/*
 ■ クラス名の探索ルール（優先順位）
  1. 同じパッケージ（curriculum.b）
  2. import されたクラス
  3. java.lang パッケージ（String, System など）
 
 ※ import は同じパッケージより優先されない
 ※ 同じパッケージに同名クラスがあれば、それが必ず使われる
 */

public class Main {

	public static void main(String[] args) {

		/*
		 Greeting クラスは同じパッケージ（curriculum.b）に存在するため、
		 import 文を書かなくても使用できる。
		 
		 もし別パッケージ（例：sample.a.Greeting）にある場合は、
		 以下のいずれかが必要になる。
		 
		 ① import sample.a.Greeting;
		 ② sample.a.Greeting と完全修飾名で記述する
		 
		 ※ 同名クラスが複数パッケージに存在する場合、
		    import を2つ書くことはできない。
		    その場合は完全修飾名を使う。
		 */

		// Q4
		Greeting greeting = new Greeting();

		greeting.sayHello();
		
		// Q5
		Animal animal = new Animal();

		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);

		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}
