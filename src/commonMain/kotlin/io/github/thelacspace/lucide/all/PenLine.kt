package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.173999786376953,6.811999797821045)
                curveTo(22.266592025756836,5.709867000579834,22.262840270996094,3.93190336227417,21.165603637695312,2.834392786026001)
                curveTo(20.068368911743164,1.736882209777832,18.290407180786133,1.732683539390564,17.187999725341797,2.8249998092651367)
                lineTo(3.8420000076293945,16.173999786376953)
                curveTo(3.6098194122314453,16.405500411987305,3.4381136894226074,16.69053077697754,3.3420000076293945,17.003999710083008)
                lineTo(2.0209999084472656,21.355998992919922)
                curveTo(1.9683454036712646,21.532194137573242,2.0166585445404053,21.723072052001953,2.146796226501465,21.85300064086914)
                curveTo(2.2769339084625244,21.982929229736328,2.4678895473480225,22.03093719482422,2.6440000534057617,21.977998733520508)
                lineTo(6.997000217437744,20.65799903869629)
                curveTo(7.310169219970703,20.5627498626709,7.595173358917236,20.392091751098633,7.827000141143799,20.160999298095703)
                close()
            }
}

public val LucideIcons.All.PenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PenLine: ImageVector
    @Composable get() = PenLineDefinition.asImageVector()
