package br.com.joaopaulobuzatto.picpaydesafiobackend.model;

public record Authorization(
        String message) {

    public boolean isAuthorized() {
        return message.equals("Autorizado");
    }
}
