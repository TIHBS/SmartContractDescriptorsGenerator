package €packageName€.client_application.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.google.common.base.Strings;

public class TimeUtils {

    public static LocalDateTime getTimestampObject(String isoTimestamp) {
        if (!Strings.isNullOrEmpty(isoTimestamp)) {
            return LocalDateTime.parse(isoTimestamp, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        }

        return null;
    }
}
