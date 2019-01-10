package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class mood {

    Date date;

    public mood(){

    }

    public mood(Date init_date){

    }

    public abstract void setDate(Date new_date);

    public abstract Date getDate();

    public abstract String returnMood();

}
