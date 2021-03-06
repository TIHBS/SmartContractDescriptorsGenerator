package €packageName€.client_application.model.request.scip;

import java.util.List;

import €packageName€.client_application.model.common.Parameter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class SubscriptionRequestMessage extends AsyncScipRequestMessage {
    protected String functionIdentifier;
    protected String eventIdentifier;
    protected Double degreeOfConfidence;
    protected String filter;
    protected List<Parameter> parameters;
}
