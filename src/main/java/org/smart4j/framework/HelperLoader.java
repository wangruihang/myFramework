package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

/**
 * Created by hp- on 2016/3/9.
 */
public final class HelperLoader {
    public static void init(){
        Class<?>[] classeList = {
                ClassHelper.class , BeanHelper.class , IocHelper.class , ControllerHelper.class
        };
        for (Class<?> cls : classeList){
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
