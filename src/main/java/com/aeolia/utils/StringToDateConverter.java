package com.aeolia.utils;

import org.springframework.core.convert.converter.Converter;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 字符串转日期格式的转换器
 */
public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (s != null && !"".equals(s)) {
            try {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else {
            throw new RuntimeException("传入数据为空");
        }
    }
}
