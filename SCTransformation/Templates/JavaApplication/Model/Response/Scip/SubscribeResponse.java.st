package €packageName€.model.response.scip;

import java.util.List;

import €packageName€.model.common.Parameter;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class SubscribeResponse extends AbstractScipResponse {
    protected List<Parameter> parameters;
    protected String isoTimestamp;
}
