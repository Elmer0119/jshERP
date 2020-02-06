package com.jsh.erp.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by jishenghua 2018-5-11 09:48:08
 *
 * @author jishenghua
 */
public class JsonUtils {

    public static JSONObject ok(){
        JSONObject obj = new JSONObject();
        JSONObject tmp = new JSONObject();
        tmp.put("message", "成功");
        obj.put("code", 200);
        obj.put("data", tmp);
        return obj;
    }

    @Slf4j
    @Getter
    public static class BusinessParamCheckingException extends Exception {

        private static final long serialVersionUID = 1L;
        private int code;
        private String reason;

        public BusinessParamCheckingException(int code, String reason) {
            super(reason);
            this.code = code;
            this.reason = reason;
        }

        public BusinessParamCheckingException(int code, String reason, Throwable throwable) {
            super(reason, throwable);
            this.code = code;
            this.reason = reason;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }
}
