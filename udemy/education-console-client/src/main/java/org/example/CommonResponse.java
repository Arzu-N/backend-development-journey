package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class CommonResponse {
private List<StudentResponse> obj;
private String message;
private LocalDateTime datetime;

    public List<StudentResponse> getObj() {
        return obj;
    }

    public CommonResponse setObj(List<StudentResponse> obj) {
        this.obj = obj;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public CommonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public CommonResponse setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
        return this;
    }
}
