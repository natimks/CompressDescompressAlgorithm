
public class SimpleMethodDecompression implements DecompressionAlgorithm {

	@Override
	public String decompress(String string) {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				for (int j = 0; j < (Integer.parseInt("" + string.charAt(i)) - 1); j++)
					stringBuffer.append(string.charAt(i + 1));
			} else {
				stringBuffer.append(string.charAt(i));
			}
		}

		return stringBuffer.toString();
	}

	@Override
	public String toString() {
		return "SimpleMethod";
	}

}
