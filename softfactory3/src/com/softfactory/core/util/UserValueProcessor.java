package com.softfactory.core.util;



import com.softfactory.pojo.User;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * 输出 JSON 用户值时 格式化转换
 * 
 * @author SONG
 * 
 */
public class UserValueProcessor implements JsonValueProcessor {
  public UserValueProcessor() {

  }

  public Object processArrayValue(Object value, JsonConfig config) {
    return process(value);
  }

  public Object processObjectValue(String key, Object value, JsonConfig config) {
    return process(value);
  }

  private Object process(Object value) {
    if (value instanceof User) {
      return ((User) value).getUsername();
    }
    return value == null ? "" : value.toString();
  }

}
