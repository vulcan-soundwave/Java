package interfaces;

public interface DefaultTest<T> {

	void mouseClicked();
	default void mousePressed(T other) {}
	default void mouseReleased() {}
	default int mouseEntered() {return 0;}

}
