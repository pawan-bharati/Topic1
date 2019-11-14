package com.example.topic1;

import android.widget.TextView;

public class Gridclass {
    private int First,Second;
    private TextView tvdisp;



    public void setTvdisp(TextView tvdisp) {
        this.tvdisp = tvdisp;
    }

    public void setFirst(int first) {
        First = first;
    }

    public void setSecond(int second) {
        Second = second;
    }

    public int addres(){
        int result = (First+Second);
        return result;
    }
    public int subres(){
        int result = (First-Second);
        return result;
    }
    public int mulres(){
        int result = (First*Second);
        return result;
    }
    public int divres(){
        int result = (First/Second);
        return result;
    }

    public String  foradd(){
       return (First + "+" + Second);
    }
    public String  forsub(){
        return (First + "-" + Second);
    }
    public String  formul(){
        return (First + "*" + Second);
    }
    public String  fordiv(){
        return (First + "/" + Second);
    }
}
