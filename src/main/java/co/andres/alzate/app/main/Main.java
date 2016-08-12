package co.andres.alzate.app.main;

import org.apache.log4j.Logger;
import org.apache.spark.api.java.*;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.function.Function;
import static spark.Spark.*;


/**
 * Created by afprog on 8/08/16.
 */
public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        logger.info("########################## App Started #######################");
        int port = getHerokuAssignedPort();
        logger.info("Port found" + port);
        port(port);
        get("/hello", (req, res) -> "Hello Heroku World");
    }

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}
