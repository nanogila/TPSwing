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
/** 
 * Gets the state of sound setting
 * @return
 * A Boolean indicating that sound is enabled or not
 */
public Boolean getSoundState() {
	return sound;
}
/** 
 * Gets the state of music setting
 * @return
 * A Boolean indicating that music is enabled or not
 */
public Boolean getMusicState() {
	return music;
}
/** 
 * Gets the state of shadows setting
 * @return
 * A Boolean indicating that shadows are enabled or not
 */
public Boolean getShadowsState() {
	return shadows;
}
/** 
 * Gets the state of anti-aliasing setting
 * @return
 * A Boolean indicating that anti-aliasing is enabled or not
 */
public Boolean getAntialiasingState() {
	return antialiasing;
}
/**
 * Enables/disables Sound 
 * @return
 * A Boolean representing sound setting state after toggling it
 */
public Boolean toggleSound() {
	sound ^= true;
	printSettings();
	return sound;
}
/**
 * Enables/disables Shadows
 * @return
 * A Boolean representing shadows setting state after toggling it
 */
public Boolean toggleShadows() {
	shadows ^= true;
	printSettings();
	return shadows;
}
/**
 * Enables/disables Anti-aliasing
 * @return
 * A Boolean representing anti-aliasing setting state after toggling it
 */
public Boolean toggleAntialiasing() {
	antialiasing ^= true;
	printSettings();
	return antialiasing;

}
/**
 * Enables/disables Sound 
 * @return
 * A Boolean representing music setting state after toggling it
 */
public Boolean toggleMusic() {
	music ^= true;
	printSettings();
	return music;
}
/**
 * Clears console
 * and prints current settings in it
 */
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
