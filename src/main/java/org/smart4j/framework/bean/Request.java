package org.smart4j.framework.bean;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by hp- on 2016/3/9.
 */
public class Request {
    /**
     * ���󷽷�
     */
    private String requestMethod;
    /**
     * ����·��
      */
    private String requestPath;
    public Request(String requestMethod,String requestPath){
        this.requestMethod = requestMethod;
        this.requestPath = requestPath;
    }

    public String getRequestMethod(){
        return requestMethod;
    }
    public String getRequestPath(){
        return requestPath;
    }
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(this,obj);
    }

}


































