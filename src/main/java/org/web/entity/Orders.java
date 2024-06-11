package org.web.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String orderNum;
    private LocalDateTime orderDate;
    private Integer totalAmount;
    private String qrcode;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users users;

    public Orders() {
    }

    public Orders(Integer orderId, String orderNum, LocalDateTime orderDate, Integer totalAmount, String qrcode, Users users) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.qrcode = qrcode;
        this.users = users;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderNum='" + orderNum + '\'' +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", qrcode='" + qrcode + '\'' +
                ", users=" + users +
                '}';
    }
}