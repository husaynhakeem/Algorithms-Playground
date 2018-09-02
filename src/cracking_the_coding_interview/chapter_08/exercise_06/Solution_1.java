package cracking_the_coding_interview.chapter_08.exercise_06;

import java.util.Stack;

public class Solution_1 {

    public static void main(String[] args) {
        Tower[] towers = new Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower();
        }

        for (int i = 10; i > 0; i--) {
            towers[0].addDisk(i);
        }

        System.out.println("Before");
        System.out.println("Tower 1:" + towers[0].toString());
        System.out.println("Tower 2:" + towers[1].toString());
        System.out.println("Tower 3:" + towers[2].toString());

        towers[0].moveDisks(10, towers[2], towers[1]);

        System.out.println("After");
        System.out.println("Tower 1:" + towers[0].toString());
        System.out.println("Tower 2:" + towers[1].toString());
        System.out.println("Tower 3:" + towers[2].toString());
    }

    private static class Tower {

        private Stack<Integer> disks = new Stack<>();

        void addDisk(int n) {
            if (!disks.isEmpty() && disks.peek() <= n)
                System.out.println("Cannot place disk on smaller disk");
            else
                disks.push(n);
        }

        void moveDisks(int numDisks, Tower destination, Tower buffer) {
            if (numDisks > 0) {
                moveDisks(numDisks - 1, buffer, destination);
                moveTopDiskTo(destination);
                buffer.moveDisks(numDisks - 1, destination, this);
            }
        }

        private void moveTopDiskTo(Tower destination) {
            if (!disks.isEmpty()) {
                destination.addDisk(disks.pop());
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");

            Integer[] stackAsArray = new Integer[disks.size()];
            stackAsArray = disks.toArray(stackAsArray);

            for (int i = 0; i < disks.size(); i++) {
                if (i != 0)
                    sb.append(",");
                sb.append(stackAsArray[i]);
            }

            sb.append("}");
            return sb.toString();
        }
    }
}
