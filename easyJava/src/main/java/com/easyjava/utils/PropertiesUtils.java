package com.easyjava.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PropertiesUtils {
    private static Properties props = new Properties();
    private static Map<String,String> PROPER_MAP  = new ConcurrentHashMap();


    static {
        InputStream is = null;
        try {

            is = PropertiesUtils.class.getClassLoader().getResourceAsStream("application.properties");


            props.load(is);

            Iterator<Object> iterator = props.keySet().iterator();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();

                PROPER_MAP.put(key, props.getProperty(key));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getString(String key) {
        return PROPER_MAP.get(key);
    }

}
