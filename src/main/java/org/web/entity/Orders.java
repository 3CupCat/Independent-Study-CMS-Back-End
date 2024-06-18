package org.web.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String orderNum;
    private LocalDateTime orderDate;
    private Integer totalAmount;
    private String qrcode;
    private Integer userId;

    public Orders() {
    }

    public Orders(Integer id, String orderNum, LocalDateTime orderDate, Integer totalAmount, String qrcode, Integer userId) {
        this.id = id;
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.qrcode = qrcode;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", qrcode='" + qrcode + '\'' +
                ", userId=" + userId +
                '}';
    }
}
