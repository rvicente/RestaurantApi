package pt.capgemini.allanborges.restaurantapi.error;

public class MenuFieldNotAddedException extends Exception{
    public MenuFieldNotAddedException() {
        super();
    }
    public MenuFieldNotAddedException(String message) {
        super(message);
    }
    public MenuFieldNotAddedException(String message, Throwable cause) {
        super(message, cause);
    }
    public MenuFieldNotAddedException(Throwable cause) {
        super(cause);
    }
    protected MenuFieldNotAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
