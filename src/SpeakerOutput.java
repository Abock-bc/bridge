
public class SpeakerOutput implements SoundOutput {
    @Override
    public void emit(String sound) {
        System.out.println("Speaker: " + sound.toUpperCase() + " (loud, for everyone)");
    }
}
