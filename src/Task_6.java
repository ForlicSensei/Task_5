/**6.	Создайте функцию, которая принимает число в качестве аргумента и возвращает true, если это число является действительным номером кредитной карты, а в противном случае-false.
 Номера кредитных карт должны быть длиной от 14 до 19 цифр и проходить тест Луна, описанный ниже:
 – Удалите последнюю цифру (это"контрольная цифра").
 – Переверните число.
 – Удвойте значение каждой цифры в нечетных позициях. Если удвоенное значение имеет более 1 цифры, сложите цифры вместе (например, 8 x 2 = 16 ➞ 1 + 6 = 7).
 – Добавьте все цифры.
 – Вычтите последнюю цифру суммы (из шага 4) из 10. Результат должен быть равен контрольной цифре из Шага 1.

 Пример:
 validateCard(1234567890123456) ➞ false

 // Step 1: check digit = 6, num = 123456789012345
 // Step 2: num reversed = 543210987654321
 // Step 3: digit array after selective doubling: [1, 4, 6, 2, 2, 0, 9, 8, 5, 6, 1, 4, 6, 2, 2]
 // Step 4: sum = 58
 // Step 5: 10 - 8 = 2 (not equal to 6) ➞ false

 validateCard(1234567890123452) ➞ true

 // Same as above, but check digit checks out.
 **/
public class Task_6 {
    public static void main(String[] args) {
        System.out.println(validateCard(1234567890123452L));
    }
    public static boolean validateCard (long numberCard){
        String str = Long.toString(numberCard);
        if(str.length()<13 && str.length()>19)
            return false;
        int checkDigit = str.charAt(str.length()-1);
        int[] numbers=new int[str.length()-1];
        int sum=0;
        for (int i=0;i<str.length()-1;i++){
            numbers[i]= str.charAt(str.length()-2-i)-48;
            numbers[i]*=numbers[i];
            while (numbers[i]>9){
                numbers[i]=numbers[i]/10+numbers[i]%10;
            }
        }
        for (int i=0; i < numbers.length;i++){
            sum+=numbers[i];
        }
        return (10-sum%10+1) == (checkDigit-48);
    }
}
