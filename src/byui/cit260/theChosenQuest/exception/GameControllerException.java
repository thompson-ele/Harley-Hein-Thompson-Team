/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theChosenQuest.exception;

/**
 *
 * @author 0249239
 */
public class GameControllerException extends Exception {

    public GameControllerException() {
    }

    public GameControllerException(String message) {
        super(message);
    }

    public GameControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControllerException(Throwable cause) {
        super(cause);
    }

    public GameControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
