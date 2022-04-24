package function;

public class Quiz02 {
    static String cardNumber(String number) {
        String result = "";
        for (int i = 1; i <= number.length(); i++) {
            result += number.charAt(i - 1);

            if (i % 4 == 0 && i != number.length())
                result += "-";
        }
        return result;
    }

    static String cardNumber(long number) {
        String cardNum = number + "";
        return cardNumber(cardNum);
    }    

    static String cardNumber(char[] number) {
        String cardNum = new String(number);
        return cardNumber(cardNum);
    }
    
    public static void main(String[] args) {
        // 카드번호 16자리를 받아서, 4자리씩 구분하여 사이에 - 기호를 넣어서 반환하는 함수
        char[] arr = {
            '1', '2', '3', '4', '5', '6', '7', '8', '3', '4', '5', '6', '7', '8', '9', '0'
        };

        String data1 = cardNumber(1234567834567890L);
        String data2 = cardNumber("1234567834567890");
        String data3 = cardNumber(arr);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }    
}
