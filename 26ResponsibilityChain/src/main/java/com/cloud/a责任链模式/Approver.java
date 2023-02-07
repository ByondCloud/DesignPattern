package com.cloud.a责任链模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/2/7
 * @Time 20:34
 */
public abstract class Approver {

    Approver approver; // 下一个处理者

    String name;

    public Approver(String name) {
        this.name = name;
    }

    // 下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    // 处理审批请求的方法，得到一个请求，处理是子类完成
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
