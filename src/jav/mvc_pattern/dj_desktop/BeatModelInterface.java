package jav.mvc_pattern.dj_desktop;

public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver bo);

    void removeObserver(BeatObserver bo);

    void registerObserver(BPMObserver bpmo);

    void removeOnberver(BPMObserver bpmo);
}
