package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,9.807000160217285)
                lineTo(20.0,6.0)
                curveTo(20.0,5.4477152824401855,19.552284240722656,5.0,19.0,5.0)
                curveTo(17.0,5.0,14.510000228881836,3.809999942779541,12.760000228881836,2.2799999713897705)
                curveTo(12.32232666015625,1.9060670137405396,11.67767333984375,1.9060670137405396,11.239999771118164,2.2799999713897705)
                curveTo(9.5,3.799999952316284,7.0,5.0,5.0,5.0)
                curveTo(4.4477152824401855,5.0,4.0,5.4477152824401855,4.0,6.0)
                lineTo(4.0,13.0)
                curveTo(4.0,16.880001068115234,6.107000350952148,19.253999710083008,9.0,20.79599952697754)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,17.0)
                lineTo(19.0,15.0)
                curveTo(18.995075225830078,13.898921966552734,18.101089477539062,13.00892448425293,17.0,13.00892448425293)
                curveTo(15.898910522460938,13.00892448425293,15.004923820495605,13.898921966552734,15.0,15.0)
                lineTo(15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.0)
                lineTo(20.0,17.0)
                lineTo(21.0,17.0)
                lineTo(21.0,22.0)
                lineTo(20.0,22.0)
                lineTo(14.0,22.0)
                lineTo(13.0,22.0)
                lineTo(13.0,17.0)
                lineTo(14.0,17.0)
                close()
            }
}

public val LucideIcons.All.ShieldLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldLock: ImageVector
    @Composable get() = ShieldLockDefinition.asImageVector()
