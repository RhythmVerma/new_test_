public class Functions {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder("Tony");
//        System.out.println(sb);
////        char at index 0
//        System.out.println(sb.charAt(0));
////        set char at 0
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
////        to insert
//        sb.insert(0,"s");
//        System.out.println(sb);
//
////        to insert at 2
//        sb.insert(3,'n');
//        System.out.println(sb);
////        to delete extra n
//        sb.delete(3,4);
//        System.out.println(sb);
//
////        to append the string
//        sb.append("S");
//        sb.append("t");
//        sb.append("a");
//        sb.append("r");
//        sb.append("k");
//        System.out.println(sb);
//        System.out.println(sb.length());

// reversing a string
        StringBuilder sb=new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back=sb.length()-1-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
            System.out.println(sb);
        }
    }
}
