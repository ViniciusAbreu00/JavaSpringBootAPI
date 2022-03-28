package com.api.javaapi.model.err;

public class ErrorMessage {
    private String title;
    
    private String content;
    
    private Integer errorCode;

    public ErrorMessage(String title, String content, Integer errorCode) {
        this.title = title;
        this.content = content;
        this.errorCode = errorCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }



}
