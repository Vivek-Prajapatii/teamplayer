package com.teamplayer.teamplayer.entities;

public class Result {
    
    private String result;
    private String message;

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(){
        super();
    }

    public Result(String result, String message)
    {
        super();
        this.result = result;
        this.message = message;
    }

}
