/** 10.	Как указано в онлайн-энциклопедии целочисленных последовательностей:
 Гексагональная решетка - это привычная двумерная решетка, в которой каждая точка имеет 6 соседей.
 Центрированное шестиугольное число - это центрированное фигурное число, представляющее шестиугольник с точкой в центре и всеми другими точками, окружающими центральную точку в шестиугольной решетке.

 Illustration of initial terms:
 .
 .                                 o o o o
 .                   o o o        o o o o o
 .         o o      o o o o      o o o o o o
 .   o    o o o    o o o o o    o o o o o o o
 .         o o      o o o o      o o o o o o
 .                   o o o        o o o o o
 .                                 o o o o
 .
 .   1      7          19             37
 .

 Напишите функцию, которая принимает целое число n и возвращает "недопустимое", если n не является центрированным шестиугольным числом или его иллюстрацией в виде многострочной прямоугольной строки в противном случае.

 Пример:
 hexLattice(1) ➞ " o "
 // o

 hexLattice(7) ➞ "  o o  \n o o o \n  o o  "
 //  o o
 // o o o
 //  o o

 hexLattice(19) ➞ "   o o o   \n  o o o o  \n o o o o o \n  o o o o  \n   o o o   "
 //   o o o
 //  o o o o
 // o o o o o
 //  o o o o
 //   o o o

 hexLattice(21) ➞ "Invalid"
 **/
public class Task_10 {
    public static void main(String[] args) {
        System.out.println(hexLattice(19));
    }
    public static String hexLattice(int dot){
        int num = 1;
        int i = 1;
        String res = "";
        while (dot > num) {
            i++;
            num = 3 * i * (i - 1) + 1;
        }
        int l = i;
        if (dot != num)
            res = "invalid";
        else {
            while (l < i * 2 - 1) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += " ";
                for (int b = 0; b < l; b++)
                    res += " o";
                res += "\n";
                l++;
            }
            while (l >= i) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += " ";
                for (int b = l; b > 0; b--)
                    res += " o";
                res += " \n";
                l--;
            }
        }
        return res;
    }
}

