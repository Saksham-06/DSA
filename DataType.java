public class DataType {
    public static int dataType(String str){
//        if(str.equals("Integer")){
//            return Integer.SIZE / 8;
//
//        }else if(str.equals("Double")){
//            return Double.SIZE / 8;
//        }else if(str.equals("Byte")){
//            return Byte.SIZE / 8;
//        }
//        else if(str.equals("Character")){
//            return Character.SIZE / 8;
//        }else if(str.equals("Short")){
//            return Short.SIZE / 8;
//        }else if(str.equals("Long")){
//            return Long.SIZE / 8;
//        }else if(str.equals("Float")){
//            return Float.SIZE / 8;
//        }
//        return -1;

        // we can also use switch case as we are checking for same str with multiple values
        //better solution
        if(str.charAt(0) == 'C'){
            return 1;
        }else if(str.charAt(0) == 'I' || str.charAt(0) == 'F'){
            return 4;
        }else{
            return 8;
        }
    }


    public static void main(String[] args) {
        System.out.println(Character.SIZE / 8);
    }
}
