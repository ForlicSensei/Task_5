import java.util.ArrayList;

/**5.	Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в любом порядке и / или количестве), что и первое слово, включая первое слово.
 Пример:
 sameVowelGroup(["toe", "ocelot", "maniac"]) ➞ ["toe", "ocelot"]

 sameVowelGroup(["many", "carriage", "emit", "apricot", "animal"]) ➞ ["many"]

 sameVowelGroup(["hoops", "chuff", "bot", "bottom"]) ➞ ["hoops", "bot", "bottom"]
 **/
public class Task_5 {
    public static void main(String[] args) {
        System.out.println(sameVowelGroup(new String[] {"toe", "ocelot", "maniac"}));
    }

    public static ArrayList<String> sameVowelGroup(String[] Strings) {
        String[] AlVowels = new String[]{"a", "e", "u", "i", "o"};
        String Vow = "";
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < AlVowels.length; i++) {
            if (Strings[0].contains(AlVowels[i]) && !Vow.contains(AlVowels[i]))
                Vow += AlVowels[i];
        }
        if (Vow == "") {
            return res;
        } else res.add(Strings[0]);
        for (int i = 1; i < Strings.length; i++) {
            boolean check = true;
            for (int j = 0; j < Vow.length(); j++) {
                if (!Strings[i].contains(String.valueOf(Vow.charAt(j))))
                    check=false;
                    break;
            }
            if(check)
            res.add(Strings[i]);
        }
        return res;
    }
}
