public class Es_Switch1 {
    public static void main(String args[]) {
        int day = 8;
        if(day >= 1 && day <= 7){
            System.out.println("oggi è " + week(day));
        }else{
            System.out.println(week(day));
        }
    }
    public static String week (int day){
        String result = "";
        switch (day) {
            case (1) :
                result = "Lunedì";
                break;
            case (2) :
                result = "Martedì";
                break;
            case (3) :
                result = "Mercoledì";
                break;
            case (4) :
                result = "giovedì";
                break;
            case (5) :
                result = "Venerdì";
                break;
            case (6) :
                result = "Sabato";
                break;
            case (7) :
                result = "Domenica";
                break;
        
            default:
                result = "Errore";
                break;
        }
        return result;
    }
}