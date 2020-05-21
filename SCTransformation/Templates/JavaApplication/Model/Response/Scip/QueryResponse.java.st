package €packageName€.model.response.scip;

import java.util.List;

import €packageName€.model.common.Occurrence;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class QueryResponse {
    List<Occurrence> occurrences;
}
