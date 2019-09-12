
public class SimpleMethodCompression implements CompressionAlgorithm {
	@Override
	public String compress(String string) {
		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < string.length(); i++) {
			int count = 1;
			while (i + 1 < string.length() && string.charAt(i) == string.charAt(i + 1)) {
				count++;
				i++;
			}
			if (count > 1) {
				stringBuffer.append(count);
			}
			stringBuffer.append(string.charAt(i));
		}

		return stringBuffer.toString();
	}

	@Override
	public String toString() {
		return "SimpleMethod";
	}
}
