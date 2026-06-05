import json
import os

from override_consts import menu

def gen_override_sounds():

    data: dict = json.loads(open("sounds.json").read().replace("\\n", ""))
    
    out_of_indexes = [
        "music.creative",
        "music.game",
        "music.menu",
        "music.credits",
        "music.dragon",
        "music.end"
    ]
    
    keys = list(data.keys())
    
    need_to_be_modified = []
    
    for i in keys:
        if "music." in i and i not in out_of_indexes:
            need_to_be_modified.append(i)
            

    music_creative = data["music.creative"]

    music_game = data["music.game"]

    music_menu = data["music.menu"]

    for i in menu:
        music_menu["sounds"].append(
            {
                "name": f"blue_archive_music:music/{i}",
                "stream": True,
                "volume": 0.4
            }
        )


    _list = os.listdir("assets\\blue_archive_music\\sounds\\music")

    for i in _list:
        if i.endswith(".ogg"):
            
            _dict = {
                "name": f"blue_archive_music:music/{i.replace('.ogg', '')}",
                "stream": True,
                "volume": 0.4
            }
        
            music_creative["sounds"].append(_dict)
            music_game["sounds"].append(_dict)
            
            for j in need_to_be_modified:
                data[j]["sounds"].append(_dict)
            
        
    data["music.creative"] = music_creative
    data["music.game"] = music_game
    data["music.menu"] = music_menu

    with open("assets\\minecraft\\sounds.json", "w+") as f:
        json.dump(data, f, indent=2)


if __name__ == "__main__":
    gen_override_sounds()
