package _09_sound_effects_machine;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffectsMachine {
	
	

private void playSound(String sawing-wood-daniel_simon.) {
	String path = "src/_09_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}} 