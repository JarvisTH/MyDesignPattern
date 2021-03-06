package com.jarvis.design.creational.singleton;


import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/5 16:11
 */
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    private ContainerSingleton() {

    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
