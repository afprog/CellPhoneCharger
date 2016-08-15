package co.andres.alzate.app.Endpoints;


import static spark.Spark.get;
import static spark.Spark.post;

public class CellPhoneRechargeEndpoints {
    public void createCellphoneRechargePost(){
        post("/hello", (req, res) -> "Hello Heroku World");
    }
}
