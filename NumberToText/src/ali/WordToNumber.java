package ali;

import java.util.HashMap;
import java.util.Map;

public class WordToNumber {
//    public static void main(String[] args) {
//        String word = "دویست و بیست و دو";
//        String[] words = word.split(" و ");
//
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//        }
//    }
public static void main(String[] args) {
    Map<String, Integer> yekan = new HashMap<>() {{
        put("یک", 0);
        put("دو", 1);
        put("سه", 2);
        put("چهار", 3);
        put("پنج", 4);
        put("شش", 5);
        put("هفت", 6);
        put("هشت", 7);
        put("نه", 8);
        put("ده", 9);
    }};
    Map<String, Integer> twoDigit = new HashMap<>() {{
        put("یازده", 11);
        put("دوازده", 12);
        put("سیزده", 13);
        put("چهارده", 14);
        put("پانزده", 15);
        put("شازنده", 16);
        put("هفده", 17);
        put("هجده", 18);
        put("نوزده", 19);
    }};
    Map<String, Integer> dahgan = new HashMap<>()
    {{
        put("ده",10);
        put("بیست",20);
        put("سی",30);
        put("چهل",40);
        put("پنجاه",50);
        put("شصت",60);
        put("هفتاد",70);
        put("هشتاد",80);
        put("نود",90);

    }};
    Map<String,Integer> sadgan = new HashMap<>()
    {{
        put("صد",100);
        put("دویست",200);
        put("سیصد",300);
        put("چهارصد",400);
        put("پانصد",500);
        put("شانصد",600);
        put("هفتصد",700);
        put("هشتصد",800);
        put("نهصد",900);
    }};

    String word = "دویست و بیست و دو";
    String[] words = word.split(" و ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
}



}
