//public class Functions {
//    public static void main(String[] args) {
////        StringBuilder sb=new StringBuilder("Tony");
////        System.out.println(sb);
//////        char at index 0
////        System.out.println(sb.charAt(0));
//////        set char at 0
////        sb.setCharAt(0,'p');
////        System.out.println(sb);
////
//////        to insert
////        sb.insert(0,"s");
////        System.out.println(sb);
////
//////        to insert at 2
////        sb.insert(3,'n');
////        System.out.println(sb);
//////        to delete extra n
////        sb.delete(3,4);
////        System.out.println(sb);
////
//////        to append the string
////        sb.append("S");
////        sb.append("t");
////        sb.append("a");
////        sb.append("r");
////        sb.append("k");
////        System.out.println(sb);
////        System.out.println(sb.length());
//
//// reversing a string
//        StringBuilder sb=new StringBuilder("Hello");
//        for(int i=0;i<sb.length()/2;i++){
//            int front = i;
//            int back=sb.length()-1-i;
//            char frontChar=sb.charAt(front);
//            char backChar=sb.charAt(back);
//            sb.setCharAt(front,backChar);
//            sb.setCharAt(back,frontChar);
//            System.out.println(sb);
//        }
//    }
//}


class Box{
    double height;
    double width;
    double depth;

    Box(){
        height=0;
        width=0;
        depth=0;
    }

    Box(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }

    Box(Box b){
        height=b.height;
        width=b.width;
        depth=b.depth;
    }

    double volume(){
        return height * width * depth;
    }
}

public class Functions {
    public static void main(String[] args){
        Box box1 = new Box();
        System.out.println("Volume of Box1: " + box1.volume());
        Box box2 = new Box(10, 5, 2);
        System.out.println("Volume of Box2: " + box2.volume());
        Box box3 = new Box(box2);
        System.out.println("Volume of Box3: " + box3.volume());
    }
}

































