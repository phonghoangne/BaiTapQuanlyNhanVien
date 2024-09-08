
package org.javacore.Exception;
public class QLNVExceptionException extends RuntimeException {
    public QLNVExceptionException(String msg, Throwable cause){
        super(msg,cause);
    }
    public QLNVExceptionException(String msg){
        super(msg);
    }
}


