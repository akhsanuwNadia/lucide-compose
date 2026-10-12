package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Headset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(6.0,11.0)
                curveTo(7.104569435119629,11.0,8.0,11.895430564880371,8.0,13.0)
                lineTo(8.0,16.0)
                curveTo(8.0,17.104570388793945,7.104569435119629,18.0,6.0,18.0)
                lineTo(5.0,18.0)
                curveTo(3.895430564880371,18.0,3.0,17.104570388793945,3.0,16.0)
                lineTo(3.0,11.0)
                close()
                moveTo(3.0,11.0)
                curveTo(2.985577344894409,7.775021553039551,4.697806358337402,4.788827896118164,7.488340854644775,3.172161102294922)
                curveTo(10.278875350952148,1.555493950843811,13.721124649047852,1.555493950843811,16.511659622192383,3.172161102294922)
                curveTo(19.30219268798828,4.788827896118164,21.014423370361328,7.775021553039551,21.0,11.0)
                moveTo(21.0,11.0)
                lineTo(21.0,16.0)
                curveTo(21.0,17.104570388793945,20.104570388793945,18.0,19.0,18.0)
                lineTo(18.0,18.0)
                curveTo(16.895429611206055,18.0,16.0,17.104570388793945,16.0,16.0)
                lineTo(16.0,13.0)
                curveTo(16.0,11.895430564880371,16.895429611206055,11.0,18.0,11.0)
                lineTo(21.0,11.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(21.0,18.0)
                curveTo(21.0,20.209138870239258,19.209138870239258,22.0,17.0,22.0)
                lineTo(12.0,22.0)
            }
}

public val LucideIcons.All.HeadsetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Headset: ImageVector
    @Composable get() = HeadsetDefinition.asImageVector()
