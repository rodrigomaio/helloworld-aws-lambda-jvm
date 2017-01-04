package rodrigomaio.lambda

import com.amazonaws.services.lambda.runtime.Context

class HelloGroovy {

    String myHandler(data, Context context) {
        context.logger.log "received in groovy: $data"
        "Hello ${data}"
    }

}
