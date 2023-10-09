package effectivejava.item14;

import java.util.Comparator;

final class PhoneNumber implements Comparable<PhoneNumber>{
	private final short areaCode, prefix, lineNum;

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

	private static final Comparator<PhoneNumber> COMPARATOR =
			Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
			.thenComparingInt(pn -> pn.prefix)
			.thenComparingInt(pn -> pn.lineNum);

	@Override
	public int compareTo(PhoneNumber phoneNumber) {
		return COMPARATOR.compare(this, phoneNumber);
	}
}
