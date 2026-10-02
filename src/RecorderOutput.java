
public class RecorderOutput implements SoundOutput {
    @Override
    public void emit(String sound) {
        System.out.println("Recorder: recording -> " + sound);
    }
}
