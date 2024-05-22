 package ders9;

        public class Practice2 {
            public static void main(String[] args) {

                char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
                String s1 = String.valueOf(chars);
                System.out.println("changing char to String: " + s1);

                System.out.println("isBlank: " + s1.isBlank());
                System.out.println("isempty: " + s1.isEmpty());

                boolean result = isValidString(s1);
                System.out.println("The result is: " + result);
            }

            public static boolean isValidString(String s) {
                return s.length() == 7 && s.matches("[a-z A-Z]{7}");

            }
        }



