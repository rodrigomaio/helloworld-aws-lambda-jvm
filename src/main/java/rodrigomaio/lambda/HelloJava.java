package rodrigomaio.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class HelloJava {

    public String myHandler(String data, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("received in java: " + data);
        return data;
    }

}
