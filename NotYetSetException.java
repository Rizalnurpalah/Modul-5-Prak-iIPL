/**
 * @(#)NotYetSetException.java
 *
 *
 * @author  M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/11/29
 */


public class NotYetSetException extends RuntimeException{

    private Collection<String> messages;

    public BusinessException(String msg){
        super(msg);
    }


    public NotYetSetException(String msg, Exception cause){
        super(msg, cause);
    }


    public NotYetSetException(Collection<String> messages){
        super();
        this.messages= messages;
    }


    public NotYetSetException (Collection<String> messages, Exception cause){
        super(cause);
        this.messages= messages;
    }

    @Override
    public String getMessage(){
        String msg;

        if(this.messages!=null && !this.messages.isEmpty()){
            msg="[";

            for(String message : this.messages){
                msg+=message+",";
            }

            msg= StringUtils.removeEnd(msg, ",")+"]";

        }else msg= super.getMessage();

        return msg;
    }

}