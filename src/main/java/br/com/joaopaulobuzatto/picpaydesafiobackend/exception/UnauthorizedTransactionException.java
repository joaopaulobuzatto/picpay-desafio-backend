package br.com.joaopaulobuzatto.picpaydesafiobackend.exception;

public class UnauthorizedTransactionException extends RuntimeException {

    public UnauthorizedTransactionException(String message) {
        super(message);
    }

}
