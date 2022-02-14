/*primer seccion: codigo de usuario*/
package flex;

import java.util.ArrayList;
import domain.Entero;

%%
/*segunda seccion: configuracion*/
%class lexicoEjercicio2
%unicode
%line
%column
%int
%public

/* Expresiones regulares creacion */
vocales =  a|e|i|o|u|A|E|I|O|U
consonantes = b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z|B|C|D|F|G|H|J|K|L|M|N|P|Q|R|S|T|V|W|X|Y|Z
unaV = ({consonantes})*({vocales})({consonantes})*
dosV = ({unaV})({vocales})({consonantes})*
tresV = {dosV}{unaV}
cuatroV = {dosV}{dosV}
cincoV = {dosV}{tresV}


%{
    private int oneV,twoV,treeV,fourV,fiveV = 0;
    private ArrayList<Entero> ListEntero = new ArrayList<>();
    
    private void oneCount(){oneV++;}
    private void twoCount(){twoV++;}
    private void treeCount(){treeV++;}
    private void fourCount(){fourV++;}
    private void fiveCount(){fiveV++;}
    private void inEntero(){ 
        System.out.println("Ingreso a registrar el entero");
        ListEntero.add(new Entero(yyline+1,yycolumn+1,yytext())); 
    }

    public int getOneCount() {return oneV;}
    public int getTwoCount() {return twoV;}
    public int getTreeCount() {return treeV;}
    public int getFourCount() {return fourV;}
    public int getFiveCount() {return fiveV;}
    public ArrayList<Entero> getListEntero() {return ListEntero;}
%}

%eof{
 System.out.println("No se acepto este caracter");
%eof}

%%

/*tercer seccion: reglase lexicas*/
 {unaV} { oneCount(); }
 {dosV} {twoCount();}
 {tresV} {treeCount(); }
 {cuatroV} {fourCount(); }
 {cincoV} {fiveCount();}
 ([0-9]+) { inEntero(); }

[^]                     {System.out.println("Se salta esta parte");}