package Task2;

public class Task2 {
    public static void Task2() {
        int[] mass1 = new int[30];
        for (int i = 0; i < mass1.length; i++) {

            if (i < 2) {
                mass1[i] = 1;
            } else {
                mass1[i] = mass1[i - 2] + mass1[i - 1];
            }
            System.out.print(mass1[i] + " ");

        }
        System.out.println();
        int[] mass2 = new int[10];
        for (int i = 0; i < mass2.length; i++) {
            if (i % 2 == 0) {
                mass2[i] = 1;
            } else {
                mass2[i] = i % 5;

            }
            System.out.println(mass2[i]);
        }
        int[] mass3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int result = 0;
        for (int i = 0; i < mass3.length; i++) {
            if (i % 2 == 0) {
                result += mass3[i];

            }
        }
        System.out.println(result);
        String str1 = "The quick fox jumps over the dog";
        String str2 = "The rabbit is fluffy and white";
        int dif = Math.abs(str1.length() - str2.length());
        if (str1.length() < str2.length()) {
            for (int i = 0; i < dif; i++) {
                System.out.print(str2);

            }

        } else if (str1.length() > str2.length()) {
            for (int i = 0; i < dif; i++) {
                System.out.print(str1);
            }
        } else if (str1.length() == str2.length())
            System.out.println("Они равны");

        String str3 = "Первое слово и третье";
        for (int i = 0; i < 3; i++){
        System.out.print(str3 + ", " + str3 + ", " + str3 + "\n" + str3.length());


        }

        String str4 = "Что-то что-то на турецком";
        String[] strings = str4.split(" ");
        System.out.println(strings.length);
    }


}

