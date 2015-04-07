package com.xemoo.formatter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * @ClassName: ISOLongDateSerializer
 * @Description: 标准长日期时间JSON序列化器
 * @author tangtianyun
 * @date 2013-12-10 下午07:18:36
 * @version 1.0
 */
public class ISOLongDateSerializer extends JsonSerializer<Date>
{
    /**
     * @Fields FORMATTER : 标准日期时间格式化器
     */
    private final DateFormat FORMATTER = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss");

    @Override
    public void serialize(Date value, JsonGenerator jgen,
            SerializerProvider provider) throws IOException,
            JsonProcessingException
    {
        jgen.writeString(FORMATTER.format(value));
    }

}
