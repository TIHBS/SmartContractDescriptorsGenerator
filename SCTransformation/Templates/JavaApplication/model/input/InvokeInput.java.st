package €packageName€.client_application.model.input;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class InvokeInput {
    Double degreeOfConfidence;
}
