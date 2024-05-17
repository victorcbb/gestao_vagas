package br.com.victor.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

  @Schema(example = "Desenvolvedor Java")
  private String description;

  @Schema(example = "victor")
  private String username;

  @Schema(example = "Victor Barros")
  private String name;

  @Schema(example = "victor@email.com")
  private String email;
  private UUID id;
}
