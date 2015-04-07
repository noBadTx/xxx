package com.xemoo.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>
{

    public Date convert(String source)
    {
        if (source == null || "".equals(source))
        {
            return null;
        }
        SimpleDateFormat dateFormat = null;
        if (source.matches("^\\d{4}-\\d{2}-\\d{2}$"))
        {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        }
        else if (source.matches("^\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}$"))
        {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        }
        else
        {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        dateFormat.setLenient(false);
        try
        {
            // source = URLDecoder.decode(source, "utf-8");
            return dateFormat.parse(source);
        }
        catch(ParseException e)
        {
            e.printStackTrace();
        }
        // catch(UnsupportedEncodingException e)
        // {
        // e.printStackTrace();
        // }
        return null;
    }
}