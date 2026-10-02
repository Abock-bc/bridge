
public class HeadphonesOutput implements SoundOutput {
    @Override
    public void emit(String sound) {
        System.out.println("Headphones " + sound.toLowerCase() + " (quiet, only for you)");
    }
}
