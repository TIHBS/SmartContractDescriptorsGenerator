package €packageName€.client_application.controller.€contractPackageName€.parameter;

import €packageName€.client_application.model.input.InvokeInput;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class €functionParameterName€Parameter extends InvokeInput {
     €parameterarray:{it|private String €it€;};separator="\n"€
}
