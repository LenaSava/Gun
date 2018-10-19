public class GunMain {
    public static void main(String[] args) throws OutOfRounds, NotReady {
        Gun gun = new Gun("Beretta", 8);

        System.out.println(gun);

        gun.reload();
        gun.prepare();

        System.out.println(gun);

        gun.shoot();
        gun.shoot();

        System.out.println(gun);

        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();
        gun.shoot();

        System.out.println(gun);
    }
}