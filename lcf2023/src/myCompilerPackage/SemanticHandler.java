package myCompilerPackage;

import java.util.ArrayList;
import java.util.Hashtable;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import myCompilerPackage.util.Variable;

/* ***********************************
 * Questa classe realizza tutti i controlli semantici del nostro compilatore.
*********** DA COMPLEATARE ***********
Aggiungere l'analisi semantica per gestire scope differenti 
cio� una variabile dichiarata in un metodo pu� essere refenziata solo in quel metodo
mentre una variabile globale pu� essere  referenziata ovunque.
Inoltre a aggiungere i controli sui nomi dei metodi (gestendo le diverse segnature...)
Aggiungere anche i controlli per i riferimenti a metodo

Infine fare in modo che le liste degli errori e degli warning siano ordinate in base alle coordinate
(non � garantito che errori e warning vengano rilevati sequenzialmente 
(es: facciamo riferimento ad metodo dichiarato dopo. Come si fa il controllo? Quando lo gestisco?)
*********************************** */


public class SemanticHandler {
// ****** codici per i messaggi d'errore
	public static int LEXICAL_ERROR 		= 0;
	public static int SYNTAX_ERROR 			= 1;
	public static int DIVSION_BY_ZERO_ERROR = 10;
	public static int ALREADY_DEF_ERROR 	= 11;
	public static int NO_DECLARATION_ERROR 	= 12;
	
	public static int FIRST_WARNING 		= 100;
	public static int NO_REF_WARNING 		= 101;
	
// ****** attributi semantici globali
	Hashtable<String, Variable> symbolTable;
	ArrayList<String> errors;
	ArrayList<String> warnings;
	StringBuffer tradPolInfissa;
	StringBuffer tradPolPostfissa;
	StringBuffer translation;
	
// ****** costrutture
	public SemanticHandler () {
		symbolTable = new Hashtable<String, Variable> (103);
		errors = new ArrayList<String>();
		warnings = new ArrayList<String>();
		tradPolInfissa = new StringBuffer ();
		tradPolPostfissa = new StringBuffer ();
		translation = new StringBuffer ();
	}
	
// *********************** metodi di pubblico interesse
	public String getTranslation () {
		return translation.toString();
	}

	public boolean hasErrors () {
		return (errors.size()!=0);
	}
	public ArrayList<String> getErrors () {
		return errors;
	}
	public int getNErrors () {
		return errors.size();
	}

	public boolean hasWarnings () {
		return (warnings.size()!=0);
	}
	public ArrayList<String> getWarnings () {
		return warnings;
	}
	public int getNWarnings () {
		return warnings.size();
	}
// ----------------------- fine metodi di pubblico interesse

	
// *********************** gestione degli errori
	public void handleError(String[] tokenNames, Token tk, RecognitionException e, String hdr, String msg) {
		// caso banale		
		//errors.add("ERRORE SINTATTICO \t *" + hdr + " *\t* " + msg );

		
		/*	distinzione tra errori lessicali e sintattici	
		if (tk.getType() == SimpleJava2023Lexer.ERROR_TOKEN)
			errors.add("ERRORE LESSICALE \t" + hdr + "\t" + msg );
		else
			errors.add("ERRORE SINTATTICO \t" + hdr + "\t" + msg );
		 */	
		
		// Cominciamo a gestire noi gli errori...
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		if (tk.getType() == SimpleJava2023Lexer.ERROR_TOKEN) 
			errors.add("Errore Lessicale in " + coors + ":\t" +msg+"\t"+tk.getText());
		else
			errors.add("Errore Sintattico in " + coors + ":\t" +msg+"\t"+tk.getText());
	}
	
	// gestore gli errori semantici
	void addError (int errCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		
		String msg = "Errore Semantico in " + coors + ":\t";
		if (errCode == DIVSION_BY_ZERO_ERROR)
			msg += "Divisione per 0";
 		else if (errCode == ALREADY_DEF_ERROR)
 			msg += "La variabile '" + str + "' � gi� stata dichiarata";
 		else if (errCode == NO_DECLARATION_ERROR)
 			msg += "La variabile '" + str + "' non � stata dichiarata";
 		errors.add(msg);
	}

	void addWarning (int warnCode, Token tk) {
		String str = tk.getText();
		String coors = "[" + tk.getLine() + ", " + (tk.getCharPositionInLine()+1) + "]";
		String msg = "Warning in " + coors + ":\t";
		
		if (warnCode == NO_REF_WARNING)
			msg += "La variabile '" + str + "' NON � stata ancora dichiarata";

		warnings.add (msg);
		
	}
// ----------------------- fine gestione degli errori
	

	
	public boolean isVarDeclared (String name) {
		return symbolTable.containsKey(name);
	}


	public void varDeclaration(String varType, Token varName) {
		String name = varName.getText();
		if (isVarDeclared(name))
			addError (ALREADY_DEF_ERROR, varName);
		else {
			Variable var = new Variable (varType,name);
			symbolTable.put(name, var);
		}
	}

// se si fa riferimento ad una variabile che non � ancora stata definita
// ritorniamo un oggetto Variable che contiene solo il nome della variabile (il cui valore numerico � 0
	public Variable checkVarDeclaration(Token varName) {
		String name = varName.getText();
		Variable x = new Variable (name);
		if (!isVarDeclared(name)) {
			addWarning(NO_REF_WARNING, varName);
		}
		else 
			x = symbolTable.get(name);
		return x;
	}

	public void assignValue(Token v, Variable e) {
		if (symbolTable.containsKey(v.getText())) {
			Variable x = symbolTable.get(v.getText());
			x.assignValue (e);
			translation.append(v.getText() + " ==\t" + x.value + "\t= " + e.polPostfissa + "\n");
		}
		else {
			addError (NO_DECLARATION_ERROR, v);
		}	
	}
	
	// implementa la somma o sottrazione tra due termini
	// gestisce anche le notazioni polacche prefisse e postfisse
	public Variable doAdd(Variable t1, Variable t2, Token o) {
		Variable x = null;
		if (o.getType()==SimpleJava2023Lexer.ADD) {
			x = new Variable ("" + (t1.getNumericValue() + 
									t2.getNumericValue()));
			x.polPrefissa = "+ " + t1.polPrefissa.trim() + " " + t2.polPrefissa.trim();
			x.polPostfissa = t1.polPostfissa.trim() + " " + t2.polPostfissa.trim() + " +";
		}
		else {
			x = new Variable ("" + (t1.getNumericValue() - 
									t2.getNumericValue()));
			x.polPrefissa = "- " + t1.polPrefissa.trim() + " " + t2.polPrefissa.trim();
			x.polPostfissa = t1.polPostfissa.trim() + " " + t2.polPostfissa.trim() + " -";
		}
		return x;
	}

	// implementa la moltiplicazione o divisione tra due fattori
	// ed evita le divisioni per zero
	// gestisce anche le notazioni polacche prefisse e postfisse
	public Variable doMul(Variable f1, Variable f2, Token o) {
		Variable x = null;
		if (o.getType()==SimpleJava2023Lexer.MUL) {
			x = new Variable ("" + (f1.getNumericValue() * 
									f2.getNumericValue()));
			x.polPrefissa = "* " + f1.polPrefissa.trim() + " " + f2.polPrefissa.trim();
			x.polPostfissa = f1.polPostfissa.trim() + " " + f2.polPostfissa.trim() + " *";
		}
		else {			
			if (f2.getNumericValue() == 0)  {
				addError (DIVSION_BY_ZERO_ERROR, o);
				x = new Variable ("N/A");
			}
			else {
				double res =f1.getNumericValue() / f2.getNumericValue();
				x = new Variable ("" +res);
			}
			x.polPrefissa = "/ " + f1.polPrefissa.trim() + " " + f2.polPrefissa.trim();
			x.polPostfissa = f1.polPostfissa.trim() + " " + f2.polPostfissa.trim() + " /";
		}
		return x;
	}

	// converte un token numerico in un oggetto Variable che contiene solo il valore
	public Variable handleNumber(Token n) {
		Variable x = new Variable (n.getText());
		return x;
	}


	// il primo termine di un'espressione potrebbe avere o meno il segno... e se � negativo bisogna inverire il valore t1
	public Variable manageFirtTerm(Variable t1, Token o) {
		Variable x = t1;
		if (o != null && "-".equals(o.getText()))
			x = new Variable ("-"+t1.value);
		return x;
	}

	// da completare: attenzione che il token "public" potrebbe essere nullo
	public void manageClassName(Token pub, Token className) {
		// TODO Auto-generated method stub		
	}
	
	// da compleatare: qui gestiamo la dichiarazione di un nuovo metodo
	// problemi che fare se ci sono due metodi con lo stesso nome?
	// che fare se ci sono 2 metodi con lo stesso nome, ma segnature differenti? come li gestiamo?
	// che fare se il metodo ha lo stesso nome di una variabile globale? � un problema oppure no?
	// ... per cui probabilmente questo controllo ha bisogno di pi� informazioni...
	public void manageNewMethodDeclaration(Token m) {
		// TODO Auto-generated method stub
		
	}

	// da completare: dobbiamo verificare che il metodo al quale si fa riferimento sia stato dichiarato
	// ma che succede se � stato dichiarato dopo il riferimento?
	// inoltre bisognerebbe controllare che i parametri in ingresso siano dello stesso numero (e tipo) 
	// di quelli previsiti dalla segnatura quando il metodo � stato dichiarato
	// per cui probabilmente questo controllo ha bisogno di pi� informazioni...
	public void checkMethodReference(Token m) {
		// TODO Auto-generated method stub
		
	}


}
