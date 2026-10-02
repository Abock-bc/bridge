public class Drums extends Instrument {
    public Drums(SoundOutput output) {
        super(output);
    }

    @Override
    public void play() {
        sendToOutput("Drums: boom tss boom");
    }
}
