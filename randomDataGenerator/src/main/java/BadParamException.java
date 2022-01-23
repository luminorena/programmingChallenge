public class BadParamException extends Exception {
    private final int value;
    public int getParam(){
        return value;
    }
    public BadParamException(String message, int Param){
        super(message);
        value=Param;
    }

}
