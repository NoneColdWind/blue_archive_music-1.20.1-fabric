odata = []
with open("pysrc\\writer\\writer.txt", "r") as f:
    odata = f.readlines()

data = []
for i in odata:
    if i != None and i != "\n":
        data.append(i.replace("\n", ""))

MitsukiyoStart = data.index("#Mitsukiyo")
NorStart = data.index("#Nor")
KARUTStart = data.index("#KARUT")

Mitsukiyo = []
Nor = []
KARUT = []

for i in range(MitsukiyoStart + 1, NorStart):
    Mitsukiyo.append(str(data[i]))
for i in range(NorStart + 1, KARUTStart):
    Nor.append(str(data[i]))
for i in range(KARUTStart + 1, len(data)):
    KARUT.append(str(data[i]))
