package br.com.victor.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.victor.gestao_vagas.exceptions.JobNotFountException;
import br.com.victor.gestao_vagas.exceptions.UserNotFountException;
import br.com.victor.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.victor.gestao_vagas.modules.candidate.entity.ApplyJobEntity;
import br.com.victor.gestao_vagas.modules.candidate.repository.ApplyJobRepository;
import br.com.victor.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;

  @Autowired
  private JobRepository jobRepository;

  @Autowired
  private ApplyJobRepository applyJobRepository;

  public ApplyJobEntity execute(UUID idCandidate, UUID idJob) {

    this.candidateRepository.findById(idCandidate)
        .orElseThrow(() -> {
          throw new UserNotFountException();
        });

    this.jobRepository.findById(idJob)
        .orElseThrow(() -> {
          throw new JobNotFountException();
        });

    var apllyJob = ApplyJobEntity.builder()
        .candidateId(idCandidate)
        .jobId(idJob).build();

    apllyJob = this.applyJobRepository.save(apllyJob);

    return apllyJob;
  }
}
