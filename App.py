from LluitadorRandom import LluitadorRandom
from IRing import IRing
from Ring import Ring
from Eliminatoria import Eliminatoria

lluitadors = []
lluitadors.append(LluitadorRandom("Tremendo"))
lluitadors.append(LluitadorRandom("Matxacaboles"))
lluitadors.append(LluitadorRandom("Mataparents"))
lluitadors.append(LluitadorRandom("MartellDeCervells"))
lluitadors.append(LluitadorRandom("Potadelefant"))
lluitadors.append(LluitadorRandom("Furia Salvatge"))
lluitadors.append(LluitadorRandom("Punys de foc"))
lluitadors.append(LluitadorRandom("Arrencaqueixals"))
lluitadors.append(LluitadorRandom("Trencarroques"))
lluitadors.append(LluitadorRandom("Fabrica de sopes"))
lluitadors.append(LluitadorRandom("Trinxador"))
lluitadors.append(LluitadorRandom("Enmascarat"))

ring = Ring()

eliminatoria = Eliminatoria(ring, lluitadors)
guanyador = eliminatoria.Start()
print("CAMPIÓ ", guanyador)
