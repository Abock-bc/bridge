public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(new SpeakerOutput());
        Instrument piano = new Piano(new HeadphonesOutput());
        Instrument drums = new Drums(new RecorderOutput());
        guitar.play();
        piano.play();
        drums.play();
        System.out.println("\n===========================");
        guitar.setOutput(new HeadphonesOutput());
        guitar.play();
        piano.setOutput(new SpeakerOutput());
        piano.play();
        drums.setOutput(new SpeakerOutput());
        drums.play();
    }
}
