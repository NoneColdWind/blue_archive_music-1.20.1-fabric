import json
list_file_name: list = [


]

list_SoundEvents_name: list = [

]

BlueArchiveMusicNames: list = []

def gen_sounds_json():
    _datas = json.load(open("data.json", "r", encoding="utf-8")).values()
    for data in _datas:
        BlueArchiveMusicNames.append(data["code"])

    for i in range(len(BlueArchiveMusicNames)):
        list_SoundEvents_name.append(BlueArchiveMusicNames[i])
        list_file_name.append(BlueArchiveMusicNames[i])

    with open("sounds.json", "w") as f:
        f.write("{\n")
        for i in range(len(list_SoundEvents_name)):
            if i != len(list_file_name) - 1:
                f.write(f"  \"cn.ncw.blue_archive_music.music.{list_SoundEvents_name[i]}\": " + "{\n    " + "\"category\": \"music\"," + "\n    " + "\"sounds\": [\n      " + "{\n        " + f"\"name\": \"blue_archive_music_mod:music/{list_file_name[i]}\",\n        \"stream\": true\n      " + "}\n    ]\n  },\n")
            else:
                f.write(f"  \"cn.ncw.blue_archive_music.music.{list_file_name[i]}\": " + "{\n    " + "\"category\": \"music\"," + "\n    " + "\"sounds\": [\n      " + "{\n        " + f"\"name\": \"blue_archive_music_mod:music/{list_file_name[i]}\",\n        \"stream\": true\n      " + "}\n    ]\n  }\n")
        f.write("}")
