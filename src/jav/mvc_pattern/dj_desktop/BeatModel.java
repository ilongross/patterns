package jav.mvc_pattern.dj_desktop;

import jav.pattern_of_patterns.ducks_app.interfaces.Observer;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {

    Sequencer sequencer;
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bpm = 90;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBMPObservers();
    }

    public void setUpMidi() {

    }

    public void buildTrackStart() {

    }

    @Override
    public int getBPM() {
        return bpm;
    }

    void beatEvent() {
        notifyBeatObservers();
    }

    public void notifyBeatObservers() {
        for (Object obs : this.beatObservers) {
            BeatObserver beatObserver = (BeatObserver) obs;
            beatObserver.update();
        }
    }

    public void notifyBMPObservers() {
        for (Object obs : this.bpmObservers) {
            BPMObserver bpmObserver = (BPMObserver) obs;
            bpmObserver.update();
        }
    }

    @Override
    public void registerObserver(BeatObserver bo) {
        this.beatObservers.add(bo);
    }

    @Override
    public void removeObserver(BeatObserver bo) {
        this.beatObservers.remove(bo);
    }

    @Override
    public void registerObserver(BPMObserver bpmo) {
        this.bpmObservers.add(bpmo);
    }

    @Override
    public void removeOnberver(BPMObserver bpmo) {
        this.bpmObservers.remove(bpmo);
    }

    @Override
    public void meta(MetaMessage meta) {

    }
}