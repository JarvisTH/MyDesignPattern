package com.jarvis.design.principle.singleREsponsbility;

/**
 * @author Jarvis(Tang Hui)
 * @version 1.0
 * @date 2020/5/3 15:19
 */
public class Method {

    private void updateUserInfo(String username,String address){
        username="xxx";
        address="ssss";
    }

    private void updateUserInfo(String userName,String... properties){
        userName="xxx";
    }

    private void updateUserName(String username){
        username="xxx";
    }

    private void updateUserAddress(String address){
        address="xxx";
    }

    private void updateUserInfo(String username,String address,boolean bool){
       if(bool){
           // todo1
       }else {
           // todo2
       }
    }

}
