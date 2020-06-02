import static org.junit.Assert.*;

import org.junit.Test;

public class HighLevelFileSystemTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testLeerArchivoDeTresCampo() {
		// file = HighLevelFileSystem.open('archivoBinario')
		// String C0 = file.syncNextRead(4)
		// String C1 = file.syncNextRead(1)
		// String C2 = file.syncNextRead(5)

		// AssertEquals(C0, "foo")
		// AssertEquals(C1, "bar")
		// AssertEquals(C2, "foobar")

		// HighLevelFileSystem.close(file)
	}

	@Test
	public void testEscribirArchivo() {
		// file = HighLevelFileSystem.open('archivoBinario')
		// String C0 = "foobar"

		// file.syncWrite(C0, 0)
		// AssertEquals(file.syncRead(), "")

		// file.syncWrite(C0, 16)
		// AssertEquals(file.syncRead(), "foobar")

		// file.syncWrite(C0, 0)
		// AssertEquals(file.syncRead(), "foobar")
		
		// HighLevelFileSystem.close(file)
	}

	
	@Test
	public void testCopiarArchivo() {
		// fOrigen = HighLevelFileSystem.open('archivoALeer')
		// fDestino = HighLevelFileSystem.open('archivoAEscribir')

		// String contenido = fOrigen.syncRead();
		// fDestino.syncWrite(contenido)
		
		// AssertEquals(fOrigen.syncRead(), fDestino.syncRead())
		
		// HighLevelFileSystem.close(fOrigen)
		// HighLevelFileSystem.close(fDestino)
	}

}
