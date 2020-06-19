package net.xaviersala.eliminatoria;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.xaviersala.combatcavallers.combat.IResultat;
import net.xaviersala.combatcavallers.combat.IRing;
import net.xaviersala.combatcavallers.lluitador.ILluitador;

public class Eliminatoria {
	private static Logger logger = Logger.getLogger("Ring");

    
            
	
	private List<ILluitador> _lluitadors;
    private IRing _ring;
    
    public Eliminatoria(IRing ring, List<ILluitador> lluitadors)
    {
        _ring = ring;
        _lluitadors = lluitadors;
        logger.setLevel(Level.OFF);
    }

    public String Start()
    {
    	int numCombat = 1;
    	
        while (_lluitadors.size() > 1)
        {
            List<ILluitador> triats = new ArrayList<ILluitador>();
            triats.add(_lluitadors.get(0));
            triats.add(_lluitadors.get(1));
            _lluitadors.subList(0,2).clear();


            System.out.println("Combat " + numCombat + ": " + triats.get(0).getNom() + " vs " + triats.get(1).getNom());
            _lluitadors.remove(triats.get(0));
            _lluitadors.remove(triats.get(1));
            _ring.EntradaLluitadors(triats.get(0), triats.get(1));
            List<IResultat> resultat = _ring.Lluiteu();
            int guanya = 0;
            if (resultat.get(0).EsKo() || resultat.get(0).EstaEliminat())
            {
            	guanya = 1;
            }
            else
            {
                guanya = 0;
            }
            System.out.println("");
            _lluitadors.add(triats.get(guanya));
        	System.out.println("GUANYA: " + triats.get(guanya).getNom());
            
        	numCombat++;
            System.out.println("--------------------------------------------");


        }
        return _lluitadors.get(0).getNom();
    }
}
