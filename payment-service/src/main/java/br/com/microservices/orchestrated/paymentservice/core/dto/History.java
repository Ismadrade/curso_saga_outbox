package br.com.microservices.orchestrated.paymentservice.core.dto;

import br.com.microservices.orchestrated.paymentservice.core.enums.ESagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class History {

    private String source;
    private String status;
    private ESagaStatus message;
    private LocalDateTime createdAt;


}
