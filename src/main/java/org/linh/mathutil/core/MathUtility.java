package org.linh.mathutil.core;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MathUtility {

    public static final double PI = 3.1415;

    //hàm tình n! = 1.2.3.4.5. ...n 
    //thiết kế hàm này như sau:
    //0! = 1! = 1 
    //không có giai thừa cho số âm, -1!, -2! => lỗi, ném ra Exception
    //giai thừa tăng nhanh, 21! kiểu long bị tràn 
    // >= 21! ném ra exception 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be 0..20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1;

        for (int i = 2; i < n; i++) {
            product *= i;
        }

        return product;

    }

    //Kĩ thuật TDD - Test Driven Development 
    //Kĩ thuật lập trình đặc biệt được ưa dùng trong Agile 
    //Nó là việc chia hoàn thành app thành các chặn ngắn đều nhau, trung bình là 2 tuần được gọi là sprint 
    //TDD hóa giải việc sprint. Làm gì 
    //TD viết code và các test đan xen nhau 
    //Test case là một bộ data để mô phỏng 1 tình huống dùng app của user và QC được phép dùng trước để xem app chạy đúng hay sai so với kì vọng
    //Vậy nó bao gồm gì: INPUT, OUTPUT (Excepted VALUE), STEPS các bược nhập liệu input data. Click, verify => trả về
}
