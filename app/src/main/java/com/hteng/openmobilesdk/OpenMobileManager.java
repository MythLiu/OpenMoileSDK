package com.hteng.openmobilesdk;

/**
 * Created by jimmyzhang on 16/5/16.
 */
public class OpenMobileManager {

    private OpenMobileManager (){}

    private static OpenMobileManager instance;

    public synchronized static OpenMobileManager getInstance(){
        if(null == instance){
            instance = new OpenMobileManager();
        }
        return instance;
    }

    /**
     * 是否支持openMobileApi
     * @return
     */
    public boolean isOpenMobileSupport(){

        try {
            Class.forName("org.simalliance.openmobileapi.SEService");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
