import json
from shutil import copy

BlueArchiveMusicNames: list = []

def gen_textures():
    _datas = json.load(open("data.json", "r", encoding="utf-8")).values()
    for data in _datas:
        BlueArchiveMusicNames.append(data["code"])

    for i in BlueArchiveMusicNames:
        try:
            copy("textures/item/music_disc_wait.png", "textures/item/" + i + ".png")
        except Exception as e:
            print(e)