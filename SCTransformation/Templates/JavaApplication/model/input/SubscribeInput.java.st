package €packageName€.client_application.model.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SubscribeInput {
    String filter;
    String correlationIdentifier;
    Double degreeOfConfidence;
}
