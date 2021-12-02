/**9.	Напишите функцию, которая принимает строку и возвращает строку с правильным регистром для заголовков символов в серии "Игра престолов".
 Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь первый символ в верхнем регистре, а остальные-в Нижнем.

 Пример:
 correctTitle("jOn SnoW, kINg IN thE noRth.")
 ➞ "Jon Snow, King in the North."

 correctTitle("sansa stark, lady of winterfell.")
 ➞ "Sansa Stark, Lady of Winterfell."

 correctTitle("TYRION LANNISTER, HAND OF THE QUEEN.")
 ➞ "Tyrion Lannister, Hand of the Queen."

 Примечания:
 – Знаки препинания и пробелы должны оставаться в своих первоначальных положениях.
 – Дефисные слова считаются отдельными словами.
 – Будьте осторожны со словами, которые содержат and, the, of или in.
 **/
public class Task_9 {
    public static void main(String[] args) {
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
    }
    public static StringBuilder correctTitle(String str){
        String[] strs = str.split(" ");
        StringBuilder STB= new StringBuilder();
        for(int i=0;i<strs.length; i++){
            strs[i]=strs[i].toLowerCase();
            if(strs[i].equals("and") || strs[i].equals("the") || strs[i].equals("of") || strs[i].equals("in")){
                STB.append(strs[i]+" ");
            }else STB.append(strs[i].toUpperCase().charAt(0)+strs[i].substring(1)+ " ");
        }
        return STB;
    }
}
