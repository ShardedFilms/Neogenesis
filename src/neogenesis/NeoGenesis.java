package neogenesis;

import arc.*;
import arc.assets.*;
import arc.assets.loaders.*;
import arc.audio.*;
import arc.files.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.core.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.maps.*;
import mindustry.mod.*;
import mindustry.net.*;
import mindustry.ui.*;
import neogenesis.content.*;

import static arc.Core.*;
import static mindustry.Vars.*;

public class NeoGenesis extends Mod{
	
	public AlphaPlus(){
        Log.info("Loaded Alpha-Plus mod constructor.");
    }

    @Override
    public void loadContent(){
    	new NGBlocks().load();
        Log.info("Loading some example content.");
    }
    
}
