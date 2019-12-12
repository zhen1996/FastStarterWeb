package com.summer.faststarter.model.response;

import java.io.Serializable;

/**
 * 此类体现返回时候的错误编码和错误类型
 */
public class ResultInfo implements Serializable {
    private static final long serialVersionUID = -959308244046650159L;
    private int retcode;
    private String retdesc;
    private String subretcode;
    private String subretdesc;

    public ResultInfo() {
    }

    public ResultInfo(int retcode, String retdesc) {
        this.retcode = retcode;
        this.retdesc = retdesc;
    }

    public ResultInfo(int retcode, String retdesc, String subretcode, String subretdesc) {
        this.retcode = retcode;
        this.retdesc = retdesc;
        this.subretcode = subretcode;
        this.subretdesc = subretdesc;
    }

    public int getRetcode() {
        return retcode;
    }

    public void setRetcode(int retcode) {
        this.retcode = retcode;
    }

    public String getRetdesc() {
        return retdesc;
    }

    public void setRetdesc(String retdesc) {
        this.retdesc = retdesc;
    }

    public String getSubretcode() {
        return subretcode;
    }

    public void setSubretcode(String subretcode) {
        this.subretcode = subretcode;
    }

    public String getSubretdesc() {
        return subretdesc;
    }

    public void setSubretdesc(String subretdesc) {
        this.subretdesc = subretdesc;
    }
}
