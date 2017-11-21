package cn.test.app;

import cn.test.dao.SessionFactory;

public class Controller {

    public void Home(){

        SessionFactory.getSqlSession();
    }
}
