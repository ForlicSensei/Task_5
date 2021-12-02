/**2.	Создайте функцию, которая принимает имя шахматной фигуры, ее положение и целевую позицию. Функция должна возвращать true, если фигура может двигаться к цели, и false, если она не может этого сделать.
 Возможные входные данные - "пешка", "конь", "слон", "Ладья", "Ферзь"и " король".

 Пример:
 canMove("Rook", "A8", "H8") ➞ true

 canMove("Bishop", "A7", "G1") ➞ true

 canMove("Queen", "C4", "D6") ➞ false
 **/
public class Task_2 {
    public static void main(String[] args) {
        System.out.println(canMove("Bishop", "A7", "G1"));
    }
    public static boolean canMove(String figure,String pos,String go){
        pos=pos.toUpperCase();
        go=go.toUpperCase();
        if(!(pos.matches("[A-H][1-8]") && go.matches("[A-H][1-8]}")))
        switch (figure.toLowerCase()){
            case ("pawn") :
                if ( pos.charAt(0) == go.charAt(0) && Math.abs( (int) pos.charAt(1) - (int) go.charAt(1)) <= 2)
                    return true;
                break;
            case ("knight") :
                if ( Math.abs( (int) pos.charAt(0) -  (int) go.charAt(0)) == 1 || Math.abs( (int) pos.charAt(0) - (int) go.charAt(0)) == 2 &&
                        Math.abs((int) pos.charAt(1) - (int) go.charAt(1)) == 1 )
                    return true;
                break;
            case ("rook") :
                if ( (pos.charAt(0) == go.charAt(0) && (pos.charAt(1) != go.charAt(1))) ||
                        ((pos.charAt(0) != pos.charAt(0)) && pos.charAt(1) == go.charAt(1)))
                    return true;
                break;
            case ("bishop") :
                if (Math.abs( (int) pos.charAt(0) - (int) go.charAt(0)) == Math.abs( (int) pos.charAt(1) - (int) go.charAt(1)))
                    return true;
                break;
            case ("queen") :
                if((Math.abs( (int) pos.charAt(0) - (int) go.charAt(0)) == Math.abs( (int) pos.charAt(1) - (int) go.charAt(1))) ||
                        ((pos.charAt(0) == go.charAt(0)) && (pos.charAt(1) != go.charAt(1))) ||
                        ((pos.charAt(0) != go.charAt(0)) && (pos.charAt(1) == go.charAt(1))))
                return true;
                break;
            case ("king") :
                if (Math.abs((int) pos.charAt(0) - (int) go.charAt(0)) <= 1 && Math.abs( (int) pos.charAt(1) - (int) go.charAt(1)) <= 1)
                    return true;
                break;
        }
       return false;
    }
}
