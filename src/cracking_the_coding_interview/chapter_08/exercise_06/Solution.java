package cracking_the_coding_interview.chapter_08.exercise_06;

import java.util.List;
import java.util.Stack;

class Solution {

    void towersOfHanoi(final Tower origin, final Tower destination, final Tower buffer, final int numDisks) {
        if (numDisks < 0) {
            return;
        }
        origin.moveDisks(numDisks, destination, buffer);
    }

    static class Tower {

        Stack<Integer> disks = new Stack<>();

        void populate(final List<Integer> list) {
            for (Integer n : list) {
                addDisk(n);
            }
        }

        void addDisk(final int n) {
            if (!disks.isEmpty() && disks.peek() <= n)
                System.out.println("Cannot place disk on smaller disk");
            else
                disks.push(n);
        }

        private void moveTopDiskTo(Tower destination) {
            if (!disks.isEmpty()) {
                destination.addDisk(disks.pop());
            }
        }

        void moveDisks(final int numDisks, final Tower destination, final Tower buffer) {
            if (numDisks > 0) {
                moveDisks(numDisks - 1, buffer, destination);
                moveTopDiskTo(destination);
                buffer.moveDisks(numDisks - 1, destination, this);
            }
        }
    }
}
