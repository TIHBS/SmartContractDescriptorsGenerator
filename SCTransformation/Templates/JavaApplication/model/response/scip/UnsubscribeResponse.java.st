package €packageName€.client_application.model.response.scip;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class UnsubscribeResponse extends AbstractScipResponse {
    protected Boolean isSuccess;
    protected String isoTimestamp;
}
