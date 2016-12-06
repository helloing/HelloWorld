package com.java设计模式.b_结构型.a_适配器模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/5.
 * 二相转三相的适配器(Adapter)
 */
public class Adapter_2to3 extends GBTwoPlug implements ThreePlug{

    @Override
    public void powerwith3() {
        Log.show("适配器启动");
        this.powerwith2();
    }
}
