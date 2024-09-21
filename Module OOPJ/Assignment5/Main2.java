package assignment5_2;

class Logger{
	public String logger;
	private static int instancenum = 0;
	
	public Logger() {
		instancenum++;
	}
	
	public int getInstance() {
		return instancenum;
	}
	
	public void log(String message){
		this.logger=message;
		//System.out.println(this.logger);
	}

	public String getLog() {
		return this.logger;
	}
	
	public void clearLog() {
		this.logger = " ";
	}
}

public class Main2 {

	public static void main(String[] args) {
		Logger log = new Logger();
		
		System.out.println("number of instances "+log.getInstance());
		log.getInstance();
		log.log("Hello");
		System.out.println("log message is "+log.getLog());
		log.clearLog();

	}

}
