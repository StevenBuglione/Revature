package WeekThree;

public class StringFormat {
/*    Create a "drawing" of your pet or a friend's pet. Using String formatting to do so. This "drawing" must include use of at least one of each type:
            - boolean
    - decimal number
    - whole number
    - String (included via %s)*/

    public static void main(String[] args) {
        //Calling DrawMyWorkOfArt()
        DrawMyWorkOfArt();
    }

    public static void DrawMyWorkOfArt(){
        //Given Values to draw my ugly dog
        int head = 0;
        String body = " 000 -";
        double legs = 0.0;
        boolean tail = false;

        //Using String format to convert variables into string
        String headValue = String.format("%x", head);
        String bodyValue = String.format("%s", body);
        String legsValue = String.format("%s", legs);
        String tailValue = String.format("%b", tail);

        //Printing out the value to the console.
        System.out.println(headValue);
        System.out.println(bodyValue + " " + tailValue);
        System.out.println(legsValue);


    }

}
