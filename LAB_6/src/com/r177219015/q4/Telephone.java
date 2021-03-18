package com.r177219015.q4;

public class Telephone {
    private String callType;
    private  float duration;



    public void  calDetail(String callType, float duration) {
        this.callType = callType;
        this.duration = duration;
        System.out.println("Type Of Call = "+callType);
        System.out.println("Call Duration = "+duration);
        if (this.callType.equals("ordinary") && (this.duration >= 1 && this.duration <= 20)) {
            System.out.println("Charge  = " + this.duration * 25);
        } else if (this.callType.equals("ordinary") && this.duration >= 20) {
            System.out.println("Charge =" + this.duration * 28);
        } else if (this.callType.equals("urgent") && (this.duration >= 1 && this.duration <= 30)) {
            System.out.println("Charge =  "+this.duration*30);
        } else if (this.callType.equals("urgent") && this.duration >= 20) {
            System.out.println("Charge =" + this.duration * 40);
        }
        else if (this.callType.equals("lightning")&&(this.duration >= 1 && this.duration <= 30)) {
            System.out.println("Charge =" + this.duration * 15);
        }
        else if (this.callType.equals("lightning")&& this.duration <= 30) {
            System.out.println("Charge =" + this.duration * 21);
        }
        else {
            System.out.println("Wrong Input");
        }

    }
    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
