package Dominio;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsuarioDao usuarioDao = new UsuarioDao();
	
		Usuario usuario1 = new Usuario();
		usuario1.setNombre("Santy Hugo");
		usuario1.setApellido("Gomez");
		usuarioDao.EjecutarSPA_CrearUsuario(usuario1);
		
		int filas = usuarioDao.agregarUsuario(usuario1);
		
		if(filas ==1)
			System.out.println("Usuario Agregado");
		else
			System.out.println("Usuario no agregado");
	
	
//		Usuario usuario2 = usuarioDao.ObtenerUsuario2(1);
//		System.out.println(usuario2.toString());
	
	/*	
		ArrayList<Usuario> ListaUsuarios = usuarioDao.ObtenerTodosUsuarios();
		
		for(Usuario user : ListaUsuarios)
		{
			System.out.println(user.toString());
		}
	*/	
	} 
	

}
