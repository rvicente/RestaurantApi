package pt.capgemini.allanborges.restaurantapi.entity;

import org.springframework.http.HttpStatus;

import java.util.Objects;

public class ErrorMessage {

    private HttpStatus status;
    private String msg;

    public ErrorMessage() {
    }
    public ErrorMessage(HttpStatus status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "status=" + status +
                ", message='" + msg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorMessage that = (ErrorMessage) o;
        return status == that.status && msg.equals(that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, msg);
    }
}
