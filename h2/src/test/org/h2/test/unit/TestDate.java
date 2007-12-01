package org.h2.test.unit;

import java.sql.SQLException;

import org.h2.constant.ErrorCode;
import org.h2.test.TestBase;
import org.h2.util.DateTimeUtils;
import org.h2.value.Value;

public class TestDate extends TestBase {

    public void test() throws Exception {
        for (int year = 1970; year < 2070; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day < 29; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        test(year, month, day, hour);
                    }
                }
            }
        }
    }

    private void test(int year, int month, int day, int hour) throws SQLException {
        DateTimeUtils.parseDateTime(year + "-" + month + "-" + day + " " + hour + ":00:00", Value.TIMESTAMP, ErrorCode.TIMESTAMP_CONSTANT_2);
    }


}
