package effectivejava.item34;

enum PayrollDay {
	MONDAY(PayType.WEEKDAY),
	TUESDAY(PayType.WEEKDAY),
	WEDNESDAY(PayType.WEEKDAY),
	THURSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY),
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);

	private final PayType payType;

	PayrollDay(PayType payType) {
		this.payType = payType;
	}

	int pay(int min, int rate) {
		return payType.pay(min, rate);
	}

	enum PayType {
		WEEKDAY {
			@Override
			int overtimePay(int min, int payRate) {
				return min <= MINUTES_PER_SHIFT ? 0 :
						(min - MINUTES_PER_SHIFT) * payRate / 2;
			}
		},
		WEEKEND {
			@Override
			int overtimePay(int min, int payRate) {
				return min * payRate / 2;
			}
		};
		abstract int overtimePay(int min, int payRate);
		private static final int MINUTES_PER_SHIFT = 8 * 60;

		int pay(int min, int rate) {
			int basePay = min * rate;
			return basePay + overtimePay(min, rate);
		}
	}
}
