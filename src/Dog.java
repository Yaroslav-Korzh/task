public class Dog{

    public void met (int[] y, int x) {
        int[] result = new int[2];
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (x == (y[i] + y[j])) {
                    result[0] = i;
                    result[1] = j;
                } else continue;
            }
        }

        System.out.println(result[1] + " " + result[0]);
    }

}
