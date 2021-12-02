import java.util.Arrays;

/** 1.	Пришло время отправлять и получать секретные сообщения.
 Создайте две функции, которые принимают строку и массив и возвращают закодированное или декодированное сообщение.
 Первая буква строки или первый элемент массива представляет собой символьный код этой буквы. Следующие элементы-это различия между символами: например, A +3 --> C или z -1 --> y.

 Пример:
 encrypt("Hello") ➞ [72, 29, 7, 0, 3]
 // H = 72, the difference between the H and e is 29 (upper- and lowercase).
 // The difference between the two l's is obviously 0.

 decrypt([ 72, 33, -73, 84, -12, -3, 13, -13, -68 ]) ➞ "Hi there!"

 encrypt("Sunshine") ➞ [83, 34, -7, 5, -11, 1, 5, -9]
 **/

public class Task_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(decrypt(new int [] {83, 34, -7, 5, -11, 1, 5, -9}));
    }

    public static int[] encrypt(String str){
        int[] numStr = new int[str.length()];
        char[] ch = str.toCharArray();
        numStr[0] =  ch[0];
        for (int i=0; i < numStr.length-1;i++)
            numStr [i+1] = ch[i+1] - ch [i];
        return numStr;
    }
    public static String decrypt(int[] numStr){
        String str=""+(char) numStr[0];
        int meh=numStr[0];
        for (int i = 0 ; i < numStr.length-1; i++) {
            meh += numStr[i + 1];
            str += (char) meh;
        }
        return str;
    }
}