package com.wildlife.park.common.utils;

import com.wildlife.park.common.constant.DateConstants;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author yan
 * @desc LocalDateUtils
 * @date 2020/4/11
 */
public class LocalDateUtils {
    public static LocalDate parseToLocalDate(String date){
        final LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(DateConstants.DATE_MM_DD_YYYY));
        return localDate;
    }
}
