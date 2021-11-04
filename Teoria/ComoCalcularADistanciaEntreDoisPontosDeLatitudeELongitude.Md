# Geolocalizaçao

## Como calcular a distância entre dois pontos de latitude e longitude
##### Escrito por: Robert Schrader

Como a Terra é uma esfera, determinar a distância entre dois lugares quaisquer é um pouco mais complicado do que traçar uma linha reta entre eles e medi-la; é preciso levar em consideração no cálculo a curvatura do planeta. Usando uma equação conhecida como "fórmula de Haversine", é possível calcular a distância entre duas localizações quaisquer, tomando como ponto de partida suas coordenadas de latitude e longitude. Será necessária uma calculadora científica, pois a fórmula de Haversine considera a curvatura empregando funções trigonométricas, as quais são muito complicadas de executar a mão.

### Step 1

Caso suas coordenadas não estejam no formato decimal, converta-as. Geralmente encontram-se as coordenadas de latitude e longitude no formato de "graus, minutos e segundos". 
Por exemplo, Los Angeles localiza-se na latitude 34° 3' 8'' N e na longitude 118° 14' 37'' W. 
Converta os minutos em graus multiplicando o segundo número (3 na latitude e 14 na longitude) por 1/60, obtendo 0,0500 e 0,2333, respectivamente. 
Converta os segundos em graus multiplicando o terceiro número por 1/60 para convertê-lo em minutos e novamente por 1/60 para converter os minutos em graus. 
Para a latitude do exemplo, oito segundos seria igual a 0,0022 e a longitude de 37 seria igual a 0,0103. Some os minutos e segundos e coloque-os atrás dos graus. 
Usando esse formato, a latitude torna-se 34,0522° N e a longitude torna-se 118,2436° W. Expresse números "N" e "E" com sinal positivo e números "S" e "W" com sinal negativo. 
As coordenadas decimais de Los Angeles são, portanto, 34,0522 e -118,2436.
 
### Step 2

Converta seus graus decimais em radianos usando a fórmula r = d*(π/180), onde π é igual a 3,14159. 
A latitude de Los Angeles em radianos é, portanto, (34,0522) (3,14159/180) ou (34,0522)(0,01745) ou 0,5942 radianos. 
A longitude é (-118,2436)(3,14159/180) ou (-118,2436)(0,01745) ou -2,0634 radianos.

### Step 3

Repita os passos para o destino. Para calcular a distância entre Los Angeles e Tóquio, por exemplo, converta as coordenadas de Tóquio -- 35° 41' 6'' N e 139° 45' 5'' E -- para o formato decimal -- 35,6850 e 139,7514 -- e então deste para radianos -- 0,6227 e 2,4387.

### Step 4

Calcule a mudança na latitude e longitude subtraindo das coordenadas da origem as do destino. A mudança de latitude entre Los Angeles e Tóquio é (0,5942 - 0,6227), ou 0,0285 radianos, lembrando que a distância não pode ser negativa. A mudança em longitude é (-2,0634 - 2,4387), ou 4,5021 radianos.

### Step 5

Substitua os valores dos locais na equação "a = [sen²(Δlat/2) + cos(lat1)] x cos(lat2) x sen²(Δlong/2)", tendo em mente que o "Δ" ("delta") significa "mudança" e "sen²x" significa (senx)². Para a distância entre Los Angeles e Tóquio: a = [sen²(0,285/2) + cos(0,5942)] x cos(0,6227) x sen²(4,5021/2) = [sen²(0,1425) + cos(0,5942)] x cos(0,6227) x sen²(2,2511) = [0,02017 + 0,82860] x 0,81231 x 0,60432 = 0,84877 x 0,81231 x 0,60432 = 0,41666.

### Step 6

Substitua o valor "a" em uma segunda equação intermediária: c = 2 x cot(√a/√(1−a)), onde "cot" é o inverso da função tangente, indicada como "tan^−1" em algumas calculadoras. Para a distância entre Los Angeles e Tóquio: c = 2 x cot(√0,41666/√(1−0,41666)) = 2 x cot(0,64550/0,76377) = 2 x cot(0,84515) = 2 x 0,70167 = 1,40334.

### Step 7

Compute a distância em quilômetros usando a fórmula d = R x c, onde "R" representa o raio da Terra (6,371 km). A distância entre Los Angeles e Tóquio é, então, 6,371 x 1,40334 ou 8,940 km.


[ArtigoOriginal](https://www.ehow.com.br/converter-scfm-m3-como_95546/)
