latexBasis = None
trenner = "\n\\newpage\n"+40*"%"+"\n" #trenner um einzelne Graphen voneinander leicht unterscheiden zu koennen
stellen={}#Dictionary
def loadInput():
    global latexBasis
    f = open("input.txt","r")
    latexBasis = f.read()
    f.close()
def write(output):
    f = open("output.txt","a")#Oeffnen im append mode
    f.write(output)
    f.close()
def replaceVariables():
    neu = latexBasis
    for key in stellen:
        variable = "#"+key+"#" #Variablen im Latex-Input gekennzeichnet mit #S01#,#S02#,...
        neu = neu.replace(variable,str(stellen[key]))

    return neu

def generateLatexOutput():
    global stellen
    #Anfangsbelegung
    stellen = {"S01":0,"S02":0,"S03":0,"S04":0,"S05":0,"S06":0,"S07":0,"S08":0,"S09":0,"S10":0,"S11":0,"S12":0,"S13":0,"S14":0,"S15":2,"S16":0}
    addGraph()
    stellen["S01"]=1
    addGraph()
    stellen["S01"]=0
    stellen["S05"] = 1
    addGraph()
    stellen["S15"] = 0
    stellen["S10"] = 2
    addGraph()
    stellen["S02"] = 1
    stellen["S03"] = 1
    stellen["S04"] = 1
    addGraph()
    stellen["S02"] = 0
    stellen["S03"] = 0
    stellen["S04"] = 0
    stellen["S11"] = 1
    stellen["S10"] = 1
    stellen["S15"] = 1
    addGraph()
    stellen["S10"] = 0
    stellen["S12"] = 1
    stellen["S11"] = 0
    stellen["S15"] = 2
    addGraph()
    stellen["S12"] = 0
    stellen["S13"] = 1
    addGraph()
    stellen["S13"] = 0
    stellen["S14"] = 1
    stellen["S15"] = 1
    addGraph()
    stellen["S08"] = 1
    stellen["S09"] = 1
    addGraph()
    stellen["S09"] = 0
    stellen["S08"] = 0
    stellen["S14"] = 0
    stellen["S15"] = 2
    stellen["S16"] = 1
    addGraph()
    stellen["S16"] = 0
    stellen["S06"] = 1
    stellen["S05"] = 0
    stellen["S07"] = 8
    addGraph()
    stellen["S06"] = 0
    addGraph()


def addGraph():
    write(replaceVariables()+trenner)

loadInput()
generateLatexOutput()

