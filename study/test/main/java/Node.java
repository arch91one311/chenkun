import java.io.Serializable;
import java.util.*;

public class Node implements Serializable {
    private static final long serialVersionUID = 1L;
    public static class ThreeNode {
        private Integer value;
        private Integer height;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public ThreeNode getLeft() {
            return left;
        }

        public void setLeft(ThreeNode left) {
            this.left = left;
        }

        public ThreeNode getRight() {
            return right;
        }

        public void setRight(ThreeNode right) {
            this.right = right;
        }

        public ThreeNode getMiddle() {
            return middle;
        }

        public void setMiddle(ThreeNode middle) {
            this.middle = middle;
        }

        private ThreeNode left;
        private ThreeNode right;
        private ThreeNode middle;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入一个输，就需要判断放在哪一层，如果是在同一层就不加高度，如果不是就加高度
        //高度
        int height = 0;
        ThreeNode threeNode = new ThreeNode();
        int count = 0;
        while (in.hasNextInt()) {
            if (count < 1) {
                count = in.nextInt();
            }
            int input = in.nextInt();
            System.out.println(input);
            if (threeNode.getValue() == null) {
                height++;
                threeNode.setValue(input);
                threeNode.setHeight(height);
                continue;
            }
            height = addNode(threeNode, height, input);
            System.out.println(height);

        }

    }

    private static int addNode(ThreeNode threeNode, int height, int input) {
        //如果数小于节点的数减去500 则为左子树
        if ((threeNode.getValue() - 500) > input) {
            if (threeNode.getLeft() == null) {
                ThreeNode leftNode = new ThreeNode();
                leftNode.setValue(input);
                leftNode.setHeight(threeNode.getHeight() + 1);
                if (leftNode.getHeight() > height) {
                    height = leftNode.getHeight();
                }
                threeNode.setLeft(leftNode);
            } else {
                height = addNode(threeNode.getLeft(), height, input);
            }
        } else if ((threeNode.getValue() + 500) < input) {
            if (threeNode.getRight() == null) {
                ThreeNode rightNode = new ThreeNode();
                rightNode.setValue(input);
                rightNode.setHeight(threeNode.getHeight() + 1);
                if (rightNode.getHeight() > height) {
                    height = rightNode.getHeight();
                }
                threeNode.setRight(rightNode);
            } else {
                height = addNode(threeNode.getRight(), height, input);
            }
        } else {
            if (threeNode.getMiddle() == null) {
                ThreeNode middleNode = new ThreeNode();
                middleNode.setValue(input);
                middleNode.setHeight(threeNode.getHeight() + 1);
                if (middleNode.getHeight() > height) {
                    height = middleNode.getHeight();
                }
                threeNode.setMiddle(middleNode);
            } else {
                height = addNode(threeNode.getMiddle(), height, input);
            }
        }
        return height;
    }
}
