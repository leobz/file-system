package fs;

public interface HighLevelFileSystem {
	
	  /**
	   * Devuelve un objeto File a partir de una archivo binario
	   * @param path
	   * @return Objeto File
	   */
	  File openFile(String path);
	  	// En caso de no encontrar archivo retorna una excepcion

	  
	  void closeFile(File file);
	  
}
