package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by hp- on 2016/3/9.
 */
public class Handler {
    /**
     * controller¿‡
     */
    private Class<?> controllerClass;
    /**
     * action∑Ω∑®
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}















