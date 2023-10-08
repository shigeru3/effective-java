package effectivejava.item10;

public final class PhoneNumber {
	private final short areaCode;
	private final short prefix;
	private final short lineNum;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max) {
			throw new IllegalArgumentException(String.format("%s: %s", arg, val));
		}
		return (short) val;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PhoneNumber pn)) {
			return false;
		}
		return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
	}
}
