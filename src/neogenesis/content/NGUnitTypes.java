package neogenesis.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.ai.*;
import mindustry.ai.types.*;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.content.StatusEffects;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;
import mindustry.type.weapons.*;
import mindustry.world.meta.*;

import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.*;
import static arc.math.Angles.*;
import static mindustry.Vars.*;

public class NGUnitTypes{
    //region standard

    //mech
    public static UnitType decade;
    //mech, legacy

    //endregion

    public static void load(){
        //region ground attack

        decade = new UnitType("5-a-01-decade"){{
            speed = 0.5f;
            hitSize = 8f;
            health = 150;
            canDrown = true;
            mechStepParticles = false;
            stepShake = 0;
            mechFrontSway = 0.2f;
            mechSideSway = 0.1f;
            singleTarget = false;
            rotateSpeed = 10f;
            ammoType = new PowerAmmoType(400);
            weapons.add(new Weapon("large-weapon"){{
                reload = 45f;
                x = 0f;
                y = 0f;
                top = false;
                mirror=false;
                shoot= new ShootHelix(){{
                    scl =2f;
                    mag=2f;
                    offset=0;
                }};
                bullet = new BasicBulletType(6f, 12){{
                    width = 7f;
                    height = 9f;
                    lifetime = 20f;
                }};
            }});
        }};

        //endregion
    }
}
