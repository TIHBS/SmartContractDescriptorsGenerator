package €packageName€.client_application.model.request.scip;

import €packageName€.client_application.model.common.Parameter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@SuperBuilder
public class UnsubscriptionRequestMessage extends AsyncScipRequestMessage {
    protected String functionIdentifier;
    protected String eventIdentifier;
    protected Double degreeOfConfidence;
    protected String filter;
    protected List<Parameter> parameters;
}
