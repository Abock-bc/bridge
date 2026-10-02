public abstract class Instrument {
    private SoundOutput output;

    protected Instrument(SoundOutput output) {
        this.output = output;
    }

    public void setOutput(SoundOutput output) {
        this.output = output;
    }

    protected void sendToOutput(String sound) {
        output.emit(sound);
    }

    public abstract void play();
}
