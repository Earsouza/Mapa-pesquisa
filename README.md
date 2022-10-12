# Mapa-pesquisa
Algorítimo e Estrutura de Dados - Atividade HashMap

/*Descrição:
Faça uma classe de consulta de estados dado número de DDD.
Com isso o usuário deve informar qual o DDD deseja consultar e seu programa deverá responder sigla - estado que se encontra o DDD pesquisado.
Por exemplo:
Qual DDD deseja pesquisar?
61
- DDD 61 é do Distrito Federal - DF
----

Os mapas que terão as informações são os seguintes exemplo:
HashMap<String, String> mapa1 = new HashMap<>();
HashMap<String, Integer[]> mapa2 = new HashMap<>();

mapa1.put("AC","Acre")
mapa2.put("AC",new Integer[]{68})



Mapa 1
Chave = Sigla 2 letras
Valor = nome do estado
Acre - AC;
Alagoas - AL;
Amapá - AP;
Amazonas - AM;
Bahia - BA;
Ceará - CE;
Distrito Federal - DF;
Espírito Santo - ES;
Goiás - GO;
Maranhão - MA;
Mato Grosso - MT;
Mato Grosso do Sul - MS;
Minas Gerais - MG;
Pará - PA;
Paraíba - PB;
Paraná - PR;
Pernambuco - PE;
Piauí - PI;
Rio de Janeiro - RJ;
Rio Grande do Norte - RN;
Rio Grande do Sul - RS;
Rondônia - RO;
Roraima - RR;
Santa Catarina - SC;
São Paulo - SP;
Sergipe - SE;
Tocantins - TO.

 

Mapa 2
Chave = Sigla 2 letras
Valor = Array de String com os DDDs

 

Centro-Oeste
? Distrito Federal (61)
? Goiás (62 e 64)
? Mato Grosso (65 e 66)
? Mato Grosso do Sul (67)
 
Nordeste
? Alagoas (82)
? Bahia (71, 73, 74, 75 e 77)
? Ceará (85 e 88)
? Maranhão (98 e 99)
? Paraíba (83)
? Pernambuco (81 e 87)
? Piauí (86 e 89)
? Rio Grande do Norte (84)
? Sergipe (79)
 
Norte
? Acre (68)
? Amapá (96)
? Amazonas (92 e 97)
? Pará (91, 93 e 94)
? Rondônia (69)
? Roraima (95)
? Tocantins (63)

Sudeste

? Espírito Santo (27 e 28)
? Minas Gerais (31, 32, 33, 34, 35, 37 e 38)
? Rio de Janeiro (21, 22 e 24)
? São Paulo (11, 12, 13, 14, 15, 16, 17, 18 e 19)
 

Sul

? Paraná (41, 42, 43, 44, 45 e 46)
? Rio Grande do Sul (51, 53, 54 e 55)
? Santa Catarina (47, 48 e 49)*/
