package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class happy extends mood {

    public happy() {
        Date init_date = new Date();
        this.date = init_date;
    }

    public happy(Date init_date) {
        this.date = init_date;
    }

    public void setDate(Date new_date){
        this.date = new_date;
    }

    public Date getDate(){
        return this.date;
    }

    public String returnMood(){
        return String.format("%s", this.getClass().getSimpleName());

    }
}
