/**3.	Входная строка может быть завершена, если можно добавить дополнительные буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову. Кроме того, порядок букв во входной строке должен быть таким же, как и порядок букв в последнем слове.
 Создайте функцию, которая, учитывая входную строку, определяет, может ли слово быть завершено.

 Пример:
 canComplete("butl", "beautiful") ➞ true
 // We can add "ea" between "b" and "u", and "ifu" between "t" and "l".

 canComplete("butlz", "beautiful") ➞ false
 // "z" does not exist in the word beautiful.

 canComplete("tulb", "beautiful") ➞ false
 // Although "t", "u", "l" and "b" all exist in "beautiful", they are incorrectly ordered.

 canComplete("bbutl", "beautiful") ➞ false
 // Too many "b"s, beautiful has only 1.
 **/
public class Task_3 {
    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful"));
    }
    public static boolean canComplete(String partStr,String FullStr){
        char[] ch= partStr.toCharArray();
        int Search=0;
        for(char chs : ch){
            if(FullStr.indexOf(String.valueOf(chs),Search) != -1){
                Search=FullStr.indexOf(String.valueOf(chs),Search)+1;
            } else return false;
        }
        return true;
    }
}
