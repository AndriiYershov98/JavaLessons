package homeWork_18;

public class Dog {
    private String name;
    private int maxJumpHeight;

    private int jumpHeight;
    private static int jumpPerTraining;


    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;

    }

    static {
        jumpPerTraining = 10;
    }

    public void jump() {
        System.out.println("Dog " + name + " jumped");
    }

    public void training() {
        this.jumpHeight += jumpPerTraining;
//        jumpHeight = (jumpHeight > maxJumpHeight) ? maxJumpHeight : jumpHeight;
        jumpHeight = Math.min(jumpHeight, maxJumpHeight); // метод возвращает меньшее из двух чисел
        System.out.println("======== Jump after training: " + jumpHeight);

    }



    public boolean takeBarrier(int barrier) {
        System.out.println(name + " jump: " + jumpHeight + "; barrier: " + barrier);
        if (jumpHeight >= barrier) {
            System.out.println("if (jumpHeight >= barrier)" + name + " jump: " + jumpHeight + "; Начало метода barrier: " + barrier);
            jump();
            return true;
        } else {
            if (maxJumpHeight >= barrier) {
                do {
                    training();
                } while (jumpHeight < barrier);


                jump();
                System.out.println("maxJumpHeight >= barrier: true)" + name + " jump: " + jumpHeight + "; barrier: " + barrier);
                return true;
            } else { // этот барьер не преодолеть
                System.out.println("Sorry, this barrier is too high. ");
                System.out.println("maxJumpHeight >= barrier: false)" + name + " jump: " + jumpHeight + "; barrier: " + barrier);
                return false;
            }
        }
    }

    public void info() {
        System.out.println("Dog: " + name + "Current jumped: " + jumpHeight + "; max: " + maxJumpHeight);
    }


}
