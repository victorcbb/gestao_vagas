package br.com.victor.gestao_vagas.exceptions;

public class UserNotFountException extends RuntimeException {
  public UserNotFountException() {
    super("Usuário não existe");
  }
}
