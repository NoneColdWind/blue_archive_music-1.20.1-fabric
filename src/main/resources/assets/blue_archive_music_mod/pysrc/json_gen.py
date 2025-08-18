import json
from pysrc.music.BlueArchiveMusicDictionary import *
from pysrc.length.BlueArchiveMusicLengthDictionary import *
from pysrc.writer.MitsukiyoList import *
from pysrc.writer.NorList import *
from pysrc.writer.KARUTList import *

def gen_data_json():
    list_code: list = BlueArchiveMusic.keys()
    datas: dict[str, dict[str, str]] = {}
    for code in list_code:
        data: dict[str, str] = {}
        data["code"] = code
        data["name"] = BlueArchiveMusic[code]
        data["duration"] = BlueArchiveMusicLength[code]
        if BlueArchiveMusic[code] in Mitsukiyo:
            data["writer"] = "Mitsukiyo"
        elif BlueArchiveMusic[code] in Nor:
            data["writer"] = "Nor"
        elif BlueArchiveMusic[code] in KARUT:
            data["writer"] = "KARUT"
        else:
            data["writer"] = "Unknown"
        datas[code] = data
    with open("data.json", "w", encoding="utf-8") as f:
        json.dump(datas, f, ensure_ascii=False, indent=4)
