class ExHandle {
    public static void main(String[] args) {

        String[] r = { "100", "10.2", "5.hello", "100hello" };
        for (String input : r) {
            System.out.println("Checking: " + input);

            if (isInteger(input)) {
                System.out.println(input + " is a valid integer.");
            } else if (isDouble(input)) {
                System.out.println(input + " is a valid double.");
            } else {
                System.out.println(input + " is not a valid integer or double.");
            }
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
