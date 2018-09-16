package misc;

class PrintColors {

    enum Color {
        RED('R'),
        GREEN('G'),
        BLUE('B');

        char value;

        Color(char value) {
            this.value = value;
        }
    }

    void print(final int n) {
        if (n < 1) {
            return;
        }
        final StringBuilder stringBuilder = new StringBuilder();
        print(stringBuilder, n);
    }

    private void print(final StringBuilder stringBuilder, final int n) {
        for (Color color : Color.values()) {
            stringBuilder.append(color.value);

            if (stringBuilder.length() == n) {
                System.out.println(stringBuilder.toString());
            } else {
                print(stringBuilder, n);
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
