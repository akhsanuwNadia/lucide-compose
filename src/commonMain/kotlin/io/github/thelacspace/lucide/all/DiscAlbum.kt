package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DiscAlbum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                curveTo(6.991987228393555,13.791654586791992,7.943225860595703,15.450651168823242,9.493522644042969,16.348798751831055)
                curveTo(11.043819427490234,17.2469482421875,12.956180572509766,17.2469482421875,14.506477355957031,16.348798751831055)
                curveTo(16.056774139404297,15.450651168823242,17.008012771606445,13.791654586791992,17.0,12.0)
                curveTo(17.008012771606445,10.208345413208008,16.056774139404297,8.549348831176758,14.506477355957031,7.651200771331787)
                curveTo(12.956180572509766,6.753052234649658,11.043819427490234,6.753052234649658,9.493522644042969,7.651200771331787)
                curveTo(7.943225860595703,8.549348831176758,6.991987228393555,10.208345413208008,7.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
}

public val LucideIcons.All.DiscAlbumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DiscAlbum: ImageVector
    @Composable get() = DiscAlbumDefinition.asImageVector()
