package Levels;

import java.awt.Graphics;

public abstract class Level {

	private static Level currentLevel = null;
	private LevelManager levelManager;

	public Level(LevelManager levelManager) {
		this.levelManager = levelManager;

	}

	public static void setLevel(Level level) {
		currentLevel = level;
	}

	public static Level getLevel() {
		return currentLevel;
	}

	public abstract void tick();

	public abstract void render(Graphics g);

}