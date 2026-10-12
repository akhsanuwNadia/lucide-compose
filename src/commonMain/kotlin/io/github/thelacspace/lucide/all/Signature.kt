package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Signature") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(18.8439998626709,15.131999969482422)
                curveTo(18.698322296142578,14.993871688842773,18.484155654907227,14.956265449523926,18.300134658813477,15.036502838134766)
                curveTo(18.116111755371094,15.116739273071289,17.9979248046875,15.2992582321167,18.0,15.5)
                lineTo(18.0,16.0)
                curveTo(18.0,16.552284240722656,17.552284240722656,17.0,17.0,17.0)
                lineTo(15.0,17.0)
                curveTo(14.447714805603027,17.0,14.0,16.552284240722656,14.0,16.0)
                curveTo(14.0,13.454999923706055,10.008999824523926,12.029999732971191,5.5,12.0)
                curveTo(4.123652458190918,12.006155014038086,3.011155366897583,13.123638153076172,3.011155366897583,14.5)
                curveTo(3.011155366897583,15.876361846923828,4.123652458190918,16.993844985961914,5.5,17.0)
                curveTo(9.652999877929688,17.0,10.244999885559082,5.704999923706055,11.208000183105469,3.5)
                curveTo(11.655380249023438,2.476391077041626,12.727558135986328,1.8738163709640503,13.834541320800781,2.0238568782806396)
                curveTo(14.941524505615234,2.1738972663879395,15.814620018005371,3.0401339530944824,15.973384857177734,4.145899772644043)
                curveTo(16.132150650024414,5.2516655921936035,15.53804874420166,6.328561305999756,14.517999649047852,6.783999919891357)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(21.0,21.0)
            }
}

public val LucideIcons.All.SignatureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Signature: ImageVector
    @Composable get() = SignatureDefinition.asImageVector()
