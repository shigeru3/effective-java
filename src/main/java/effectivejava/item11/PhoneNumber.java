package effectivejava.item11;

final class PhoneNumber {
	private final short areaCode, prefix, lineNum;
	private int hashCode;

	public PhoneNumber(int areaCode, int prefix, int lineNum) {
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max) {
			throw new IllegalArgumentException(String.format("%s: %s", val, arg));
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
		return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNum == lineNum;
	}

	@Override
	public int hashCode() {
		int result = hashCode;
		if (result == 0) {
			result = Short.hashCode(areaCode);
			result = 31 * result + Short.hashCode(prefix);
			result = 31 * result + Short.hashCode(lineNum);
			hashCode = result;
		}
		return result;
	}


}
