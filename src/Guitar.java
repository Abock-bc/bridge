
public class Guitar extends Instrument {
    public Guitar(SoundOutput output) {
        super(output);
    }

    @Override
    public void play() {
        sendToOutput("Guitar: strum strum");
    }
}
