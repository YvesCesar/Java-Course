package devices;

public class ComboDevice extends Device implements Scanner, Printer {
	
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		// Printer Interface
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public String scan() {
		// Scanner Interface
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		// Abstract Class Device
		System.out.println("Combo processing: " + doc);
	}

}
