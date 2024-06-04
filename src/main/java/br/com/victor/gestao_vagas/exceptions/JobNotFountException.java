package br.com.victor.gestao_vagas.exceptions;

public class JobNotFountException extends RuntimeException {
  public JobNotFountException() {
    super("Vaga não encontrada.");
  }
}
