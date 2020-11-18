package uaslp.enginering.labs;

public class Main {

    public static void main(String[] args) throws ItemCollisionException {
        try {
            otro();
        } catch (WallCollisionException e) {
            System.out.println("B1");
        }
    }

    public static void otro() throws WallCollisionException, ItemCollisionException {
        try {
            System.out.println("A0");
            move(2);
            System.out.println("A1");

        }  catch (PhantomCollisionException e) {
            System.out.println("A3");
            e.printStackTrace();

        }  catch(ItemCollisionException e) {
            System.out.println("A6");
            e.printStackTrace();
            throw new ItemCollisionException();

        }  finally {
            System.out.println("A5");

        }

        System.out.println("A4");
    }

    private static void stopMovement() {

    }

    private static void die() {

    }

    public static void move(int delta) throws PhantomCollisionException, WallCollisionException, ItemCollisionException {
        setPosition(getX() + 1, getY());

        if (hasCollisions(Phantom.class) || delta == 1) {
            throw new PhantomCollisionException();
        }

        if (hasCollisions(Wall.class) || delta == 2) {
            throw new WallCollisionException();
        }

        if(hasCollisions(Item.class) || delta == 3 ){
            throw new ItemCollisionException();
        }

    }

    public static void setPosition(int x, int y) {

    }

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return 0;
    }

    public static boolean hasCollisions(Class c) {
        boolean booleanForTest = false;

        return booleanForTest;
    }


}
