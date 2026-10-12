package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ampersands") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,17.0)
                curveTo(5.0,14.0,3.0,10.0,3.0,8.0)
                curveTo(3.0049242973327637,6.898921966552734,3.8989107608795166,6.00892448425293,5.0,6.00892448425293)
                curveTo(6.101089000701904,6.00892448425293,6.995075702667236,6.898921966552734,7.0,8.0)
                curveTo(7.0,10.5,2.0,10.5,2.0,14.0)
                curveTo(2.0,15.699999809265137,3.299999952316284,17.0,5.0,17.0)
                curveTo(7.800000190734863,17.0,10.0,14.800000190734863,10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                curveTo(17.0,14.0,15.0,10.0,15.0,8.0)
                curveTo(15.004923820495605,6.898921966552734,15.898910522460938,6.00892448425293,17.0,6.00892448425293)
                curveTo(18.101089477539062,6.00892448425293,18.995075225830078,6.898921966552734,19.0,8.0)
                curveTo(19.0,10.5,14.0,10.5,14.0,14.0)
                curveTo(14.0,15.699999809265137,15.300000190734863,17.0,17.0,17.0)
                curveTo(19.799999237060547,17.0,22.0,14.800000190734863,22.0,12.0)
            }
}

public val LucideIcons.All.AmpersandsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ampersands: ImageVector
    @Composable get() = AmpersandsDefinition.asImageVector()
