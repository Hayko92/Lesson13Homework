package task2;

import java.io.IOException;

public class MyOwnException extends IOException {
    public MyOwnException(String message) {
        super(message);
    }
}
