package devices;

//herdar de uma super classe e implementar de uma interface
public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	// SOBREESCREVE A OPERAÇÃO DA CLASSE DEVICE
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	// SOBREESCREVE A OPERAÇÃO DA CLASSE SCANNER
	@Override
	public String scan() {
		return "Scanned content";
	}
}
