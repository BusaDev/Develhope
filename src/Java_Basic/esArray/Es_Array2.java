public class Es_Array2 {
    public static void main(String args[]) {
        char[] chars = array();
        char find = 'e';
        System.out.println(finder(chars, find));
    }
    public static char[] array (){
        char[] chars = new char[5];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';
        return chars;
    }
    public static int finder (char[] chars , char find){
        int f = 1;
        int i = 0;
        for (char c : chars){
            if(c == find){
                f += i;
            }
            i++;
        }
        return f;
    }
}