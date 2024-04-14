package lessons.lesson26;

public enum HttpStatus {

    OK(200,"OK"),
    NOT_FOUND(404,"Not found"),
    INTERNAL_SERVER_ERROR(500, "internal server error");
    //Если чтото с открытием сайта не сработало, то выходит код ошибки
    private final int code;
    private final String message;
    HttpStatus(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
