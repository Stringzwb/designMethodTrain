package ChainOfResponsibilityPattern;

import ChainOfResponsibilityPattern.Handler.Handler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

////自制链表版本
//class Node{
//    public Handler handler;
//    public Node next;
//
//    public Node(Handler handler){
//        this.handler = handler;
//        this.next = null;
//    }
//}
//public class ResponsibilityChain {
//    Node head;
//
//    // 接收ArrayList作为参数的构造方法
//    public ResponsibilityChain(ArrayList<Handler> arrayList) {
//        for (Handler data : arrayList) {
//            this.append(data);
//        }
//    }
//
//    // 在链表末尾添加一个新的元素
//    public void append(Handler data) {
//        if (head == null) {
//            head = new Node(data);
//            return;
//        }
//
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = new Node(data);
//    }
//}

public class ResponsibilityChain {
    LinkedList<Handler> handlerList;

    // 接收ArrayList作为参数的构造方法
    public ResponsibilityChain(ArrayList<Handler> handlerArrayList) {
        handlerList = new LinkedList<>(handlerArrayList);
    }



    public boolean audit() {
        Iterator<Handler> iterator = handlerList.iterator();
        while (iterator.hasNext()) {
            Handler handler = iterator.next();
            if (!handler.doHandler()) {
                System.out.println("审核未通过");
                return false;
            }
        }
        System.out.println("审核通过");
        return true;
    }
}
