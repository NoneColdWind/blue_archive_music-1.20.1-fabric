import json
list_file_name: list = [
    "bu_mian_zhi_ye",
    "constant_moderato",
    "constant_moderato_piano_arrange",
    "counting_stars",
    "dan_cheng_piao",
    "qi_feng_le",
    "re_aoharu",
    "unwelcome_school",
    "revolution_1"

]

list_SoundEvents_name: list = [
    "bu_mian_zhi_ye_music_disc",
    "constant_moderato_music_disc",
    "constant_moderato_piano_arrange_music_disc",
    "counting_stars_music_disc",
    "dan_cheng_piao_music_disc",
    "qi_feng_le_music_disc",
    "re_aoharu_music_disc",
    "unwelcome_school_music_disc",
    "revolution_1"
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
                f.write(f"  \"{list_SoundEvents_name[i]}\": " + "{\n    " + "\"sounds\": [\n      " + "{\n        " + f"\"name\": \"blue_archive_music_mod:{list_file_name[i]}\",\n        \"stream\": true\n      " + "}\n    ]\n  },\n")
            else:
                f.write(f"  \"{list_file_name[i]}\": " + "{\n    " + "\"sounds\": [\n      " + "{\n        " + f"\"name\": \"blue_archive_music_mod:{list_file_name[i]}\",\n        \"stream\": true\n      " + "}\n    ]\n  }\n")
        f.write("}")
