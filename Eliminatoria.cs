using System.Collections.Generic;
using CombatCavallers.Lluitador;
using CombatCavallers.Combat;
using System.Linq;

namespace Combat
{
    public class Eliminatoria
    {
        private readonly List<ILluitador> _lluitadors;
        private readonly IRing _ring;
        public Eliminatoria(IRing ring, IEnumerable<ILluitador> lluitadors)
        {
            _ring = ring;
            _lluitadors = lluitadors.ToList();
        }

        public string Start()
        {
            while (_lluitadors.Count() > 1)
            {
                var triats = _lluitadors.Take(2).ToList();
                _lluitadors.RemoveRange(0, 2);
                _ring.EntradaLluitadors(triats[0], triats[1]);
                var resultat = _ring.Lluiteu();

                if (resultat.First().EsKo())
                {
                    System.Console.WriteLine($"\n\n GUANYA: {triats[1].Nom} \n\n");
                    _lluitadors.Add(triats[1]);
                }
                else
                {
                    System.Console.WriteLine($"\n\n GUANYA: {triats[0].Nom} \n\n");
                    _lluitadors.Add(triats[0]);                    
                }
                

            }
            return _lluitadors.First().Nom;
        }
    }
}