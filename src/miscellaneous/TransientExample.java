package miscellaneous;


import java.io.*;

public class TransientExample implements Serializable {

	private static final long serialVersionUID = 1L;
	private transient int sensitiveData;
	private int nonSensitiveData;

	public TransientExample(int sensitiveData, int nonSensitiveData) {
		this.sensitiveData = sensitiveData;
		this.nonSensitiveData = nonSensitiveData;
	}

	public int getSensitiveData() {
		return sensitiveData;
	}

	public int getNonSensitiveData() {
		return nonSensitiveData;
	}

	public static void main(String[] args) {
		TransientExample original = new TransientExample(42, 100);


		try (FileOutputStream fileOut = new FileOutputStream("example.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(original);
			System.out.println("Object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		 

		// Deserialize the object
		
		try (FileInputStream fileIn = new FileInputStream("example.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			TransientExample deserialized = (TransientExample) in.readObject();
			System.out.println("Sensitive Data: " + deserialized.getSensitiveData());
			System.out.println("Non-Sensitive Data: " + deserialized.getNonSensitiveData());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
