package adapter;



public class AdapterPattern {
    public static void main(String[] args) {
        // Old audio system instance
        OldAudioSystem oldSystem = new OldAudioSystem();

        // Adapter wraps the old system to conform to the new interface
        NewAudioSystem adaptedSystem = new AudioSystemAdapter(oldSystem);

        // sound file setup by Madonna - Frozen
        String soundFile = "frozen.wav";
        adaptedSystem.playAudio(soundFile);

        // Wait for a few seconds and stop the sound
        try {
            Thread.sleep(10000); // Wait for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adaptedSystem.stopAudio();

    }
}
