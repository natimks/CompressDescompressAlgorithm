
public class CompressionFactory implements CompressionFactoryAlgorithm {
	public final static int FIVE_BIT = 1;
	public final static int SIMPLE_METHOD = 2;

	@Override
	public CompressionAlgorithm getCompressClass(int tipo) {
		CompressionAlgorithm compressionAlgorithm = null;
		switch (tipo) {
		case FIVE_BIT:
			compressionAlgorithm = new FiveBitCompression();
			break;
		case SIMPLE_METHOD:
			compressionAlgorithm = new SimpleMethodCompression();
			break;
		default:
			break;
		}
		return compressionAlgorithm;
	}
}
