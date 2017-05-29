package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DAO {
ObjectInputStream adaptadorLectura = null;

public boolean grabar(Object obj, String path, boolean lista){
	return true;	
}
public Object leer(String path, boolean lista){
	File archivo = new File(path);
	Object socio = null;
		try {
			if (lista||adaptadorLectura==null) {
				FileInputStream entrada = new FileInputStream(archivo);
				adaptadorLectura = new ObjectInputStream(entrada);
			}
			socio = adaptadorLectura.readObject();
			if (lista) {
				adaptadorLectura.close();
			}else{
				if (socio==null) {
					adaptadorLectura.close();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return socio;
}
}
