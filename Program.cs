using CombatCavallers.Combat;
using CombatCavallers.Lluitador;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using Microsoft.Extensions.Logging.Abstractions;
using Microsoft.Extensions.Logging.Console;
using System;
using System.Collections.Generic;

namespace Combat
{
    class Program
    {
        static void Main(string[] args)
        {
            // Obtenir el Ring per injecció de dependències
            

            var ring = new Ring(new Logger<Ring>(new NullLoggerFactory()));

            var lluitadors = new List<ILluitador> {
                new LluitadorRandom("Totxo"),
                new LluitadorRandom("Matxaca"),
                new LluitadorRandom("DestrossaCervells"),
                new LluitadorRandom("Guerrilleru")
            };

            var eliminatoria = new Eliminatoria(ring, lluitadors);
            Console.WriteLine($"GUANYA EL CAMPIONAT : {eliminatoria.Start()}");
        }

    }
}
