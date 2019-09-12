
public class FacadeStringCompression {
	CompressionAlgorithm compression;
	DecompressionAlgorithm decompression;
	DecompressionFactory decompressionFactory;
	CompressionFactory compressionFactory;

	public FacadeStringCompression() {
		compressionFactory = new CompressionFactory();
		decompressionFactory = new DecompressionFactory();
	}
	public String compress(String str1) {
		if (str1.length() > 20) {
			compression = compressionFactory.getCompressClass(CompressionFactory.FIVE_BIT);
		} else {
			compression = compressionFactory.getCompressClass(CompressionFactory.SIMPLE_METHOD);
		}
		return compression.compress(str1);
	}	

	public String decompress(String str2) {
		if (str2.length() > 20) {
			decompression = decompressionFactory.getDecompressClass(DecompressionFactory.FIVE_BIT);
		} else {
			decompression = decompressionFactory.getDecompressClass(DecompressionFactory.SIMPLE_METHOD);
		}
		return decompression.decompress(str2);
	}

	public void print(String str1) {
		String compressString = compress(str1);
		System.out.println("Original string: " + str1);
		System.out.println("Length: " + str1.length());
		System.out.println("Compressed string: " + compressString);
		System.out.println("Decompressed string: " + decompress(compressString));
		System.out.println("Compression Algorithm: " + compression);
		System.out.println("Decompression Algorithm: " + decompression);
	}

	public void isEqual(String str1, String str2) {
		if (str2.equalsIgnoreCase(str1)) {
			System.out.println("OK");
		} else {
			System.out.println("ERRO");
		}
	}

}
