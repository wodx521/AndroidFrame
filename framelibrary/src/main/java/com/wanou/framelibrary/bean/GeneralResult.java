package com.wanou.framelibrary.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author wodx521
 * @date on 2018/9/1
 */
public class GeneralResult<T> implements Serializable {
    private static final long serialVersionUID = 154307691161700036L;

    public int code;
    public String msg;
    @SerializedName(value = "data", alternate = {"token", "number"})
    public T data;

    @Override
    public String toString() {
        return "GeneralResult{\n" +//
                "\tcode=" + code + "\n" +//
                "\tmsg='" + msg + "\'\n" +//
                "\tdata=" + data + "\n" +//
                '}';
    }
}
