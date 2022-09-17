package utilityComponents;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	public static final Logger Loge=LogManager.getLogger(Log.class);
	
	public static void info(String msg) {
		Loge.info(msg);
	}
	public static void debug(String msg) {
		Loge.debug(msg);
	}
	public static void error(String msg) {
		Loge.error(msg);
	}

}
