
package org.javacore.Exception;
public class ObjectNotfoundException extends RuntimeException {
    public ObjectNotfoundException(String msg,Throwable cause){
        super(msg,cause);
    }
    public ObjectNotfoundException(String msg){
        super(msg);
    }
}


