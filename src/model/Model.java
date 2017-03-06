package model;

public class Model {
Boolean sound;
Boolean music;
Boolean shadows;
Boolean antialiasing;
public Model() {
	sound = true;
	music = false;
	shadows = true;
	antialiasing = true;
}
public Boolean getSoundState() {
	return sound;
}
public Boolean getMusicState() {
	return music;
}
public Boolean getShadowsState() {
	return shadows;
}
public Boolean getAntialiasingState() {
	return antialiasing;
}
public Boolean toggleSound() {
	sound ^= true;
	printSettings();
	return sound;
}
public Boolean toggleShadows() {
	shadows ^= true;
	printSettings();
	return shadows;
}
public Boolean toggleAntialiasing() {
	antialiasing ^= true;
	printSettings();
	return antialiasing;

}
public Boolean toggleMusic() {
	music ^= true;
	printSettings();
	return music;
}
private void printSettings() {
	System.out.println("\033[H\033[2J"); //escape characters to clear console
 	System.out.flush();
	if (sound) System.out.println("Sound: On");
	if (!sound) System.out.println("Sound: Off");
	if (music) System.out.println("Music: On");
	if (!music) System.out.println("Music: Off");
	if (shadows) System.out.println("Shadows: On");
	if (!shadows) System.out.println("Shadows: Off");
	if (antialiasing) System.out.println("Antialiasing: On");
	if (!antialiasing) System.out.println("Antialiasing: Off");
}
}
