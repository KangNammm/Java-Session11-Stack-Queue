package BT;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Queue sử dụng LinkedList
        Queue<String> queue = new LinkedList<>();

        // Thêm các phần tử vào queue từ danh sách đầu vào
        queue.add("Phần tử 1");
        queue.add("Phần tử 2");
        queue.add("Phần tử 3");

        // In ra danh sách các phần tử trong queue
        System.out.println("Các phần tử trong queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
