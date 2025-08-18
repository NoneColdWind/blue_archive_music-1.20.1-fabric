import os
import json

BlueArchiveMusic: dict[str, str] = {}

def gen_ogg():
    _datas = json.load(open("data.json", "r", encoding="utf-8")).values()
    for data in _datas:
        BlueArchiveMusic[data["code"]] = data["name"]

    a: list = list(BlueArchiveMusic.keys())
    b: list = list(BlueArchiveMusic.values())
    c: dict = {}

    for i in range(len(b)):
        if os.path.exists("sounds/" + b[i] + ".ogg"):
            try:
                os.rename("sounds/" + b[i] + ".ogg", "sounds/" + a[i] + ".ogg")
            except Exception as e:
                print(e)
        else:
            pass