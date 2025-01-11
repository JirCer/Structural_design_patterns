package adapter;


public class AudioSystemAdapter implements NewAudioSystem {
    private final OldAudioSystem oldAudioSystem;

    public AudioSystemAdapter(OldAudioSystem oldAudioSystem) {
        this.oldAudioSystem = oldAudioSystem;
    }

    @Override
    public void playAudio(String fileName) {
        oldAudioSystem.playSound(fileName);

    }

    @Override
    public void stopAudio() {
        oldAudioSystem.stopSound();

    }
}
