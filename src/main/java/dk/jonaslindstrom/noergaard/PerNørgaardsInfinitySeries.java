package dk.jonaslindstrom.noergaard;

import dk.jonaslindstrom.mosef.midi.MIDIEncoder;
import dk.jonaslindstrom.mosef.modules.melody.Track;
import dk.jonaslindstrom.mosef.modules.scales.Scale;
import dk.jonaslindstrom.mosef.modules.scales.ScaleFactory;
import dk.jonaslindstrom.mosef.modules.scales.ScaleFactory.Key;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PrimitiveIterator;
import java.util.Queue;
import javax.sound.midi.InvalidMidiDataException;

public class PerNørgaardsInfinitySeries implements PrimitiveIterator.OfInt {

    private final Queue<Integer> memory = new LinkedList<>();
    private boolean even = false;

    @Override
    public boolean hasNext() {
      return true;
    }

    @Override
    public int nextInt() {
      even = !even;

      int next;
      if (memory.isEmpty()) {
        next = 0;
      } else {
        next = even ? -memory.peek() : memory.poll() + 1;
      }
      memory.add(next);

      return next;
    }

    public static void main(String[] arguments) throws InvalidMidiDataException, IOException {
      PerNørgaardsInfinitySeries series = new PerNørgaardsInfinitySeries();
      int limit = 160;

      Track track = new Track();
      Scale scale = ScaleFactory.minor(Key.C);
      for (int i = 0; i < limit; i++) {
        int note = series.nextInt();
        track.addNote(72 + scale.noteAt(note), i * 0.125, 0.5, 0.125);
      }

      MIDIEncoder.encode(track, "noergaard.mid");
    }
  }


