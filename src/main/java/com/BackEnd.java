/**
 *@author
 *LI_Yichen
 *ID: 16130120145
 *e-mail: niuqiao2010@163.com
 */


package com;

public class BackEnd {

    TicketCollection List;

    BackEnd(){
        List = new TicketCollection();
    }

    public TicketCollection getTicketCollection(String SCity, String TCity, String date){
        return List;
    }

    public boolean checkPayment(String price, String pay){
        return true;
    }

    public boolean checkCity(String city){
        if(city.equals("北京") || city.equals("上海"))
            return true;
        else return false;
    }

    public void purchace(String ID, String date){}

    public boolean checkNum(String ID, String date){return true;}
}
