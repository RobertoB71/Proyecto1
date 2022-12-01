package crud.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Models.usuarios;

public class PaginaWebDb {

    public class PaginaWebDb {
        Connection _cn;
    
        public PaginaWebDb(){
            _cn = new Conexion().openDb();
        }
    
        public List<PaginaWeb}>

    ObtenerUsuarios(){
            try {
                Statement stmt =  _cn.createStatement();
                String query = "Select * from usuarios";
            
                List<PaginaWeb> transformers = new ArrayList<>();
                ResultSet result = stmt.executeQuery(query);
                while(result.next()){
                    usuarios usuario = new usuarios(
                        result.getString("correo"),
                        result.getString("nombre"),
                        result.getString("apellido"),
                        result.getString("telefono"),
                        result.getString("contraseña")
                    );
    
                    usuarios.add(usuario);
                }
                result.close();
                stmt.close();
                return usuarios;
    
            } catch (Exception e) {
               int x = 1;
            }
    
            return null;
        }
}

}
