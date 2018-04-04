package cn.bdqn.util;

import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import lombok.Data;

/**
 * Created by Administrator on 2018/4/2/002.
 */
@Data
public class Message {
    private String code;
    private String msg;
SimpleDateFormatSerializer;
    public static Message success() {
        Message message = new Message();
        message.setCode("0000");
        message.setMsg("操作成功");
        return message;
    }

    public static Message error() {
        Message message = new Message();
        message.setCode("0001");
        message.setMsg("操作失败");
        return message;
    }
}
