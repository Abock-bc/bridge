
public class Piano extends Instrument {
    public Piano(SoundOutput output) {
        super(output);
    }

    @Override
    public void play() {
        sendToOutput("Piano: do re mi");
    }
}
