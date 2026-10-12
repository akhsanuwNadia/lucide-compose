package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlameKindling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                curveTo(13.0,5.0,14.5,5.5,15.5,6.5)
                curveTo(16.44207191467285,7.423152446746826,16.98121452331543,8.681153297424316,17.0,10.0)
                curveTo(17.008012771606445,11.791654586791992,16.056774139404297,13.450651168823242,14.506477355957031,14.348799705505371)
                curveTo(12.956180572509766,15.2469482421875,11.043819427490234,15.2469482421875,9.493522644042969,14.348799705505371)
                curveTo(7.943225860595703,13.450651168823242,6.991987228393555,11.791654586791992,7.0,10.0)
                curveTo(7.0,9.699999809265137,7.0,9.399999618530273,7.099999904632568,9.100000381469727)
                curveTo(7.331643104553223,9.910666465759277,8.04678726196289,10.489004135131836,8.887974739074707,10.545938491821289)
                curveTo(9.729162216186523,10.602872848510742,10.515714645385742,10.126174926757812,10.85448169708252,9.354116439819336)
                curveTo(11.193249702453613,8.58205795288086,11.011467933654785,7.680469036102295,10.399999618530273,7.100000381469727)
                curveTo(8.0,4.5,11.0,2.0,12.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,22.0)
                lineTo(19.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,18.0)
                lineTo(19.0,22.0)
            }
}

public val LucideIcons.All.FlameKindlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlameKindling: ImageVector
    @Composable get() = FlameKindlingDefinition.asImageVector()
