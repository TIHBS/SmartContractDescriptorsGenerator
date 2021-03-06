package €packageName€.client_application.model.response.scip;

import java.util.List;

import €packageName€.client_application.model.common.Occurrence;
import €packageName€.client_application.model.common.Parameter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class GenericResponseMessage {
    private String correlationIdentifier;
    private List<Parameter> parameters;
    private String isoTimestamp;
    private List<Occurrence> occurrences;
    private Integer errorCode;
    private String errorMessage;
    private String transactionHash;
    private Double reachedDoC;

    public String toString() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
