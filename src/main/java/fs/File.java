package fs;

import java.util.function.Consumer;

public interface File {

	/**
	 * Lee todo el contenido del archivo
	 */
	String syncRead();

	/**
	 * Lee a partir de la ultima posición leida anteriormente una n cantidad de
	 * bytes
	 * 
	 * @param bufferSize cantidad de bytes a leer
	 */
	String syncNextRead(int bufferSize);

	/**
	 * Similar a {@link #syncRead()}, pero asincrónico. En lugar de devolver el
	 * contenido leido, se lo pasa a un callback predefinido
	 */
	void asyncRead();
	void asyncNextRead();

	/**
	 * Sobreescribe el archivo
	 */
	void syncWrite(String content);

	/**
	 * Escribe a partir de la ultima posición escrita anteriormente una n cantidad
	 * de bytes
	 */
	void syncNextWrite(String content, int bufferSize);

	/**
	 * Setea un callback a usar por asyncRead
	 */
	void setCallBack(Consumer callback);

//EXTRAS

	/**
	 * Lee a partir de una posición del buffer una n cantidad de bytes
	 * 
	 * @param bufferStart la posicion inicial a partir de la cual leer los bytes
	 * @param bufferSize  cantidad de bytes a leer
	 */
	String syncRead(int bufferStart, int bufferSize);

	/**
	 * Escribe a partir de una posición del buffer una n cantidad de bytes
	 */
	void syncWrite(String content, int bufferStart, int bufferSize);

	/**
	 * Similar a {@link #syncRead(int, int)}, pero asincrónico.
	 */
	void asyncRead(int bufferStart, int bufferSize);

}
