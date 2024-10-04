public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 3, 1};
        for (int element:
                array) {
            System.out.print(element + " ");
        }
        System.out.println();
        sort(array, array.length);
        for (int element:
             array) {
            System.out.print(element + " ");
        }
    }

    public static void sort(int[] array, int remainingElements){
        if (remainingElements <= 1){
            return;
        }
        sort(array, remainingElements - 1);

        int last = array[remainingElements - 1];
        int indexToMove = (remainingElements - 2);

        while(indexToMove >= 0 && array[indexToMove] > last){
            array[indexToMove + 1] = array[indexToMove];
            indexToMove--;
        }

        array[indexToMove+1] = last;
    }
}