package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by hp- on 2016/3/8.
 */
public final class StringUtil {
    public static boolean isEmpty(String str){
        if (str!= null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    public static String[] splitString(String target,String by){
        String[] arr;
        arr = StringUtils.split(target,by);
        return arr;
    }

}
