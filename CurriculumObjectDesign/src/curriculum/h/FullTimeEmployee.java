package curriculum.h;

public class FullTimeEmployee extends Employee {

	// 時給（定数）
	private static final int HOURLY_RATE = 1200;

	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 日給計算（8時間超過分は25%割増）
	@Override
	public int calculateDailyWage(int hoursWorked) {

		int regularHours = Math.min(hoursWorked, 8);
		int overtimeHours = Math.max(hoursWorked - 8, 0);

		int regularPay = regularHours * HOURLY_RATE;
		int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);

		return regularPay + overtimePay;
	}
}
