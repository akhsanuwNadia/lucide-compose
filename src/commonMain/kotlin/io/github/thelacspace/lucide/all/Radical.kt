package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(6.279999732971191,12.0)
                curveTo(6.710238933563232,12.000327110290527,7.092044353485107,12.275806427001953,7.227999687194824,12.684000015258789)
                lineTo(9.526000022888184,20.618000030517578)
                curveTo(9.59737777709961,20.82915496826172,9.79990291595459,20.967565536499023,10.022562980651855,20.957359313964844)
                curveTo(10.245222091674805,20.947154998779297,10.434237480163574,20.79079818725586,10.486000061035156,20.573999404907227)
                lineTo(13.819999694824219,4.770999908447266)
                curveTo(13.926148414611816,4.319783687591553,14.328466415405273,4.000661373138428,14.791999816894531,4.0)
                lineTo(21.0,4.0)
            }
}

public val LucideIcons.All.RadicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radical: ImageVector
    @Composable get() = RadicalDefinition.asImageVector()
