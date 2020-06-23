package €packageName€.client_application.model.input;

import €packageName€.client_application.model.common.TimeFrame;
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
public class QueryInput {
    String filter;
    TimeFrame timeFrame;
}
