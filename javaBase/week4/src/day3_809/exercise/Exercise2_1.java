package day3_809.exercise;

public class Exercise2_1 {
    public static void main(String[] args) {
        //思考:如果是一首词该如何旋转输出：
        // 十年生死两茫茫，不思量，自难忘。
        // 千里孤坟，无处话凄凉。
        // 纵使相逢应不识，尘满面，鬓如霜。
        // 夜来幽梦忽还乡，小轩窗，正梳妆。
        // 相顾无言，惟有泪千行。
        // 料得年年肠断处，明月夜，短松冈。
        char[][] ci = {
                {'十','年','生','死','两','茫','茫','，','不','思','量','，','自','难','忘','。'},
                {'千','里','孤','坟','，','无','处','话','凄','凉','。'},
                {'纵','使','相','逢','应','不','识','，','尘','满','面','，','鬓','如','霜','。'},
                {'夜','来','幽','梦','忽','还','乡','，','小','轩','窗','，','正','梳','妆','。'},
                {'相','顾','无','言','，','惟','有','泪','千','行','。'},
                {'料','得','年','年','肠','断','处','，','明','月','夜','，','短','松','冈','。'}
        };
        //找出ci[i]的最大长度(因为二维可以定义不同长度的数组，所以需要找到最长的，才能翻转)
        int k = 0;
        for (char[] chars : ci) {
            for (int j = 0; j < chars.length; j++) {
                if (j + 1 > k) {
                    k++;
                }
            }
        }
        System.out.println(k);
        for (int i = 0; i <k; i++) {
            for (int j =ci.length-1; j >= 0; j--) {
                if(i<ci[j].length){
                    System.out.print("\t" + ci[j][i] + "\t");
                }else{
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
//        char[][] ci1=new char[k][ci.length];
//        for (int i = 0; i < ci.length; i++) {
//            for (int j = 0; j < ci[i].length; j++) {
//                ci1[j][ci.length-1-i]=ci[i][j];
//            }
//        }
//        for (char[] r : ci1) {
//            for (char c : r) {
//                System.out.print(c+"\t");
//            }
//            System.out.println();
//        }
    }
}
