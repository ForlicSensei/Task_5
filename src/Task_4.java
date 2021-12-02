/**4.	Создайте функцию, которая принимает числа в качестве аргументов, складывает их вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной всего в 1 цифру.
 Пример:
 sumDigProd(16, 28) ➞ 6

 sumDigProd(0) ➞ 0

 sumDigProd(1, 2, 3, 4, 5, 6) ➞ 2
 **/
public class Task_4 {
    public static void main(String[] args) {
        System.out.println(sumDigProd(new int[] {16,28} ));
    }
    public static int sumDigProd(int[] num){
        int sum=0,prog=1,number;
        for(int i=0; i<num.length; i++){
            sum += num [i];
        }
        while (sum>9){
            number=sum;
            prog=1;
            while (number>0){
                prog*=number % 10;
                number=number/10;
            }
            sum=prog;
        }
        return sum;
    }
}
