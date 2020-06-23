package €packageName€.client_application.model.common;

import java.time.LocalDateTime;

import €packageName€.client_application.utils.TimeUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TimeFrame {
    private String from;
    private String to;

    @JsonIgnore
    public LocalDateTime getFromLocalDateTime() {
        return TimeUtils.getTimestampObject(from);
    }

    @JsonIgnore
    public LocalDateTime getToLocalDateTime() {
        return TimeUtils.getTimestampObject(to);
    }
}
