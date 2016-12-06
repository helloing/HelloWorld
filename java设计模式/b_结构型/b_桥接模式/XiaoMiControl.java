package com.java设计模式.b_结构型.b_桥接模式;

/**
 * Created by malei on 2016/12/5.
 * 小米遥控器
 */
public class XiaoMiControl extends AbstractControl{

    public XiaoMiControl(ITV ITV) {
        super(ITV);
    }

    public void setChannelKey(int channel) {
        System.out.println("AbstractControlImpl设置频道");
        setChannel(channel);
    }
}
