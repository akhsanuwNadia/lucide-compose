package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stamp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(14.0,8.5)
                curveTo(14.0,7.0,15.0,7.0,15.0,5.0)
                curveTo(14.992613792419434,3.3483827114105225,13.651634216308594,2.0133864879608154,12.0,2.0133864879608154)
                curveTo(10.348365783691406,2.0133864879608154,9.007386207580566,3.3483827114105225,9.0,5.0)
                curveTo(9.0,7.0,10.0,7.0,10.0,8.5)
                lineTo(10.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.5)
                curveTo(20.0,14.119288444519043,18.880712509155273,13.0,17.5,13.0)
                lineTo(6.5,13.0)
                curveTo(5.119287967681885,13.0,4.0,14.119288444519043,4.0,15.5)
                lineTo(4.0,17.0)
                curveTo(4.0,17.552284240722656,4.4477152824401855,18.0,5.0,18.0)
                lineTo(19.0,18.0)
                curveTo(19.552284240722656,18.0,20.0,17.552284240722656,20.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,22.0)
                lineTo(19.0,22.0)
            }
}

public val LucideIcons.All.StampDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stamp: ImageVector
    @Composable get() = StampDefinition.asImageVector()
