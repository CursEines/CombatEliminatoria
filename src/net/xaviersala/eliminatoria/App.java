package net.xaviersala.eliminatoria;

import java.util.ArrayList;
import java.util.List;

import net.xaviersala.combatcavallers.combat.IRing;
import net.xaviersala.combatcavallers.combat.Ring;
import net.xaviersala.combatcavallers.lluitador.ILluitador;
import net.xaviersala.combatcavallers.lluitador.LLuitadorRandom;

public class App {

	public static void main(String[] args) {
		List<ILluitador> lluitadors = new ArrayList<ILluitador>();
		lluitadors.add(new LLuitadorRandom("Tremendo"));
		lluitadors.add(new LLuitadorRandom("Matxacaboles"));
		lluitadors.add(new LLuitadorRandom("Mataparents"));
		lluitadors.add(new LLuitadorRandom("MartellDeCervells"));
		lluitadors.add(new LLuitadorRandom("Potadelefant"));
		lluitadors.add(new LLuitadorRandom("Furia Salvatge"));
		lluitadors.add(new LLuitadorRandom("Punys de foc"));
		lluitadors.add(new LLuitadorRandom("Arrencaqueixals"));
		lluitadors.add(new LLuitadorRandom("Trencarroques"));
		lluitadors.add(new LLuitadorRandom("Fabrica de sopes"));
		lluitadors.add(new LLuitadorRandom("Trinxador"));
		lluitadors.add(new LLuitadorRandom("Enmascarat"));
		
		IRing ring = new Ring();
		
		Eliminatoria eliminatoria = new Eliminatoria(ring, lluitadors);
		String guanyador = eliminatoria.Start();
		
		System.out.println("CAMPIÓ : " + guanyador);
		

	}

}
