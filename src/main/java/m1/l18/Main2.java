package m1.l18;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    static void main() {
        final Set<String> words = new TreeSet<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        System.out.println("Words in the set: " + words);

        final Set<Box> boxes = new TreeSet<>();
        boxes.add(new Box("apple"));
        boxes.add(new Box("banana"));
        boxes.add(new Box("cherry"));
        System.out.println("Boxes in the set: " + boxes);

        final Set<BigBox> bigBoxes1 = new TreeSet<>(new BoxComparator());
        bigBoxes1.add(new BigBox("apple"));
        bigBoxes1.add(new BigBox("banana"));
        bigBoxes1.add(new BigBox("cherry"));
        System.out.println("BigBoxes in the set: " + bigBoxes1);

        final Set<BigBox> bigBoxes2 = new TreeSet<>(Comparator.comparing(o -> o.content));
        bigBoxes2.add(new BigBox("apple"));
        bigBoxes2.add(new BigBox("banana"));
        bigBoxes2.add(new BigBox("cherry"));
        System.out.println("BigBoxes in the set: " + bigBoxes2);
    }

    static class BoxComparator implements Comparator<BigBox> {
        @Override
        public int compare(final BigBox o1, final BigBox o2) {
            return Integer.compare(o1.content.length(), o2.content.length());
        }
    }

    static class BigBox {
        String content;

        public BigBox(final String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "BigBox{" +
                    "content='" + content + '\'' +
                    '}';
        }
    }


    static class Box implements Comparable<Box> {
        String content;

        public Box(final String content) {
            this.content = content;
        }

        @Override
        public int compareTo(final Box o) {
            return Integer.compare(content.length(), o.content.length());
        }

        @Override
        public boolean equals(final Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            final Box box = (Box) o;
            return Objects.equals(content, box.content);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(content);
        }

        @Override
        public String toString() {
            return "Box{" +
                    "content='" + content + '\'' +
                    '}';
        }
    }
}
