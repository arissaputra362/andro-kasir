package com.example.androkasir.Response;

import com.example.androkasir.model.Data_Model;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data_Response {
    @SerializedName("status")
    @Expose
    private Boolean status;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("seluruh_barang")
    @Expose
    private List<Data_Model> seluruh_barang = null;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Data_Model> getSeluruh_barang() {
        return seluruh_barang;
    }

    public void setSeluruh_barang(List<Data_Model> seluruh_barang) {
        this.seluruh_barang = seluruh_barang;
    }

    @Override
    public String toString() {
        return "Data_Response{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", seluruh_barang=" + seluruh_barang +
                '}';
    }
}
