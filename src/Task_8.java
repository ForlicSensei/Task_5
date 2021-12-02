import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**8.	Хеш-алгоритмы легко сделать одним способом, но по существу невозможно сделать наоборот. Например, если вы хешируете что-то простое, например, password123, это даст вам длинный код, уникальный для этого слова или фразы. В идеале, нет способа сделать это в обратном порядке. Вы не можете взять хеш-код и вернуться к слову или фразе, с которых вы начали.
 Создайте функцию, которая возвращает безопасный хеш SHA-256 для данной строки. Хеш должен быть отформатирован в виде шестнадцатеричной цифры.

 Пример:
 getSha256Hash("password123") ➞ "ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f"

 getSha256Hash("Fluffy@home") ➞ "dcc1ac3a7148a2d9f47b7dbe3d733040c335b2a3d8adc7984e0c483c5b2c1665"

 getSha256Hash("Hey dude!") ➞ "14f997f08b8ad032dcb274198684f995d34043f9da00acd904dc72836359ae0f"
 **/
public class Task_8 {
    public static void main(String[] args) {
        System.out.println(getSha256Hash("password123"));
    }
    public static String getSha256Hash(String s) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] hash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
        return convertToString(hash);
    }

    private static String convertToString(byte[] hash) {
        String hexString = "";
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString += '0';
            }
            hexString += hex;
        }
        return hexString;
    }
}
