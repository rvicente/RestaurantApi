package pt.capgemini.allanborges.restaurantapi.entity;

import java.util.List;
import java.util.Objects;

public class ResponseMenu {

    private String status;
    private String sentOn;
    private String statusCode;
    private String transactionId;
    private String msg;
    private List<Menu> resValues;

    public ResponseMenu() {
    }
    public ResponseMenu(String status, String sentOn, String statusCode, String transactionId, String msg, List<Menu> resValues) {
        this.status = status;
        this.sentOn = sentOn;
        this.statusCode = statusCode;
        this.transactionId = transactionId;
        this.msg = msg;
        this.resValues = resValues;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getSentOn() {
        return sentOn;
    }
    public void setSentOn(String sentOn) {
        this.sentOn = sentOn;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<Menu> getResValues() {
        return resValues;
    }
    public void setResValues(List<Menu> resValues) {
        this.resValues = resValues;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", sentOn='" + sentOn + '\'' +
                ", statusCode=" + statusCode +
                ", transactionId='" + transactionId + '\'' +
                ", msg='" + msg + '\'' +
                ", resValues=" + resValues +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseMenu responseMenu = (ResponseMenu) o;
        return status.equals(responseMenu.status) && sentOn.equals(responseMenu.sentOn) && statusCode.equals(responseMenu.statusCode) && transactionId.equals(responseMenu.transactionId) && msg.equals(responseMenu.msg) && resValues.equals(responseMenu.resValues);
    }
}