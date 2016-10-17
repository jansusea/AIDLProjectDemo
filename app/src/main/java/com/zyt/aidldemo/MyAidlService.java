package com.zyt.aidldemo;

import android.os.RemoteException;

/**
 * Created by shu on 2016/10/17.
 */
public class MyAidlService extends IMyAidlInterface.Stub{

    public MyAidlService() {
    }

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

    }

    @Override
    public int hello(int state) throws RemoteException {
        return 1;
    }
}
