package com.xemoo.formatter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class MinuteDateSerializer extends JsonSerializer<Date>
{
    /**
     * @Fields FORMATTER : 标准日期时间格式化器
     */
    private DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Override
    public void serialize(Date value, JsonGenerator jgen,
            SerializerProvider provider) throws IOException,
            JsonProcessingException
    {
        jgen.writeString(formatter.format(value));
    }
}
