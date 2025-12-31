package curriculum.h;

public class PartTimeEmployee extends Employee {

	// 時給（定数） ← これが無いとエラー
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 日給計算（割増なし）
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}
}
