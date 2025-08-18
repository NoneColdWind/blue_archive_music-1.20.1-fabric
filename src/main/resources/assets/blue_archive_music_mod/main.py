from pysrc.json_gen import gen_data_json
from pysrc.sounds_json_gen import gen_sounds_json
from pysrc.texture_gen import gen_textures
from pysrc.ogg_gen import gen_ogg

if __name__ == "__main__":
    gen_data_json()
    gen_sounds_json()
    gen_textures()
    gen_ogg()