package fr.epsi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class connectorMSPR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path fileStaff = Path.of("./resources/staff.txt");
		List<String> lines = Files.readAllLines(fileStaff);
		for (String line : lines) {
			//On isole le nom
			String username = line;
			Path fileAgent = Path.of("./resources/"+username+".txt");
			List<String> linesAgent = Files.readAllLines(fileAgent);
			String nom;
			String prenom;
			String metier;
			String passwd;
			List<String> equpmt = new ArrayList<String>();
			
			nom =linesAgent.get(0);
			prenom =linesAgent.get(1);
			metier =linesAgent.get(2);
			passwd =linesAgent.get(3);
			for (int i = 5; i < linesAgent.size(); i++) {
				equpmt.add(linesAgent.get(i));
			}
			System.out.println(nom +" "+prenom+" "+metier+" "+passwd+" "+equpmt);
		
	}

	}}
