package com.java设计模式.a_创建型.d_建造者模式;

import com.arithmetic.util.Log;

/**
 * Created by malei on 2016/12/5.
 */
public class HuaweiCompany {
    private String ceo;
    private String cto;
    private String cao;

    /*构造方法中持有建造者对象
    * 导演：管理建造出来的实例的依赖关系。*/
    public HuaweiCompany(CompanyBuilder builder){
        this.ceo = builder.ceo;
        this.cto = builder.cto;
        this.cao = builder.cao;
    }

    /*需要被构建的对象只提供 getter 方法*/
    public String getCeo(){
        return ceo;
    }
    public String getCto() {
        return cto;
    }
    public String getCao() {
        return cao;
    }

    /*建造者作为静态内部类使用
    * 建造者：创建和提供实例*/
    public static class CompanyBuilder{
        private String ceo;
        private String cto;
        private String cao;

        /*按需为建造者提供不同的构造方法*/
        public CompanyBuilder(String ceo){
            this.ceo = ceo;
        }
        public CompanyBuilder(){
        }

        /*返回被构建的对象*/
        public HuaweiCompany build(){
            return new HuaweiCompany(this);
        }

        /*只提供 setter 方法*/
        public CompanyBuilder setCeo(String ceo) {
            this.ceo = ceo;
            return this;
        }

        public CompanyBuilder setCto(String cto) {
            this.cto = cto;
            return this;
        }

        public CompanyBuilder setCao(String cao) {
            this.cao = cao;
            return this;
        }
    }

    private void say() {
        Log.show("ceo="+ceo + "\ncto="+cto+"\ncao="+cao);
    }

    public static void main(String[] args){
        HuaweiCompany buidler = new CompanyBuilder()
                .setCeo("马磊")
                .setCto("马云")
                .setCao("马化腾").build();
        buidler.say();
    }
}
