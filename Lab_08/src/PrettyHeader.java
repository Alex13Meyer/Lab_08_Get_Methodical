public class PrettyHeader {
    private static String msg;

    public PrettyHeader(String messageCenteredHere) {
        msg = messageCenteredHere;
    }
        public static void main (String[]args){
            int totalWidth = 60;
            int msgWidth = Integer.parseInt(msg);
            int paddingWidth = (totalWidth - msgWidth - 6) / 2;
            for (int i = 0; i < totalWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println("***");
            for (int i = 0; i < paddingWidth; i++) {
                System.out.print(" ");
            }
            System.out.print(msg);
            for (int i = 0; i < paddingWidth; i++) {
                System.out.print(" ");
            }
            if ((totalWidth - msgWidth - 6) % 2 != 0) {
                paddingWidth++;
            }
            System.out.println("***");
            for (int i = 0; i < totalWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

