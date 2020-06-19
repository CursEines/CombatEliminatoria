from ILluitador import ILluitador
import IRing
from Resultat import IResultat


class Eliminatoria:

    def __init__(self, ring, lluitadors: list):
        self._ring = ring
        self._lluitadors = lluitadors

    def Start(self):
        numCombat = 1
        while len(self._lluitadors) > 1:
            triats = [self._lluitadors[0], self._lluitadors[1]]
            self._lluitadors = self._lluitadors[2:]

            print("Combat ", numCombat, ": ",
                  triats[0].get_nom(), " vs ", triats[1].get_nom())

            self._ring.EntradaLluitadors(triats[0], triats[1])
            resultat = self._ring.Lluiteu()

            guanyador = 0
            if resultat[0].es_Ko or resultat[0].esta_eliminat():
                guanyador = 1

            print("GUANYADOR: ", triats[guanyador].get_nom())

            self._lluitadors.append(triats[guanyador])

            numCombat = numCombat + 1

            print("--------------------------------------------")

        return self._lluitadors[0].get_nom()
