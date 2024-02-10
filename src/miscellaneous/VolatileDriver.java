package miscellaneous;

	public class VolatileDriver {
	    public static void main(String[] args) {
	        VolatileExample example = new VolatileExample();

	        Thread thread = new Thread(() -> {
	            while (true) {
	                example.toggleFlag();
	                System.out.println("Flag toggled to: " + example.isFlag());
	                try {
	                    Thread.sleep(1000); 
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        thread.start();

	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        thread.interrupt();
	    }
	}
