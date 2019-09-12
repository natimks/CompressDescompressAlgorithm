
public class DecompressionFactory implements DecompressionFactoryAlgorithm {
	public final static int FIVE_BIT = 1;
	public final static int SIMPLE_METHOD = 2;

	@Override
	public DecompressionAlgorithm getDecompressClass(int tipo) {
		DecompressionAlgorithm decompressionAlgorithm = null;
		switch (tipo) {
		case FIVE_BIT:
			decompressionAlgorithm = new FiveBitDecompression();
			break;
		case SIMPLE_METHOD:
			decompressionAlgorithm = new SimpleMethodDecompression();
			break;
		default:
			break;
		}
		return decompressionAlgorithm;
	}
}
