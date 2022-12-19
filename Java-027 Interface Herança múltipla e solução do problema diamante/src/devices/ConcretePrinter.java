package devices;

//herdar de uma super classe e implementar de uma interface
public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	// SOBREESCREVE A OPERAÇÃO DA CLASSE DEVICE
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	// SOBREESCREVE A OPERAÇÃO DA CLASSE SCANNER
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
