package ali;

/*
 + Created By AliRad
 + Time   : 12/15/2023 AT 11:53 PM
 + Github : https://github.com/AliiRad
*/

public class Main {

//        private String numberToWordThreeDigit(String number){
//        number = "321";
//        String[] digitArray = number.split("");
//        System.out.println(digitArray.length);
//    }

//    private String numberToWordTwoDigit(String number) {
//        number = "321";
//        String[] digitArray = number.split("");
//        System.out.println(digitArray.length);
//    }

    public static void main(String[] args) {
        String number = "1";
        String[] digitArray = number.split("");

        int check = 0;
        for (int i = 0; i < digitArray.length; i++) {
            check += Integer.valueOf(digitArray[i]);
        }
        if (check != 0) {

            if (digitArray.length == 3) {

                if (Integer.valueOf(digitArray[0]) == 0 && Integer.valueOf(digitArray[1]) == 0) {
                    System.out.println(NumberLists.yekan[Integer.valueOf(digitArray[2])]);
                } else if (Integer.valueOf(digitArray[1]) == 0) {
                    System.out.println(NumberLists.sadgan[Integer.valueOf(digitArray[0])] + " و " + NumberLists.yekan[Integer.valueOf(digitArray[2])]);
                } else if (NumberLists.sadgan[Integer.valueOf(digitArray[0])] != NumberLists.sadgan[0]) {
                    System.out.print(NumberLists.sadgan[Integer.valueOf(digitArray[0])] + " و ");
                    if (Integer.valueOf(digitArray[2]) != 0) {
                        System.out.print(NumberLists.dahtabist[Integer.valueOf(digitArray[2])]);
                    } else {
                        System.out.println(NumberLists.dahgan[Integer.valueOf(digitArray[1]) - 1]);
                    }
                } else {
                    if (Integer.valueOf(digitArray[2]) != 0) {
                        if (Integer.valueOf(digitArray[0]) == 0 && Integer.valueOf(digitArray[1]) == 0 && Integer.valueOf(digitArray[2]) > 0) {
                            System.out.println(NumberLists.yekan[Integer.valueOf(digitArray[2])]);
                        } else if (Integer.valueOf(digitArray[1]) < 2) {
                            System.out.print(NumberLists.dahtabist[Integer.valueOf(digitArray[2])]);
                        } else {
                            System.out.print(NumberLists.dahgan[Integer.valueOf(digitArray[1]) - 1] + " و ");
                            System.out.print(NumberLists.yekan[Integer.valueOf(digitArray[2])]);
                        }
                    } else {
                        System.out.println(NumberLists.dahgan[Integer.valueOf(digitArray[1]) - 1]);
                    }
                }
            } else if (digitArray.length == 2) {
                if (Integer.valueOf(digitArray[0]) != 0) {
                    if (Integer.valueOf(digitArray[0]) < 2) {
                        System.out.print(NumberLists.dahtabist[Integer.valueOf(digitArray[1])]);
                    } else {
                        System.out.print(NumberLists.dahgan[Integer.valueOf(digitArray[0]) - 1] + " و ");
                        System.out.print(NumberLists.yekan[Integer.valueOf(digitArray[1])]);
                    }
                } else {
                    System.out.println(NumberLists.yekan[Integer.valueOf(digitArray[1])]);
                }
            } else if (digitArray.length == 1) {
                System.out.println(NumberLists.yekan[Integer.valueOf(digitArray[0])]);
            }
        }else{
            System.out.printf("None - number isn't valid N:%s",number);
        }
    }

//        System.out.println(digitArray[0]);
//        System.out.println(digitArray[1]);
//        System.out.println(digitArray[2]);


}

