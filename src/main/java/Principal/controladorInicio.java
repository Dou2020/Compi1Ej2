package Principal;

import domain.Entero;
import java.io.StringReader;
import flex.lexicoEjercicio2;
import java.io.Reader;
import javax.swing.table.DefaultTableModel;

public class controladorInicio {
    
    private Inicio inicio;
    private lexicoEjercicio2 lexico;
    
    public controladorInicio(Inicio inicio){
        this.inicio = inicio;
    }
    
    public void evaluar(){
        System.out.println(inicio.getAreaEntrada().getText());
        Reader text = new StringReader(inicio.getAreaEntrada().getText());
        lexico = new lexicoEjercicio2(text);
        try{
               int output = lexico.yylex();
            while (output != lexicoEjercicio2.YYEOF) {
                lexico.yylex();
            }
        }catch(Exception e){
             System.out.println("Atrape un error y lo maneje de forma correcta");
        }
        
        inicio.getUnaV().setText(lexico.getOneCount()+"");
        inicio.getDosV().setText(lexico.getTwoCount()+"");
        inicio.getTresV().setText(lexico.getTreeCount()+"");
        inicio.getCuatroV().setText(lexico.getFourCount()+"");
        inicio.getCincoV().setText(lexico.getFiveCount()+"");
         DefaultTableModel modelo = new DefaultTableModel();
        inicio.getTablaResultados().setModel(modelo);
        //Anadir columnas
        modelo.addColumn("Entero");
        modelo.addColumn("Linea");
        modelo.addColumn("Columna");
        
        for (Entero entero : lexico.getListEntero()) {
            modelo.addRow(new Object[]{entero.getValue(),entero.getLine(),entero.getColumn()});
        }
    }
    
    
}
